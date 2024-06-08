// 'All animals are equal. But some animals are more equal than others.'
// Mr Jones of Manor Farm is so lazy and drunken that one day he forgets to feed his livestock.
// The ensuing rebellion under the leadership of the pigs Napoleon and Snowball leads to the animals taking over the farm.
// Vowing to eliminate the terrible inequities of the farmyard, the renamed Animal Farm is organised to benefit all who walk on four legs.
// But as time passes, the ideals of the rebellion are corrupted, then forgotten. 
// And something new and unexpected emerges..

// Napoleon
public class Pig extends Animal {
   Quote[] quotes;

   public Pig(String name, String symbolize) {
      super(name, symbolize);
      this.quotes = new Quote[3];
      this.quotes[0] = new Quote("All animals are equal, but some animals are more equal than others.", "This quote epitomizes Napoleon's manipulation of language and the distortion of the farm's principles, highlighting his hypocrisy and thirst for power");
      this.quotes[1] = new Quote("The creatures outside looked from pig to man, and from man to pig, and from pig to man again; but already it was impossible to say which was which.","This quote symbolizes Napoleon's transformation from revolutionary leader to oppressive dictator, blurring the lines between human and animal oppressors and highlighting the cyclical nature of tyranny.");
      this.quotes[2] = new Quote("Power is not a means; it is an end. One does not establish a dictatorship in order to safeguard a revolution; one makes the revolution in order to establish the dictatorship.", "Napoleon's ruthless pursuit of power and control is laid bare in this quote, revealing his true motives behind the revolution and the betrayal of its ideals.");
         
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