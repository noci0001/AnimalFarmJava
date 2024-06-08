// 'All animals are equal. But some animals are more equal than others.'
// Mr Jones of Manor Farm is so lazy and drunken that one day he forgets to feed his livestock.
// The ensuing rebellion under the leadership of the pigs Napoleon and Snowball leads to the animals taking over the farm.
// Vowing to eliminate the terrible inequities of the farmyard, the renamed Animal Farm is organised to benefit all who walk on four legs.
// But as time passes, the ideals of the rebellion are corrupted, then forgotten. 
// And something new and unexpected emerges..

public class AnimalFarm {
   public static void main(String[] args) {
       Animal napoleon = new Pig("Napoleon", "Joseph Stalin");
       Animal boxer = new Horse("Boxer", "the working class (proletariat)");
       Animal benjamin = new Donkey("Benjamin", " the skeptical intellectuals");

       Animal[] animals = {napoleon, boxer, benjamin}; 
       for (Animal animal : animals) {
         animal.introduction();
         animal.work();
         animal.quote();
         animal.explain_quote();
       }
      }
}
