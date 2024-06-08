# Animal Farm

![Animal Farm Poster](./AnimalFarm.jpg)
<p> 'All animals are equal. But some animals are more equal than others.'
Mr Jones of Manor Farm is so lazy and drunken that one day he forgets to feed his livestock.
The ensuing rebellion under the leadership of the pigs Napoleon and Snowball leads to the animals taking over the farm.
Vowing to eliminate the terrible inequities of the farmyard, the renamed Animal Farm is organised to benefit all who walk on four legs.
But as time passes, the ideals of the rebellion are corrupted, then forgotten. 
And something new and unexpected emerges..</p>

To practice Java's Polymorphism and Inheritance I created a Java program representing the Animals in the Animal Farm showing their name, what/who they symbolize in the book and their best quotes.

I praciticed Inheritance in Java by having a Superclass of Animal and subclasses representing each animal character in the book.

Here is the Superclass Animal:

```
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
```

### An example of inheritance implementation:

`public class Donkey extends Animal {`

### Usage of funtion override to allow subclasses to customize the behavior of inherited methods to suit specific needs.

```
   @Override
   public void explain_quote() {
      String explaination = this.quotes[getQuote()].explaination;
      System.out.println("\t" + explaination);
   }

   @Override
   public void work() {
       System.out.println(getName() + ", which represents " + getSymbol() + ", is carrying loads on the farm.");
   }
```

## Comparisons in Java
<p>The sentence "All animals are equal, but some animals are more equal than others" from George Orwell's "Animal Farm" is a satirical statement that highlights the hypocrisy and corruption of the pigs, who have taken control of the farm and established themselves as the ruling class. <p>

I found this quote quite stirking, so I decided to transpose it to code to practice comparisons in Java like so:

In the Superclass, I overrode the equals function:

```
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
```
I then used the now available .equals function to compare the farm animals who are supposedly all "equals".

```
       if (napoleon.equals(snowball)) {
        System.out.println("Being a pig in an Animal Farm is quite thrilling!");
      }
      if (napoleon.equals(boxer) == false) {
        System.out.println("Pretty unfair for " + boxer.getName());
      }
      if (boxer.equals(benjamin) == true) {
        System.out.println(boxer.getName() +" is equal to " + benjamin.getName());
      }
```

OUTPUT:
  <p>All animals are eqals, but some animals are more equal than others.
  
  <p>Two pigs who are more equals then others, are equals between each others.
    Being a pig in an Animal Farm is quite thrilling!</p>

  <p>Napoleonis more equal then Boxer as the latter is not a Pig.
    Pretty unfair for Boxer</p>

  <p>These two are equals</p>
    Boxer is equal to Benjamin<p>
