package haiducgeluweek5;

/***
 * The alien character.
 *
 * @author Gelu Stefan Haiduc - haiduc.gelu@yahoo.com
 * @version 1.000 (current version number of the program)
 */
public class Alien implements Character {
    int health = 100;
    int energy = 100;
    boolean isDead = false;
    int alienAttack;

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
     * It bites an human.
     *
     * @return The alien bite.
     */
    int biteHuman() {
        this.energy = this.energy - 10;

        if (this.energy <= 100 && this.energy >= 80) {
            alienAttack = 25;
        } else if (this.energy <= 80 && this.energy >= 50) {
            alienAttack = 15;
        } else {
            alienAttack = 10;
        }

        return alienAttack;
    }

    /***
     * Prints the stats.
     * It return nothing.
     */
    void printStats() {
        System.out.println("\nAlien");
        System.out.println("Health is: " + this.health);
        System.out.println("Energy is: " + this.energy);
        System.out.println("Is he dead: " + isDead());
    }
}


