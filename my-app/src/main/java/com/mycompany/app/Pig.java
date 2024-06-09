package com.mycompany.app;
// Mr Jones of Manor Farm is so lazy and drunken that one day he forgets to feed his livestock.
// The ensuing rebellion under the leadership of the pigs Napoleon and Snowball leads to the animals taking over the farm.
// But as time passes, the ideals of the rebellion are corrupted, then forgotten. 
// And something new and unexpected emerges..

import java.util.Iterator;
import java.util.Objects;

// Napoleon
// snowball
public class Pig extends Animal implements Campaigner {
   boolean isLeadingClass;
   Personality personality;
   Quote[] quotes;
   
   // Snowball Love
   static String[] snowLove = {"Innovation", "Education", "Animal Rights", "Loyalty", "Service", "Freedom"};
   // Napoleon Love
   static String[] napoLove = {"Power", "Control", "Manipulation", "Education", "Animal Rights", "Hard Work"};
   // Snowball Hate
   static String[] snowHate = {"Tyranny", "Ignorance", "Human Oppression", "Injustice", "Cruelty", "Betrayal"};
   // Napoleon Hate
   static String[] napoHate = {"Disobedience", "Opposition", "Equality", "Oppression", "Corruption", "Exploitation"};
   
   Quote[] napoleonQuotes = {
      new Quote("All animals are equal, but some animals are more equal than others.", "This quote epitomizes Napoleon's manipulation of language and the distortion of the farm's principles, highlighting his hypocrisy and thirst for power"),
      new Quote("The creatures outside looked from pig to man, and from man to pig, and from pig to man again; but already it was impossible to say which was which.","This quote symbolizes Napoleon's transformation from revolutionary leader to oppressive dictator, blurring the lines between human and animal oppressors and highlighting the cyclical nature of tyranny."),
      new Quote("Power is not a means; it is an end. One does not establish a dictatorship in order to safeguard a revolution; one makes the revolution in order to establish the dictatorship.", "Napoleon's ruthless pursuit of power and control is laid bare in this quote, revealing his true motives behind the revolution and the betrayal of its ideals.")
    };
    Quote[] snowballQuotes = {
      new Quote("Comrades, you do not imagine, I hope, that we pigs are doing this in a spirit of selfishness and privilege? Many of us actually dislike milk and apples. I dislike them myself. Our sole object in taking these things is to preserve our health. Milk and apples (this has been proved by Science, comrades) contain substances absolutely necessary to the well-being of a pig. We pigs are brainworkers. The whole management and organization of this farm depend on us. Day and night we are watching over your welfare. It is for your sake that we drink that milk and eat those apples.", "Snowball delivers this speech to justify the special treatment that the pigs receive, using rhetoric and manipulation to convince the other animals that their actions are for the collective good."),
      new Quote("War is war. The only good human being is a dead one.", "Snowball expresses his belief in the necessity of conflict and violence in the pursuit of the animals' liberation from human oppression. This quote highlights Snowball's militant and uncompromising attitude towards the humans who oppress them."),
      new Quote("Four legs good, two legs bad.", "Snowball introduces this simple slogan as a maxim for the animals to follow, emphasizing the superiority of animalism over human exploitation. This slogan becomes a rallying cry for the animals and encapsulates the core principles of their rebellion against human tyranny.")
  };


   public Pig(String name, String symbolize, boolean isLeadingClass) {
      super(name, symbolize, isLeadingClass);
      if (name.equals("Napoleon")) {
         this.personality = new Personality(napoLove, napoHate);
         this.quotes = napoleonQuotes;
      } else {
         this.personality = new Personality(snowLove, snowHate);
         this.quotes = snowballQuotes;
      }
      this.isLeadingClass = isLeadingClass;
   }

   @Override
   public String propose() {
      String name = getName();
      if (name.equals("Napoleon")) {
         return "I propose increasing food rations for hard work!";
      } else {
         return "I propose building a windmill for more energy!";
      }
   }

   @Override
   public void quote() {
      String randomQuote = this.quotes[getQuote()].quote;
      System.out.println("\'" + randomQuote + "\'");
   }

   @Override
   public void explain_quote() {
      String explaination = this.quotes[getQuote()].explaination;
      System.out.println("\t" + explaination);
   }

   @Override
   public void introduction() {
      System.out.print("\'Oink\' says ");
   }

   @Override
   public void work() {
      System.out.println(getName() + ", which represents " + getSymbol()+ "is leading the farm.");
   }

   public Iterator<String> loveIterator() {
      return personality.loveIterator();
  }

  public Iterator<String> hateIterator() {
      return personality.hateIterator();
  }

  @Override
public boolean equals(Animal obj) {
    if (this == obj) {
        return true;
    }
    if (obj == null || !(obj instanceof Animal)) {
        return false;
    }

    Animal otherAnimal = (Animal) obj;
    return isLeadingClass == otherAnimal.isLeadingClass && Objects.equals(this.getName(), otherAnimal.getName());
   }

}