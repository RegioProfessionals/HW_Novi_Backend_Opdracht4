//    import:

//    name and sort of class:
public class JapanesePokemon {
//    instantiate objects of class WaterPokemon:
    WaterPokemon waterPokemon = new WaterPokemon(pokemonID, "Fukushima", pokemonType, "WaterThrower actively throwing water 360 degrees", "Speedboat at highspeed moving out of sight", getHealthPoints(), getExperiencePoints());
//    instantiate objects of class FirePokemon:
    FirePokemon firePokemon = new FirePokemon(pokemonID, "Nagasaki", pokemonType, "FlameThrower actively throwing fire 360 degrees", "FireExtinguisher actively throwing foam 360 degrees", getHealthPoints(), getExperiencePoints());
//    instantiate objects of class GrassPokemon:
    GrassPokemon grassPokemon = new GrassPokemon(pokemonID, "ZinZanZen", pokemonType, "Killing the opponent with kindness", "Mindfulness state of mind activated", getHealthPoints(), getExperiencePoints());
//    instantiate objects of class ElectricPokemon:
    ElectricPokemon electricPokemon = new ElectricPokemon(pokemonID, "Suzuki", pokemonType, "ElectricPowerBeam deployed", "PowerOutage within a range of 5 miles", getHealthPoints(), getExperiencePoints());

    //    name and type of variables:
    public String pokemonID;
    private int healthPoints;
    private int experiencePoints;
    public String pokemonType;

    public String pokemonName;
    public String attack;
    public String defence;


    //    constructor(s):
    public JapanesePokemon(int pokemonID, int healthPoints, int experiencePoints, String PokemonType))

    {
        this.pokemonID = pokemonID;
        this.healthPoints = healthPoints;
        this.experiencePoints = experiencePoints;
        this.pokemonType = pokemonType;
    }

    public JapanesePokemon() {

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
        System.out.println(pokemon1.getJapanesePokemon());
    }
//    stay away from this } it closes the class
}