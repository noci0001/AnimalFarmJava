// 'All animals are equal. But some animals are more equal than others.'
// Mr Jones of Manor Farm is so lazy and drunken that one day he forgets to feed his livestock.
// The ensuing rebellion under the leadership of the pigs Napoleon and Snowball leads to the animals taking over the farm.
// Vowing to eliminate the terrible inequities of the farmyard, the renamed Animal Farm is organised to benefit all who walk on four legs.
// But as time passes, the ideals of the rebellion are corrupted, then forgotten. 
// And something new and unexpected emerges..

// Napoleon
public class Pig extends Animal {
   boolean isLeadingClass;
   Quote[] quotes;

   public Pig(String name, String symbolize, boolean isLeadingClass, Quote[] quotes) {
      super(name, symbolize, isLeadingClass);
      this.quotes = quotes;
      this.isLeadingClass = isLeadingClass;
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
}