/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nodi;

/**
 *
 * @author iacop
 * @param <T>
 */
public class Lista <T extends Comparable> implements Cloneable
{
    Nodo <T> testa;

    public Lista() 
    {
        testa=null;
    }
    public Lista(Nodo<T> n) 
    {
        testa=n;
    }

    public Nodo<T> getTesta() {
        return testa;
    }
    
    public void add(Nodo <T> n) 
    {
        if(testa==null)
        {
            testa=n;
            return;
        }
        else
        {
            Nodo attuale=testa;
            while(attuale.getNext()!=null)
                attuale=attuale.getNext();

            attuale.setNext(n);
        }
    }
    public void add(T v)
    {
        Nodo <T> n=new Nodo(v);
        this.add(n);
        
    }
    public int size()
    {
        Integer count = 0;
        Nodo a = testa;
        
        while(a != null){
            count ++;
            a = a.getNext();
            
        }
            
        return count;
    }
    public boolean isEmpty()
    {
        if(testa==null)
            return true;
        else
            return false;
    }
    public boolean remove(int i)
    {
        if(i>this.size() ||i<0)
            return false;
        else if(i==0)
            testa=testa.getNext();
        else
        {
            Nodo attuale=testa;
            int cont=0;
            while(cont<i-1)
            {
                attuale=attuale.getNext();
                cont++;
            }
            attuale.setNext(attuale.getNext().getNext());  
        }
        return true;
    }
    public void push(Nodo <T> n)
    {
        n.setNext(testa);
        testa=n;
    }
    @Override
    public String toString()
    {
        String s="";
        if(testa == null)
                return "lista vuota";
        
        Nodo<T>punt=testa;
        while(punt!=null)
        {
            s=s+punt.toString();
            punt=punt.getNext();
        }
        return s;
    }
    public Lista<T> sottolista(T val) throws CloneNotSupportedException
    {
        Lista<T> nuovalista=new Lista();
        if(testa==null)
            return nuovalista;
        else
        {
            Nodo <T> punt=testa;
            while(punt!=null&&punt.getValore().equals(val)==false)
                punt=punt.getNext();
            if(punt!=null)
                nuovalista.add(punt.clone());
            return nuovalista;
        }
        
    }
    public boolean setVal(int i, T v)
    {
        if(testa==null)
            return false;
        else if(i>this.size() || i<0)
            return false;
        else
        {
            Nodo attuale=testa;
            int cont=0;
            while(cont<i-1)
            {
                attuale=attuale.getNext();
                cont++;
            }
            attuale.getNext().setValore(v);
            return true;
        }
    }
    
    public void sort()
    {
        Nodo<T> p = testa;
        while(p != null)
        {
            Nodo<T>  p2 = p.getNext();
            while(p2 != null)
            {
                if(p.compareTo(p2) > 0)
                {
                    T temp = p.getValore();
                    p.setValore( p2.getValore() );
                    p2.setValore(temp);
                }
                p2=p2.getNext();    
            }
            p=p.getNext();
        }
    }
}
