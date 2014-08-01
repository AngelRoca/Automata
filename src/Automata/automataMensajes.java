package Automata;
import Objects.message;
import Modelo.conexion;

public class automataMensajes {
    conexion con;
    private message msg;
    private String sales="(.*)(compra|COMPRA|vend|VEND|vent|VENT)(.*)",info="(.*)(info|INFO|conoce|CONOCE|sabe|SABE)(.*)";
    
    public automataMensajes(String e,String d,String a,String m){
        msg=new message(e,d,a,m);
        con=new conexion();
        if(determine()!=null){}else System.out.println("");
        
    }
    
    private boolean verify(){
        if(msg.destinatario().matches(".@empresa.com$"))
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
        String[] valores=null;
        valores[0]=msg.emisor();
        valores[1]=msg.destinatario();
        valores[2]=msg.asunto();
        valores[3]=msg.mensaje();
        valores[4]=user;
        if(con.agregar(con.bd, "emisor,destinatario,asunto,mensaje,user_id", valores))
        {System.out.println("registro existoso");
            return true;}
        System.out.println("Hubo algun problema al guardar los datos");
        return false;
    }
    
    private String findUser(){
        String[][] usuario=null;
        usuario=con.leerDatos(con.bd, "id", "user='"+msg.destinatario()+"'");
        if(usuario!=null)
            return usuario[0][0];
        else return "nada";
    }
}
