// 'All animals are equal. But some animals are more equal than others.'
// Mr Jones of Manor Farm is so lazy and drunken that one day he forgets to feed his livestock.
// The ensuing rebellion under the leadership of the pigs Napoleon and Snowball leads to the animals taking over the farm.
// Vowing to eliminate the terrible inequities of the farmyard, the renamed Animal Farm is organised to benefit all who walk on four legs.
// But as time passes, the ideals of the rebellion are corrupted, then forgotten. 
// And something new and unexpected emerges..


//Boxer
public class Horse extends Animal {
   Quote[] quotes;
   public Horse(String name, String symbolize) {
      super(name, symbolize);
      this.quotes = new Quote[3];
      this.quotes[0] = new Quote("I will work harder!", "Boxer's relentless dedication and commitment to the cause are encapsulated in this motto, representing his unwavering work ethic and loyalty to the farm's ideals.");
      this.quotes[1] = new Quote("Napoleon is always right.", "This quote underscores Boxer's blind faith in Napoleon's leadership, demonstrating his unquestioning acceptance of authority and the regime's propaganda.");
      this.quotes[2] = new Quote("I do not understand it. I would not have believed that such things could happen on our farm. It must be due to some fault in ourselves. The solution, as I see it, is to work harder.", "Boxer's naive belief in the power of hard work to overcome challenges is evident in this quote, reflecting his simplistic worldview and inability to grasp the true nature of the regime's corruption.");
   }

   @Override
   public void introduction() {
      System.out.print("\'Neigh\' says ");
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
   public void  work() {
      System.out.println(getName() + " that represents " + getSymbol() + ". He works hard on the farm.");
   }
}
