// 'All animals are equal. But some animals are more equal than others.'
// Mr Jones of Manor Farm is so lazy and drunken that one day he forgets to feed his livestock.
// The ensuing rebellion under the leadership of the pigs Napoleon and Snowball leads to the animals taking over the farm.
// Vowing to eliminate the terrible inequities of the farmyard, the renamed Animal Farm is organised to benefit all who walk on four legs.
// But as time passes, the ideals of the rebellion are corrupted, then forgotten. 
// And something new and unexpected emerges..

public class AnimalFarm {
   public static void main(String[] args) {
      Quote[] napoleonQuotes = {
        new Quote("All animals are equal, but some animals are more equal than others.", "This quote epitomizes Napoleon's manipulation of language and the distortion of the farm's principles, highlighting his hypocrisy and thirst for power"),
        new Quote("The creatures outside looked from pig to man, and from man to pig, and from pig to man again; but already it was impossible to say which was which.","This quote symbolizes Napoleon's transformation from revolutionary leader to oppressive dictator, blurring the lines between human and animal oppressors and highlighting the cyclical nature of tyranny."),
        new Quote("Power is not a means; it is an end. One does not establish a dictatorship in order to safeguard a revolution; one makes the revolution in order to establish the dictatorship.", "Napoleon's ruthless pursuit of power and control is laid bare in this quote, revealing his true motives behind the revolution and the betrayal of its ideals.")
      };
      Quote[] snowballQuotes = {
        new Quote("Comrades, you do not imagine, I hope, that we pigs are doing this in a spirit of selfishness and privilege? Many of us actually dislike milk and apples. I dislike them myself. Our sole object in taking these things is to preserve our health. Milk and apples (this has been proved by Science, comrades) contain substances absolutely necessary to the well-being of a pig. We pigs are brainworkers. The whole management and organization of this farm depend on us. Day and night we are watching over your welfare. It is for your sake that we drink that milk and eat those apples.", "Snowball delivers this speech to justify the special treatment that the pigs receive, using rhetoric and manipulation to convince the other animals that their actions are for the collective good."),
        new Quote("War is war. The only good human being is a dead one.", "Snowball expresses his belief in the necessity of conflict and violence in the pursuit of the animals' liberation from human oppression. This quote highlights Snowball's militant and uncompromising attitude towards the humans who oppress them."),
        new Quote("Four legs good, two legs bad.", "Snowball introduces this simple slogan as a maxim for the animals to follow, emphasizing the superiority of animalism over human exploitation. This slogan becomes a rallying cry for the animals and encapsulates the core principles of their rebellion against human tyranny.")
    };
       Animal napoleon = new Pig("Napoleon", "Joseph Stalin", true, napoleonQuotes);
       Animal snowball = new Pig("Snowball", "the intellectual and ideological opposition to tyranny and oppression, as well as the struggle for social justice and equality", false, snowballQuotes);
       Animal boxer = new Horse("Boxer", "the working class (proletariat)");
       Animal benjamin = new Donkey("Benjamin", " the skeptical intellectuals");

       Animal[] animals = {napoleon, snowball, boxer, benjamin}; 
       for (Animal animal : animals) {
         animal.introduction();
         animal.work();
         animal.quote();
         animal.explain_quote();
       }
      }
}
