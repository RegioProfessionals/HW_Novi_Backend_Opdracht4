///    import:

//    name and sort of class:
public class FirePokemon extends JapanesePokemon {
//    name and type of variables:
    public String pokemonName;
    private String attack;
    private String defence;

//    constructor(s):
    public FirePokemon(String pokemonID, String pokemonName, String pokemonType, String attack, String defence, int healthPoints, int experiencePoints) {
        super(pokemonID, healthPoints, experiencePoints, pokemonType);
        this.pokemonName = pokemonName;
        this.attack = attack;
        this.defence = defence;

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

//    stay away from this } it closes the class
}

