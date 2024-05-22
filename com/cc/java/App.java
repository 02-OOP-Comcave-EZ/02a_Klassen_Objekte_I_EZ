package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        // zwei Obkjekte erzeugen
        
        // Cat --> Referenztyp (Klasse aus der das Objekt entsteht)
        // cat1 --> Referenzvariable (Adresse des Objekts im RAM)
        Cat cat1 = new Cat(); // Instanzieerung
        System.out.println("Blick von aussen: " + cat1); // Adresse des Objekts
        cat1.sayHi();
        System.out.println("-------------------------------");

        Cat cat2 = new Cat();
        System.out.println("Blick von aussen: " + cat2);
        cat2.sayHi();

       
    }


    // Statische Methode, die in der Klasse ausgeführt wird...
    public static void output(String outputStr){
        System.out.println(outputStr);


    }

   

}

