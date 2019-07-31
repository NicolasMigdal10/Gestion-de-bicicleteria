/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaDeBicicleteria;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Bicicleteria {
    private ArrayList<Bicicleta> bicicletas;
    private float ganancias;
    private Integer cantidadDeVentas;
    
    Bicicleteria(){
    bicicletas= new ArrayList<>();
    cantidadDeVentas=0;
    ganancias=0;
    }
    
   void addBicicleta(Bicicleta nuevaBici){
    bicicletas.add(nuevaBici);
    }
    
   void venderBicicleta(Bicicleta bicicleta){
   bicicletas.remove(bicicleta);
   cantidadDeVentas++;
   ganancias= ganancias + bicicleta.getPrecio();
   }
   
   
   Bicicleta buscarBicicleta(String nroDeSerie){
   for(int i=0;i>bicicletas.size();i++){
   if(bicicletas.get(i).getNroDeSerie().equals(nroDeSerie))
       return bicicletas.get(i);
   }
    return null;
   }
}
