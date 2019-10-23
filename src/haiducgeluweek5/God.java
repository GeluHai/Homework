package haiducgeluweek5;

/***
 * The GOD character.
 *
 * @author Gelu Stefan Haiduc - haiduc.gelu@yahoo.com
 * @version 1.000 (current version number of the program)
 */
public class God implements Character {
    int health = 10000;
    boolean isDead = false;
    int godAttack = 1000;

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
     * It attacks someone.
     *
     * @return The god attack.
     */
    int shootSomeone() {
        return godAttack;
    }

    /***
     * Prints the stats.
     * It return nothing.
     */
    void printStats() {
        System.out.println("\nGOD");
        System.out.println("Health is: " + this.health);
        System.out.println("Attack is: " + this.godAttack);
        System.out.println("Is he dead: NEVER");
    }
}