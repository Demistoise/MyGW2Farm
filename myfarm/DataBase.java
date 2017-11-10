package myfarm;

import java.util.ArrayList;
import java.io.*;
import java.sql.*;

/**
 *
 * @author Demistoise
 */
public class DataBase {
    
    private ArrayList <Leather> bdCuero = new ArrayList <Leather>();
    private ArrayList <Silver> bdSilver = new ArrayList <Silver>();
    
    private Leather datoLeather;
    private Silver datoCuero;
    
    public DataBase() {
        //Funcion de carga desde un archivo SQL
        //Carga de datos SQL en bdCuero y bdSilver
    }
}
