package Objects;

public class message {
    private String emisor;
    private String destinatario;
    private String asunto;
    private String mensaje;
    
    public message(String e,String d,String a,String m){
        emisor=e;
        destinatario=d;
        asunto=a;
        mensaje=m;
    }
    
    public String emisor(){
        return emisor;
    }
    public String destinatario(){
        return destinatario;
    }
    public String asunto(){
        return asunto;
    }
    public String mensaje(){
        return mensaje;
    }
}
