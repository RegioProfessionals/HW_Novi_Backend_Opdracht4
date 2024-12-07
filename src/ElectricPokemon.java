//    import:

//    name and sort of class:
public class ElectricPokemon extends JapanesePokemon {
    //    name and type of variables:
    public String pokemonName;
    private String attack;
    private String defence;

    //    constructor(s):
    public ElectricPokemon(String pokemonID, String pokemonName, String pokemonType, String attack, String defence, int healthPoints, int experiencePoints) {
        super(pokemonID, healthPoints, experiencePoints, pokemonType);
        this.pokemonName = pokemonName;
        this.electricBeam = electricBeam;
        this.powerOutage = powerOutage;

//    getters:
        public int getAttack() {
            return attack;
        }
        public int getDefence() {
            return defence;
        }
//    setters:
        public void setAttack(String attack) {
            this.attack = attack;
        }
        public void setDefence(String defence) {
            this.defence = defence;
        }

//    method(s):
        public void printPokemon() {
            System.out.println("This is " + PokemonName + " with ID:" + pokemonID + ". It's a " + pokemonType + "-Pokemon and it's current health- and experience-status is: " + healthPoints + "/" + experiencePoints);
        }
//    stay away from this } it closes the class
}

