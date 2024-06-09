package com.mycompany.app;

public class Sheep extends Animal {
   Quote[] quotes;
   Personality personality;

   // Sheep Love
   static String[] sheepLove = {"Patriotism", "Scapegoating", "Humor and Charisma", "Justice", "Unity", "Freedom"};


   // Sheep Hate
   static String[] sheepHate = {"Immigration", "Hipocrisy", "Radical Reforms", "Oppression", "Corruption", "Exploitation"};


   public Sheep(String name, String symbolize) {
      super(name, symbolize, false);
      
      this.quotes = new Quote[3];
      this.quotes[0] = new Quote("Four legs good, two legs bad.", "This simple chant is introduced by Snowball and becomes the primary slogan of Animalism, summarizing the animals' initial revolutionary ideology. The sheep frequently repeat this slogan, often drowning out any arguments or dissenting voices.");
      this.quotes[1] = new Quote("Four legs good, two legs better!", "Later in the story, the pigs revise the original slogan to suit their evolving agenda as they begin to adopt human traits and behaviors. The sheep, now indoctrinated, mindlessly repeat this new chant, demonstrating their susceptibility to manipulation.");
      this.quotes[2] = new Quote("BeEeEeEeEeE!", "This quote describes a specific instance where the sheep's chanting is used strategically to silence opposition. During important meetings, whenever a potentially contentious issue arises, the sheep are prompted to start chanting, effectively stifling any discussion or protest.");
      this.personality = new Personality(sheepLove, sheepHate);
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
      System.out.print("\'Beee\' ");
   }

   @Override
   public void work() {
      System.out.println(getName() + ", which represents " + getSymbol()+ " follow the orders without questions.");
   }
   
}
