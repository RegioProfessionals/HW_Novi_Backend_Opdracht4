// import:

// name and sort of class:
public class Main {
//    the main method
    public static void main(String[] args) {
// name and type of variables/arrays:


// instantiate objects:
FirePokemon pokemon056 = new FirePokemon("056", "Nagasaki", "FirePokemon", "FlameThrower actively throwing fire 360 degrees", "FireExtinguisher actively throwing foam 360 degrees", 121, 1200);
ElectricPokemon pokemon411 = new ElectricPokemon("411", "Suzuki", "ElectricPokemon", "ElectricPowerBeam deployed", "PowerOutage within a range of 5 miles", 622, 456);
WaterPokemon pokemon178 = new WaterPokemon("178", "Fukushima", "WaterPokemon", "WaterThrower actively throwing water 360 degrees", "Speedboat at highspeed moving out of sight", 254, 841);
GrassPokemon pokemon772 = new GrassPokemon("772", "ZinZanZen", "GrassPokemon", "Killing the opponent with kindness", "Mindfulness state of mind activated", 302, 110);

// call for execution of methods in underlying classes

        pokemon056.makeSound();
        pokemon178.makeSound();
        pokemon411.makeSound();
        pokemon772.makeSound();

        pokemon772.chooseAttackOrDefend();
        pokemon178.eat();



// stay away from these 2 } they close the class and main method
    }
}