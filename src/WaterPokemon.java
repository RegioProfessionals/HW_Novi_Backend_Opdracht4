//import:

//    name and sort of class:
public class WaterPokemon extends JapanesePokemon {
//    name and type of variables:
    public String pokemonName;
    private String attack;
    private String defense;
    public String nameAndID;
    private int newHealthPoints;

//    constructor(s):
    public WaterPokemon(String pokemonID, String pokemonName, String pokemonType, String attack, String defense, int healthPoints, int experiencePoints) {
        super(pokemonID, healthPoints, experiencePoints, pokemonType);
        this.pokemonName = pokemonName;
        this.attack = attack;
        this.defense = defense;
    }
//    getters:
    public String getAtString() {
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

        public void eat() {
        nameAndID = "pokemon" + this.pokemonID;
        newHealthPoints = this.getHealthPoints() + 6;
            System.out.println(nameAndID);
        System.out.println("This round " + pokemonName + "/" + pokemonID + " is trying to get some food." +
                " HealthPoints will rise with 6 points. The old value was: " + this.getHealthPoints() +
                ".The new value will be " + newHealthPoints + " half an hour after diner.");
        setHealthPoints(newHealthPoints);
            System.out.println("Print new value:" + this.getHealthPoints());
    }

        @Override
        public void makeSound() {
            System.out.println(pokemonName + "/" + pokemonID + ": " + "Who wants to get wet?");
        }


//    stay away from this } it closes the class
}