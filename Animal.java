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
   Random random = new Random();
   public Animal(String name, String symbolize) {
      this.name = name;
      this.symbolize = symbolize;
      this.quote = random.nextInt(3);
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
