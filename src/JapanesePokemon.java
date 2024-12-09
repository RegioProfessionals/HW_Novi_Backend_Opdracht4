//    import:

//    name and sort of class:
public abstract class JapanesePokemon {

//    name and type of variables:
    public String pokemonID;
    private int healthPoints;
    private int experiencePoints;
    public String pokemonType;


//    constructor(s):
    public JapanesePokemon(String pokemonID, int healthPoints, int experiencePoints, String PokemonType) {
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
    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    //    method(s):
    public void chooseAttackOrDefend () {
        System.out.println("A large Pokemon appears on the horizon. It appears to be a fire Pokemon, but it could also be an electric Pokemon. What are your orders? Attack(A) or defend(D)?");

    }
    public void eat() {}
    public void sleep() {}
    public void train() {}

    public abstract void makeSound();

    //    stay away from this } it closes the class
}