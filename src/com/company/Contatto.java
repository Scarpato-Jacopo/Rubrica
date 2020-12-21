package com.company;
import java.io.*;
public class Contatto implements Serializable{


    String email;
    String cognome;
    String numero;

    public Contatto(String email, String cognome, String numero) {
        this.email = email;
        this.cognome = cognome;
        this.numero = numero;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }


    @Override
    public String toString(){

return cognome + " " + email + " " + numero;

    }




}

