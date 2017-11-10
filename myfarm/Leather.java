/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfarm;

/**
 *
 * @author Administrador
 */
public class Leather {
    
    private int cantidad;
    private boolean refined;
    private double precio;
    private double bruto;
    private double neto;
    
    private int cantPellejo;
    private double precioPellejo;
    private double presupuestoPellejo;
    
    public Leather(int cantidad, int refin) {
        this.cantidad = cantidad;
        if (refin == 0) { this.refined = false; } else this.refined = true;
    }
    
    //Setters de la API
    
    public void setPrecio(int price) { 
        this.precio = price;
    }
    
    public void setBruto() {
        this.bruto = this.cantidad * this.precio;
    }
    
    public void setNeto() {
        this.neto = this.bruto * 0.85;
    }
    
    public void setPrecioPellejo(int price) {
        this.precioPellejo = price;
    }
    
    public void setPresupuestoPellejo() {
        if (this.neto <= 20) {
            this.presupuestoPellejo = this.neto % 10;
        }
        else this.presupuestoPellejo = (this.neto % 10) + 10;
    }
    
    public void setCantPellejo () {
        this.cantPellejo = (int) (this.presupuestoPellejo / this.precioPellejo);
    }
}
