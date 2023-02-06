package INF101.lab2.pokemon;

import INF101.lab2.pokemon.IPokemon;
import INF101.lab2.pokemon.Pokemon;

public class Main {

    public static IPokemon pokemon1;
    public static IPokemon pokemon2;
    public static void main(String[] args) {
        pokemon1 = new Pokemon("Mew");
        pokemon2 = new Pokemon("Mewtwo");
    System.out.println(pokemon1.toString());
    System.out.println(pokemon2.toString());
    System.out.println();
        while (pokemon1.isAlive() && pokemon2.isAlive()) {
            pokemon1.attack(pokemon2);
            if (!pokemon2.isAlive()){
                break;    
            }
            pokemon2.attack(pokemon1);
            
        }

    }

}


