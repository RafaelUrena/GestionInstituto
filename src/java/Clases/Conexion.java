/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Conexion 
{
    
    //********************* Atributos *************************
    private java.sql.Connection Conex;  
    //Atributo a través del cual hacemos la conexión física.
    private java.sql.Statement Sentencia_SQL; 
    //Atributo que nos permite ejecutar una sentencia SQL
    private java.sql.ResultSet Conj_Registros; 
    //(Cursor) En él están almacenados los datos.
    private String bbdd;
    private String usuario;
    private String clave;
    
    
    //********************** Constructores **************************
    //----------------------------------------------------------
    public Conexion() throws ClassNotFoundException, 
            InstantiationException, IllegalAccessException, SQLException
    {
        //Cargar el driver/controlador
        String controlador = "com.mysql.jdbc.Driver";
        //String controlador = "oracle.jdbc.driver.OracleDriver";
        //String controlador = "sun.jdbc.odbc.JdbcOdbcDriver";
        Class.forName(controlador).newInstance();
        
        Conectar("ejemplo");
    }
    
    public Conexion(String b,String u,String c) throws ClassNotFoundException, 
            InstantiationException, IllegalAccessException, SQLException
    {
        //Cargar el driver/controlador
        String controlador = "com.mysql.jdbc.Driver";
        //String controlador = "oracle.jdbc.driver.OracleDriver";
        //String controlador = "sun.jdbc.odbc.JdbcOdbcDriver";
        Class.forName(controlador).newInstance();
        bbdd = b;
        usuario = u;
        clave = c;
        Conectar(bbdd);
    }
    
    //********************** Métodos **************************
    //----------------------------------------------------------
    private void Conectar(String nombre_bbdd) throws SQLException
    {
        String URL_BD = "jdbc:mysql://localhost/" + nombre_bbdd;
        //String URL_BD = "jdbc:oracle:oci:@REPASO";
        //String URL_BD = "jdbc:oracle:oci:@REPASO";
        //String URL_BD = "jdbc:odbc:REPASO";
      
        //Realizamos la conexión a una BD con un usuario y una clave.
        try {
            Conex = java.sql.DriverManager.getConnection(URL_BD,usuario,clave);
            Sentencia_SQL = Conex.createStatement();
            System.out.println("Conexion realizada con éxito");
        }
        catch (Exception e)
        {
            System.err.println("Exception: "+e.getMessage());
        }

    }
    
}
