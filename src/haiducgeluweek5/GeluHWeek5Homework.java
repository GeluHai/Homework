package haiducgeluweek5;

/***
 * Represents the main class that contains the main method.
 *
 * @author Gelu Stefan Haiduc - haiduc.gelu@yahoo.com
 * @version 1.000 (current version number of the program)
 */
public class GeluHWeek5Homework {

    /***
     * Main method.
     * It returns nothing. It only displays information.
     *
     * @param args yes
     */
    public static void main(String[] args) {
        Human h1 = new Human();
        Alien a1 = new Alien();
        God g1 = new God();
        Human h2 = new Human();
        Alien a2 = new Alien();

        h1.printStats();
        a1.printStats();

        h1.setHealth(h1.health, a1.biteHuman());

        System.out.print("\n\n!!!NEW STATS!!!");
        h1.printStats();
        a1.printStats();

        a1.setHealth(a1.health, h1.shootAlien());
        a1.setHealth(a1.health, h1.shootAlien());

        System.out.print("\n\n!!!NEW STATS!!!");
        h1.printStats();
        a1.printStats();

        a1.setHealth(a1.health, h1.shootAlien());
        a1.setHealth(a1.health, h1.shootAlien());
        h1.setHealth(h1.health, a1.biteHuman());
        a1.setHealth(a1.health, h1.shootAlien());
        a1.setHealth(a1.health, h1.shootAlien());
        h1.setHealth(h1.health, a1.biteHuman());
        a1.setHealth(a1.health, h1.shootAlien());

        System.out.print("\n\n!!!NEW STATS!!!");
        h1.printStats();
        a1.printStats();


        h2.setHealth(h1.health, g1.godAttack);
        a2.setHealth(a1.health, g1.godAttack);

        System.out.print("\n\n!!!NEW STATS!!!");
        g1.printStats();
        h2.printStats();
        a2.printStats();
    }
}
