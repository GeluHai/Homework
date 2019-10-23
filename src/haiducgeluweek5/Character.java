package haiducgeluweek5;

/***
 * The interface of an character.
 *
 * @author Gelu Stefan Haiduc - haiduc.gelu@yahoo.com
 * @version 1.000 (current version number of the program)
 */
public interface Character {
    /***
     * Abstract method.
     *
     * @return It should return the health.
     */
    int getHealth();

    /***
     * Abstract method.
     *
     * @param health The original health.
     * @param attack The attack value.
     * @return It should return the new health after an attack.
     */
    int setHealth(int health, int attack);

    /***
     * Abstract method.
     *
     * @return It should return if dead or alive.
     */
    boolean isDead();
}



