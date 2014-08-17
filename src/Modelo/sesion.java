package Modelo;

import Modelo.conexion;

public class sesion {
    private String User;
    private String Pass;
    private String Permissions;
    private String Access;
    conexion con;
    
    //Sesion devuelve User, Pass y Permissions
    public sesion(String user,String pass,boolean permisos){
        con=new conexion();
        String[][] data=null;
        if((data=con.leerDatos("usuarios", "user,pass,permisos", "user='"+user+"' and pass='"+pass+"'"))==null){
            Access=User=Pass=Permissions="Acceso Denegado";
        }
        else{
            Access="Acceso Concedido";
            User=data[0][0]; Pass=data[0][1]; Permissions=data[0][2];
        }
    }
    
    //Sesion devuelve User y Pass
    public sesion(String user,String pass){
        con=new conexion();
        String[][] data=null;
        if((data=con.leerDatos("usuarios", "user,pass", "user='"+user+"' and pass='"+pass+"'"))==null){
            Access=User=Pass=Permissions="Acceso Denegado";
        }
        else{
            Access="Acceso Concedido";
            User=data[0][0]; Pass=data[0][1]; Permissions=null;
        }
    }

    public String getAcceso(){
        return Access;
    }
    
    public String getPermisos(){
        return Permissions;
    }
    
    public String getUsuario(){
        return User;
    }
    
    public String getPassword(){
        return Pass;
    }
}
