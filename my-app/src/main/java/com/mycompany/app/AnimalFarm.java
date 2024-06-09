package com.mycompany.app;
import java.util.Iterator;

// 'All animals are equal. But some animals are more equal than others.'
// Mr Jones of Manor Farm is so lazy and drunken that one day he forgets to feed his livestock.
// The ensuing rebellion under the leadership of the pigs Napoleon and Snowball leads to the animals taking over the farm.
// Vowing to eliminate the terrible inequities of the farmyard, the renamed Animal Farm is organised to benefit all who walk on four legs.
// But as time passes, the ideals of the rebellion are corrupted, then forgotten. 
// And something new and unexpected emerges..


public class AnimalFarm {
   public static void main(String[] args) {
       Campaigner napoleon = new Pig("Napoleon", "Joseph Stalin", true);
       Campaigner snowball = new Pig("Snowball", "the intellectual and ideological opposition to tyranny and oppression, as well as the struggle for social justice and equality", true);
       Animal boxer = new Horse("Boxer", "the working class (proletariat)");
       Animal benjamin = new Donkey("Benjamin", " the skeptical intellectuals");
       Animal sheep = new Sheep("Sheep", " the gullible masses who are easily swayed, manipulated, and controlled by authoritarian leaders through propaganda, coercion, and exploitation of their ignorance and naivety.");

       Animal[] animals = {(Animal) napoleon, (Animal) snowball, boxer, benjamin, sheep};
      
       for (Animal animal : animals) {
        Iterator<String> loveIterator = animal.personality.loveIterator();
          while (loveIterator.hasNext()) {
              System.out.println(animal.getName() + " loves " + loveIterator.next());
          }
        }
        for (Animal animal : animals) {
          java.util.Iterator<String> hateIterator = animal.personality.hateIterator();
          while (hateIterator.hasNext()) {
            System.out.println(animal.getName() + " hates " + hateIterator.next());
          }
        }

      String napoleon_proposal = napoleon.propose();
      String snowball_proposal = snowball.propose();

      // for (Animal citizen : animals) {
      //   for (String love : citizen) {
      //     for (String proposal : napoleon_proposal) {

      //     }
      //   }
      // }

    }
}
