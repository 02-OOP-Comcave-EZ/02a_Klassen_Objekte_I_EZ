package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        // zwei Obkjekte erzeugen
        
        // Cat --> Referenztyp (Klasse aus der das Objekt entsteht)
        // cat1 --> Referenzvariable (Adresse des Objekts im RAM)
        Cat cat1 = new Cat(); // Instanziierung
        output("Blick von aussen: " + cat1); // Adresse des Objekts
        output("Blick von innen : " + cat1.getInstanceVar());
              
        output("-------------------------------");

        Cat cat2 = new Cat();
        output("Blick von aussen: " + cat2); // Adresse des Objekts
        output("Blick von innen : " + cat2.getInstanceVar());
       
    }


    // Statische Methode, die in der Klasse ausgeführt wird...
    public static void output(String outputStr){
        System.out.println(outputStr);


    }

   

}

