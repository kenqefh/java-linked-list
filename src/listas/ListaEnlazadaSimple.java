/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 * @author Frank
 *
 * Muestra de funcionamiento de la lista enlazada
 */
public class ListaEnlazadaSimple {
 
    public static void main(String[] args) {
         
        //Creo la lista enlazada de numeros
        //Puede ser de String, double, Objetos, etc.
        ListaEnlazada<Integer> lista=new ListaEnlazada<>();
         
        System.out.println("Insercion de numeros del 0 al 9 en forma de cola");
        for(int i=0;i<10;i++){
            lista.insertarUltimo(i);
        }
         
        //Mostramos la lista
        lista.mostrar();
        
         
        System.out.println("Eliminación del dato que esta en la posicion 3");
        lista.borraPosicion(3); //Elimina el el dato 3
         
        lista.mostrar();
        
         
        System.out.println("Insercion del dato 2 en la posicion 5");
        lista.introducirDato(5, 2);
         
        lista.mostrar();
        
         
        System.out.println("Modificamos el dato de la posicion 5 por un 3");
        lista.modificarDato(5, 3);
         
        lista.mostrar();
        
         
        System.out.println("Inserto en la posicion 0");
        lista.introducirDato(0, 10);
         
        lista.mostrar();
        
        
        System.out.println("\nInserto en la ultima posicion");
        //Equivalente a insertarUltimo
        lista.introducirDato(lista.cuantosElementos(), 11);
      
        lista.mostrar();
         
        System.out.println("\nPosicion del dato 5: "+lista.indexOf(5));
        System.out.println("Posicion del dato 5 desde la posicion 7: "+lista.indexOf(5, 7));
         
        System.out.println("\n¿Existe el dato 10 en la lista? "+lista.datoExistente(10));
        System.out.println("¿Existe el dato 20 en la lista? "+lista.datoExistente(20)+"\n");
        //System.out.println(lista.toString());
    }
     
}