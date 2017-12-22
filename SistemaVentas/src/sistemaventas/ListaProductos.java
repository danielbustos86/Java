/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaventas;

import java.util.ArrayList;

/**
 *
 * @author daniel
 */
public class ListaProductos {
    private ArrayList<Producto> Productos;
    
     public void AgregarProd(Producto p) { 
         Productos.add(p);
     }
       public ListaProductos() { Productos = new ArrayList(); }

     
     public int largo(){ 
         return Productos.size();
     }
   
   
     
   
    public Producto RegresaObje(int pos){
        
        return Productos.get(pos);
    }
    
     public int BuscaPosProducto(String Codigo) {
       String existe ="N";
       int posicion = -1;
       int i=0;
       
       while((i<Productos.size()) && (existe.equals("N"))){
            
           if(Productos.get(i).getCodigo().equals(Codigo))
           { 
               posicion = i;
               existe = "S";
           }     
        i=i+1; 
       }   
       //  System.out.println(posicion);
         
       return posicion;
     }    
    
     
     
    public Producto BuscaProducto(String Codigo) {
       String existe ="N";
       int posicion = 0;
       int i=0;
       
       while((i<Productos.size()) && (existe.equals("N"))){
            
           if(Productos.get(i).getCodigo().equals(Codigo))
           { 
               posicion = i;
               existe = "S";
           }     
        }   
         return Productos.get(posicion);
       } 
    
     public int SumaVenta(){
         int valor=0;
         int i=0;
         
         
         while(i<Productos.size() ){
            
             valor = valor + Productos.get(i).getPrecioVenta();
          
            i=i+1;    
         }
         
         return valor;
     }
}
    
