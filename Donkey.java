// 'All animals are equal. But some animals are more equal than others.'
// Mr Jones of Manor Farm is so lazy and drunken that one day he forgets to feed his livestock.
// The ensuing rebellion under the leadership of the pigs Napoleon and Snowball leads to the animals taking over the farm.
// Vowing to eliminate the terrible inequities of the farmyard, the renamed Animal Farm is organised to benefit all who walk on four legs.
// But as time passes, the ideals of the rebellion are corrupted, then forgotten. 
// And something new and unexpected emerges..

// Benjamin
public class Donkey extends Animal {
   Quote[] quotes;
   boolean isLeadingClass;

   public Donkey(String name, String symbolize, boolean isLeadingClass) {
      super(name, symbolize, isLeadingClass);
      this.isLeadingClass = isLeadingClass;
      this.quotes = new Quote[3];
      this.quotes[0] = new Quote("Donkeys live a long time. None of you has ever seen a dead donkey.", "Benjamin's cynical outlook on life is captured in this quote, reflecting his resigned acceptance of the farm's grim realities and the futility of hope for change.");
      this.quotes[1] = new Quote("Life will go on as it has always gone on—that is, badly.", "This quote encapsulates Benjamin's pessimistic worldview, suggesting that nothing will fundamentally change for the better, regardless of the political upheavals on the farm.");
      this.quotes[2] = new Quote("Donkeys live a long time. Never mind the past, I know the future.", "Benjamin's fatalistic attitude is evident in this quote, as he resigns himself to the inevitability of his fate and refuses to dwell on the past or hope for a better future.");
   }

   @Override
   public void introduction() {
      System.out.print("\'Hee-haw\' says ");
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
   public void work() {
       System.out.println(getName() + ", which represents " + getSymbol() + ", is carrying loads on the farm.");
   }
}
