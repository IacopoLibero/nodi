/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nodi;

/**
 *
 * @author iacop
 */
public class Nodo <T extends Comparable> implements Cloneable,Comparable 
{
    T valore;
    Nodo next;

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
        String s=String.valueOf(valore.toString());
        return s;
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
    public int compareTo(Object o) 
    {
        return valore.compareTo(o);
    }
    
    public void scambioValore(Nodo next)
    {
        T prov=(T) next.getValore();
        next.setValore(this.getValore());
        this.setValore(prov);
    }
    
}
