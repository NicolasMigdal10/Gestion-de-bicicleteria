/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaDeBicicleteria;

/**
 *
 * @author usuario
 */
public class Bicicleta {
   String nroDeSerie;
   String modelo;
   int año;
   float precio;

     Bicicleta(String nroDeSerie, String modelo, int año) {
        this.nroDeSerie = nroDeSerie;
        this.modelo = modelo;
        this.año = año;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }

    public String getNroDeSerie() {
        return nroDeSerie;
    }
   
   
    
}
