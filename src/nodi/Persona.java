/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nodi;

import java.util.ArrayList;

/**
 *
 * @author iacop
 */
public class Persona implements Cloneable, Comparable<Persona>
{
    private String nome;
    private String cognome;
    private String cf;

    public Persona(String nome, String cognome, String cf) {
        this.nome = nome;
        this.cognome = cognome;
        this.cf = cf;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getCf() {
        return cf;
    }
    
    @Override
    public String toString()
    {
        String s="\nNome: "+this.getNome()+" Cognome: "+this.getCognome()+" CF: "+this.getCf();
        return s;
    }

    @Override
    public int compareTo(Persona o) 
    {
        return this.getNome().compareTo(o.getNome());
    }
   
}
