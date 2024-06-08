// 'All animals are equal. But some animals are more equal than others.'
// Mr Jones of Manor Farm is so lazy and drunken that one day he forgets to feed his livestock.
// The ensuing rebellion under the leadership of the pigs Napoleon and Snowball leads to the animals taking over the farm.
// Vowing to eliminate the terrible inequities of the farmyard, the renamed Animal Farm is organised to benefit all who walk on four legs.
// But as time passes, the ideals of the rebellion are corrupted, then forgotten. 
// And something new and unexpected emerges..

import java.util.Random;

public abstract class Animal {
   private final String name;
   private final String symbolize;
   private final int quote;
   public boolean isLeadingClass;
   Random random = new Random();
   public Animal(String name, String symbolize, boolean isLeadingClass) {
      this.name = name;
      this.symbolize = symbolize;
      this.quote = random.nextInt(3);
      this.isLeadingClass = isLeadingClass;
   }

   @Override
   public boolean equals(Object obj) {
      if (obj instanceof Animal) {
         Animal otherAnimal = (Animal) obj;
         if (otherAnimal.isLeadingClass == false && this.isLeadingClass == false) {
            System.out.println("All animals are equals, but some animals are more equal than others.\n These two are equals");
            return true;
         } else if (otherAnimal.isLeadingClass && this.isLeadingClass){
            System.out.println("All animals are eqals, but some animals are more equal than others.\nTwo pigs who are more equals then others, are equals between each others.");
            return true;
         } else if (otherAnimal.isLeadingClass && this.isLeadingClass == false) {
            System.out.println("All animals are equals, but some animals are more equal than others.\n" + this.name + "is as equal as anybody else, but " + otherAnimal.name + " is more equal then him because it is a pig.");
            return false;
         } else {
            System.out.println("All animals are equals, but some animals are more equal than others.\n" + this.name + "is more equal then " + otherAnimal.name + " as the latter is not a Pig.");
            return false;
         }
      }
      return false;
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

   public String getSymbol() {
      return symbolize;
   }
}
