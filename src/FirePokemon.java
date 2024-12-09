///    import:

//    name and sort of class:
public class FirePokemon extends JapanesePokemon {
    //    name and type of variables:
    public String pokemonName;
    private String attack;
    private String defense;
    private int newHealthPoints;

//    constructor(s):
    public FirePokemon(String pokemonID, String pokemonName, String pokemonType, String attack, String defense, int healthPoints, int experiencePoints) {
        super(pokemonID, healthPoints, experiencePoints, pokemonType);
        this.pokemonName = pokemonName;
        this.attack = attack;
        this.defense = defense;
    }

//    getters:
        public String getAttack() {
            return attack;
        }
        public String getDefense() {
            return defense;
        }
//    setters:
        public void setAttack(String attack) {
            this.attack = attack;
        }
        public void setDefense(String defense) {
            this.defense = defense;
        }


//    method(s):
        public void sleep() {
        newHealthPoints = this.getHealthPoints() + 12;

                System.out.println("This round " + pokemonName + "/" + pokemonID + " is trying to get some sleep." +
                        " HealthPoints will rise with 12 points. The old value was: " + this.getHealthPoints() +
                        ".The new value will be " + newHealthPoints + " as soon as his eyes open.");
                setHealthPoints(newHealthPoints);
                System.out.println("Print new value:" + this.getHealthPoints());
            }

//
        @Override
        public void makeSound() {
            System.out.println(pokemonName + "/" + pokemonID + ": " + "Who wants to get burnt?");
        }
//    stay away from this } it closes the class

}
