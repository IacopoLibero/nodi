/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nodi;

/**
 *
 * @author iacop
 */
public class Nodi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CloneNotSupportedException 
    {
        Nodo <Integer> n=new Nodo <Integer>(0);
        Nodo <Integer> n2=new Nodo <Integer>(3);
        Nodo <Integer> n3=new Nodo <Integer>(4);
        Nodo <Integer> n4=new Nodo <Integer>(6);
        Nodo <Integer> n5=new Nodo <Integer>(7);
        Nodo <Integer> n6=new Nodo <Integer>(9);
        Lista <Integer>lista =new Lista<Integer>();
        lista.add(n);
        lista.add(n2);
        lista.add(n3);
        lista.add(n4);
        lista.add(n5);
        lista.add(n6);
        
        System.out.println("\n numero nodi:"+lista.size());
        System.out.println("\n vuoto?"+lista.isEmpty());
        {
            Nodo<Integer> punt=lista.getTesta();
            for(int i=0;i<lista.size();i++)
            {
                System.out.println("\n"+punt.getValore());
                punt=punt.getNext();
            }
            System.out.println("\n---------------------");
        }
        lista.inserimento_ordinato(10);
        Nodo<Integer> punt=lista.getTesta();
        
        for(int i=0;i<lista.size();i++)
        {
            System.out.println("\n"+punt.getValore());
            punt=punt.getNext();
        }
        
    }
    
    
}
