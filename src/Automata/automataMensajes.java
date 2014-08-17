package Automata;
import Objects.message;
import Modelo.conexion;

public class automataMensajes {
    conexion con;
    private message msg;
    private String sales="(.*)(compra|COMPRA|vend|VEND|vent|VENT)(.*)",info="(.*)(info|INFO|conoce|CONOCE|sabe|SABE)(.*)";
    
    public automataMensajes(String e,String d,String a,String m){
        String r="";
        msg=new message(e,d,a,m);
        con=new conexion();
        if(verify()){
            if((r=determine())!=null){
                if(r=="ambos"){
                    inboxTo(this.findUser("sales@empresa.com"));
                    inboxTo(this.findUser("info@empresa.com"));
                    inboxTo(this.findUser("contacto@empresa.com"));
                }else{
                    inboxTo(this.findUser(r));
                    inboxTo(this.findUser("contacto@empresa.com"));
                }
            }else if(findUser(msg.emisor())==null){
                System.out.println("no matcho con nada");
                String[] val=new String[2];
                val[0]=msg.emisor();
                val[1]="12345678";
                con.agregar("usuarios", "user,pass", val);
                inboxTo(this.findUser(msg.emisor()),"Empresa.com response","Querido "+msg.emisor()+" su mensaje tiene insuficiente informacion para ser procesado");
            }else{
                inboxTo(this.findUser(msg.emisor()),"Empresa.com response","Querido "+msg.emisor()+" su mensaje tiene insuficiente informacion para ser procesado");
            }
        }else if(findUser(msg.destinatario())==null){ 
            System.out.println("Este mensaje no es para nuestra empresa");
            String[] val=new String[2];
            val[0]=msg.destinatario();
            val[1]="12345678";
            con.agregar("usuarios", "user,pass", val);
            inboxTo(this.findUser(msg.destinatario()),msg.asunto(),msg.mensaje());
        }else{
            inboxTo(this.findUser(msg.destinatario()),msg.asunto(),msg.mensaje());
        }
    }
    
    private boolean verify(){
        if(msg.destinatario().matches("(.*)@empresa.com$"))
            return true;
        else return false;
    }
    
    private String determine(){
        if(msg.asunto().matches(sales) && msg.asunto().matches(info)) return "ambos";
        else if(msg.asunto().matches(sales)) return "sales";
        else if(msg.asunto().matches(info)) return "info";
        else return null;
    }
    
    private boolean inboxTo(String user){
        if(user==null){ 
            System.out.println("user viene vacio");
            return false;
        }
        try{
        String[] valores=new String[5];
        valores[0]=msg.emisor();
        valores[1]=msg.destinatario();
        valores[2]=msg.asunto();
        valores[3]=msg.mensaje();
        valores[4]=user;
        if(con.agregar("mensajes","emisor,destinatario,asunto,mensaje,user_id", valores)){
            System.out.println("registro existoso");
            return true;
        }else{
        System.out.println("Hubo algun problema al guardar los datos");
        return false;
        }
        }catch(Exception e){System.out.println("inboxTo: "+e); return false;}
    }
    
    private boolean inboxTo(String user,String asunto,String mensaje){
        if(user==null){ 
            System.out.println("user viene vacio");
            return false;
        }
        try{
        String[] valores=new String[5];
        valores[0]="contacto@empresa.com";
        valores[1]=msg.emisor();
        valores[2]=asunto;
        valores[3]=mensaje;
        valores[4]=user;
        if(con.agregar("mensajes","emisor,destinatario,asunto,mensaje,user_id", valores)){
            System.out.println("registro existoso");
            return true;
        }else{
        System.out.println("Hubo algun problema al guardar los datos");
        return false;
        }
        }catch(Exception e){System.out.println("inboxTo: "+e); return false;}
    }
    
    private String findUser(){
        String[][] usuario=null;
        usuario=con.leerDatos(con.bd, "id", "user='"+msg.destinatario()+"'");
        if(usuario!=null)
            return usuario[0][0];
        else return null;
    }

    private String findUser(String mail){
        String[][] usuario=null;
        usuario=con.leerDatos("usuarios", "id", "user='"+mail+"'");
        if(usuario!=null)
            return usuario[0][0];
        else return null;
    }
}
