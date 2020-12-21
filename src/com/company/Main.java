package com.company;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {



    public static void main(String[] args) {

ArrayList<Contatto> contatti = new ArrayList ();

        Contatto contatto = new Contatto ("sauro@gmail.com", "scarpato", "3882581319");
        Contatto contatto1 = new Contatto ("ugo@gmail.com", "ugo", "5222525");
        Contatto contatto2 = new Contatto ("balugo@gmail.com", "balugo", "10000001");
        Contatto contatto3 = new Contatto ("dio@gmail.com", "ciao", "744555155158");


        contatti.add (contatto);
        contatti.add (contatto1);
        contatti.add (contatto2);
        contatti.add (contatto3);

        
        System.out.println ("Benvenuto nella rubrica, premi [1] per visualizzare i contati presenti" );
        System.out.println("[2] per aggiungere un contatto");
        System.out.println("[3] per ricercare un contatto tramite cognome");
        System.out.println("[4] per salvare la rubrica");
        System.out.println("[5] per caricare la vecchia rubrica");
        System.out.println("[0] per uscire dalla rubrica");
        int i=1;
        while (i!=0) {

        Scanner in = new Scanner(System.in);
        i = in.nextInt();



            switch (i) {

                case 1:
                    System.out.println ("i contatti presenti nella rubrica sono: ");
                    for (Contatto c : contatti) {

                        System.out.println (c);
                    }
break;

                case 2:
                

                    break;
                case 3:


                    break;
                case 4:
                    try{
                        FileOutputStream writeData = new FileOutputStream("Rubrica.ser");
                        ObjectOutputStream writeStream = new ObjectOutputStream(writeData);

                        writeStream.writeObject(contatti);
                        writeStream.flush();
                        writeStream.close();

                    }catch (IOException e) {
                        e.printStackTrace();
                    }


                    break;
                case 5:
                    try{
                        FileInputStream readData = new FileInputStream("Rubrica.ser");
                        ObjectInputStream readStream = new ObjectInputStream(readData);

                        ArrayList contatti2 = (ArrayList<Contatto>) readStream.readObject();
                        readStream.close();
                        System.out.println(contatti2.toString());
                    }catch (IOException | ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                    break;
                case 0:
                    System.out.println ("addio");
                    break;

            }
        }
    }
}
