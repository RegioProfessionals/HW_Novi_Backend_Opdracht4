//    import:

//    name and sort of class:
public class ElectricPokemon extends JapanesePokemon {
    //    name and type of variables:
    public String pokemonName;
    private String attack;
    private String defense;

    //    constructor(s):
    public ElectricPokemon(String pokemonID, String pokemonName, String pokemonType, String attack, String defense, int healthPoints, int experiencePoints) {
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
//        public void printPokemon() {
//            System.out.println("This is " + PokemonName() + " with ID:" + pokemonID + ". It's a " + pokemonType + "-Pokemon and it's current health- and experience-status is: " + healthPoints + "/" + experiencePoints);
//        }

        @Override
        public void makeSound() {
            System.out.println(pokemonName + "/" + pokemonID + ": " + "Who wants to get toasted?");
        }
//    stay away from this } it closes the class
}

