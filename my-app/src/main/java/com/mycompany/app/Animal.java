package com.mycompany.app;

import java.util.Objects;
import java.util.Random;



public abstract class Animal {
   private final String name;
   private final String symbolize;
   protected Personality personality;
   private final int quote;
   public String[] hate;
   public String[] love;
   protected boolean isLeadingClass;
   Random random = new Random();
   public Animal(String name, String symbolize, boolean isLeadingClass) {
      this.name = name;
      this.symbolize = symbolize;
      this.quote = random.nextInt(3);
      this.isLeadingClass = isLeadingClass;
   }
   
   public abstract void introduction();
   public abstract void work();
   public abstract void quote();
   public abstract void explain_quote();
   public String getName() {
      return name;
   }

   public int getQuote() {
      return quote;
   }


   public boolean getIsLeadingClass() {
      return isLeadingClass;
   }

   public String getSymbol() {
      return symbolize;
   }

   // @Override
   public boolean equals(Animal obj) {
       if (this == obj) {
           return true;
       }
       if (obj == null || !(obj instanceof Animal)) {
           return false;
       }
   
       Animal otherAnimal = (Animal) obj;
       return isLeadingClass == otherAnimal.isLeadingClass && Objects.equals(name, otherAnimal.name);
   }
   
   public void vote(Campaigner candidate1, Campaigner candidate2) {
      int love = 0;
      int hate = 0;
      String proposal1 = candidate1.propose();
      String proposal2 = candidate2.propose();

      // Check if proposals contain keywords that match the animal's personality 
      // Personality voter_personality = this.getPersonality();
      // if (proposal1.toLowerCase().contains(personality.toLowerCase())) {
      //    return candidate1;
      // } else if (proposal2.toLowerCase().contains(personality.toLowerCase())) {
      //    return candidate2;
      // } else {
      //    // Default to the first candidate if neither proposal matches personality
      //    return candidate1;
      // }
   }
   //    String proposal1 = candidate1.propose();
   //    String proposal2 = candidate2.propose();
   //    int love = 0;
   //    int hate = 0;

      // Check if proposals contain keywords that match the animal's personality
      // if (proposal1.toLowerCase().contains(personality.toLowerCase())) {
      //     return candidate1;
      // } else if (proposal2.toLowerCase().contains(personality.toLowerCase())) {
      //     return candidate2;
      // } else {
      //     // Default to the first candidate if neither proposal matches personality
      //     return candidate1;
      // }
  }

