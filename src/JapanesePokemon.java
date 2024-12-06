//    import:

//    name and sort of class:
public class  JapanesePokemon{

//  instantiate objects of class WaterPokemon:
    WaterPokemon waterPokemon1 = new WaterPokemon() {
        super(name, type, healthPoints, experiencePoints);
        this.
}
//  instantiate objects of class FirePokemon:

//  instantiate objects of class GrassPokemon:

//  instantiate objects of class ElectricPokemon:








    //    name and type of variables:
    public String pokemonName;
    public String pokemonType;
    public String bestAttack;
    public String bestDefence;
    private int healthPoints;
    private int experiencePoints;


//    constructor(s):
    public JapanesePokemon(String pokemonName, String pokemonType, String bestAttack, String bestDefence, int healthPoints, int experiencePoints) {
        this.pokemonName = pokemonName;
        this.pokemonType = pokemonType;
        this.bestAttack = bestAttack;
        this.bestDefence = bestDefence;
        this.healthPoints = healthPoints;
        this.experiencePoints = experiencePoints;
    }

    public JapanesePokemon() {

    }

//    getters:

    public int getHealthPoints() {
        return healthPoints;
    }
    public int getExperiencePoint() {
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
        System.out.println(pokemon1.getJapanesePokemon());
    }
//    stay away from this } it closes the class
}