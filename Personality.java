public class Personality {
   private String[] love = new String[3];
   private String[] hate = new String[3];

   // Traits present in other characters' love lists
// String[] additionalLoveTraits = {"Justice", "Unity", "Freedom"};

// Sheep Love
String[] sheepLove = {"Patriotism", "Scapegoating", "Humor and Charisma", "Justice", "Unity", "Freedom"};

// Snowball Love
String[] snowLove = {"Innovation", "Education", "Animal Rights", "Loyalty", "Service", "Freedom"};

// Napoleon Love
String[] napoLove = {"Power", "Control", "Manipulation", "Education", "Animal Rights", "Hard Work"};

// Boxer Love
String[] boxLove = {"Hard Work", "Loyalty", "Service", "Patriotism", "Unity", "Justice"};

// Benjamin Love
String[] benLove = {"Skepticism", "Independence", "Tradition", "Justice", "Unity", "Freedom"};

// Traits present in other characters' hate lists
// String[] additionalHateTraits = {"Oppression", "Corruption", "Exploitation"};

// Sheep Hate
String[] sheepHate = {"Immigration", "Hipocrisy", "Radical Reforms", "Oppression", "Corruption", "Exploitation"};

// Snowball Hate
String[] snowHate = {"Tyranny", "Ignorance", "Human Oppression", "Injustice", "Cruelty", "Betrayal"};

// Napoleon Hate
String[] napoHate = {"Disobedience", "Opposition", "Equality", "Oppression", "Corruption", "Exploitation"};

// Boxer Hate
String[] boxHate = {"Injustice", "Cruelty", "Betrayal", "Tyranny", "Ignorance", "Human Oppression"};

// Benjamin Hate
String[] benHate = {"Deception", "Optimism", "Hypocrisy", "Oppression", "Corruption", "Exploitation"};


   public Personality(String name) {

      switch (name) {
         case "Sheep":
            this.love = sheepLove;
            this.hate = sheepHate;
            break;
         case "Napoleon":
            this.love = napoLove;
            this.hate = napoHate;
            break;
         case "Snowball":
            this.love = snowLove;
            this.hate = snowHate;
            break;
         case "Benjamin":
            this.love = benLove;
            this.hate = benHate;
            break;
         case "Boxer":
            this.love = boxLove;
            this.hate = boxHate;
            break;
      }
   }
}