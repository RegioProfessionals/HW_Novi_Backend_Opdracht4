//    import:

//    name and sort of class:
public class JapanesePokemon {

    //    name and type of variables:
    public String pokemonID;
    private int healthPoints;
    private int experiencePoints;
    public String pokemonType;



    //    constructor(s):
    public JapanesePokemon(int pokemonID, int healthPoints, int experiencePoints, String PokemonType)){
        this.pokemonID = pokemonID;
        this.healthPoints = healthPoints;
        this.experiencePoints = experiencePoints;
        this.pokemonType = pokemonType;
    }

//    getters:

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    //    setters:
    public void setHealthPoints(String healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void setExperiencePoints(String experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    //    method(s):
    public void printCurrentPokemons() {
        System.out.println(pokemon056.getJapanesePokemon());
    }
//    stay away from this } it closes the class
}