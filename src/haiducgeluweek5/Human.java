package haiducgeluweek5;

/***
 * The human character.
 *
 * @author Gelu Stefan Haiduc - haiduc.gelu@yahoo.com
 * @version 1.000 (current version number of the program)
 */
public class Human implements Character {
    int health = 100;
    int ammo = 200;
    boolean isDead = false;
    int humanAttack = 15;

    /***
     * It gets the health.
     *
     * @return It returns the health.
     */
    public int getHealth() {
        return this.health;
    }

    /***
     * It sets the health after an attack.
     *
     * @param health The original health.
     * @param attack The attack value.
     * @return The new health after an attack.
     */
    public int setHealth(int health, int attack) {
        return this.health = this.health - attack;
    }

    /***
     * It tels if the character is dead or not.
     *
     * @return If dead or not.
     */
    public boolean isDead() {
        if (this.health >= 0) {
            return this.isDead = false;
        } else return this.isDead = true;
    }

    /***
     * It shoots an alien.
     *
     * @return The human attack.
     */
    int shootAlien() {
        this.ammo = this.ammo - humanAttack;
        return humanAttack;
    }

    /***
     * Prints the stats.
     * It return nothing.
     */
    void printStats() {
        System.out.println("\nHuman");
        System.out.println("Health is: " + this.health);
        System.out.println("Ammo is: " + this.ammo);
        System.out.println("Is he dead: " + isDead());
    }
}