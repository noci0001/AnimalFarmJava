package com.mycompany.app;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

// if (napoleon.equals(snowball)) {
//    System.out.println("Being a pig in an Animal Farm is quite thrilling!");
//  }
//  if (napoleon.equals(boxer) == false) {
//    System.out.println("Pretty unfair for " + boxer.getName());
//  }
//  if (boxer.equals(benjamin) == true) {
//    System.out.println(boxer.getName() +" is equal to " + benjamin.getName());
//  }
//  if (sheep.equals(benjamin) == true) {
//    System.out.println(boxer.getName() +" is equal to " + benjamin.getName());
//  }
public class AnimalTest {

    @Test
    public void testEqualities() {
       Campaigner napoleon = new Pig("Napoleon", "Joseph Stalin", true);
       Campaigner snowball = new Pig("Snowball", "the intellectual and ideological opposition to tyranny and oppression, as well as the struggle for social justice and equality", true);
       Animal boxer = new Horse("Boxer", "the working class (proletariat)");
       Animal benjamin = new Donkey("Benjamin", " the skeptical intellectuals");
       Animal sheep = new Sheep("Sheep", " the gullible masses who are easily swayed, manipulated, and controlled by authoritarian leaders through propaganda, coercion, and exploitation of their ignorance and naivety.");
       assertTrue(napoleon.equals(snowball));
    }
 }
