package Section08AdvancedJavaOOP.Encapsulation;

public class Main {
    public static void main(String[] args) {

//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health: " + player.healthRemaining());
//    }

        EnhancedPlayer saulo = new EnhancedPlayer("Saulo", 200, "Sword");
        System.out.println("Initial health is " + saulo.healthRemaining());

    }
}
