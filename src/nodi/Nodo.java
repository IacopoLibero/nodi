/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nodi;

/**
 *
 * @author iacop
 */
public class Nodo <T extends Comparable> implements Cloneable,Comparable <Nodo<T>> 
{
    T valore;
    Nodo <T> next;

    public Nodo(T valore) {
        this.valore = valore;
        this.next = null;
    }

    public void setValore(T valore) {
        this.valore = valore;
    }

    public T getValore() {
        return valore;
    }
    
    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
    @Override
    public String toString()
    {
        return valore.toString();
    }
    
    @Override
    public Nodo <T> clone() throws CloneNotSupportedException
    {
        Nodo<T> c=(Nodo<T>) super.clone();
        if(next!=null)
            c.next=this.next.clone();
        
        return c;
    }


    @Override
    public int compareTo(Nodo<T> o) 
    {
        return valore.compareTo(o.getValore());
    }
    
}
