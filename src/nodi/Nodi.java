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
    public static void main(String[] args) 
    {
        Nodo <Integer> n=new Nodo <Integer>(9);
        Nodo <Integer> n2=new Nodo <Integer>(2);
        Nodo <Integer> n3=new Nodo <Integer>(4);
        Nodo <Integer> n4=new Nodo <Integer>(3);
        Lista <Integer>lista =new Lista<Integer>();
        lista.add(n);
        lista.add(n2);
        lista.add(n3);
        lista.add(n4);
        
        System.out.println("\n numero nodi:"+lista.size());
        System.out.println("\n vuoto?"+lista.isEmpty());
        
        Nodo<Integer> punt=lista.getTesta();
        for(int i=0;i<lista.size();i++)
        {
            System.out.println("\n"+punt.getValore());
            punt=punt.getNext();
        }
        System.out.println(lista.remove(2));
        punt=lista.getTesta();
        for(int i=0;i<lista.size();i++)
        {
           System.out.println("\n"+punt.getValore());
           punt=punt.getNext();
        }
        Nodo<Integer> n6=new Nodo<Integer>(22); 
        lista.push(n6);
        punt=lista.getTesta();
        for(int i=0;i<lista.size();i++)
        {
           System.out.println("\n"+punt.getValore());
           punt=punt.getNext();
        }
        
    }
    
    
}
