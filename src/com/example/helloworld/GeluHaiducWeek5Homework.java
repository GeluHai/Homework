package com.example.helloworld;

public class GeluHaiducWeek5Homework {
    public static void main(String[] args) {
        Human h1=new Human();
        Alien a1=new Alien();

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
    }
}

interface Character{
    int getHealth();
    int setHealth(int health, int att);
    boolean isDead();
}

class Human implements Character{
    int health=100;
    int ammo=200;
    boolean isDead=false;

    public int getHealth(){
        return this.health;
    }
    public int setHealth(int health, int att){
        return this.health=this.health-att;
    }
    public boolean isDead(){
        if (this.health>=0){
            return this.isDead=false;
        }
        else return this.isDead=true;
    }
    int shootAlien(){
        this.ammo=this.ammo-15;
        return 15;
    }

    void printStats(){
        System.out.println("\nHuman");
        System.out.println("Health is: " + this.health);
        System.out.println("Ammo is: " + this.ammo);
        System.out.println("Is he dead: " + isDead());
    }


}

class Alien implements Character{
    int health=100;
    int energy=100;
    boolean isDead=false;
    int attv;

    public int getHealth(){
        return this.health;
    }
    public int setHealth(int health, int att){
        return this.health=this.health-att;
    }
    public boolean isDead(){
        if (this.health>=0){
            return this.isDead=false;
        }
        else return this.isDead=true;
    }
    int biteHuman(){
        this.energy=this.energy-10;

        if (this.energy<=100&&this.energy>=80){
            attv=25;
        }
        else if (this.energy<=80&&this.energy>=50){
            attv=15;
        }
        else{
            attv=10;
        }

        return attv;
    }

    void printStats(){
        System.out.println("\nAlien");
        System.out.println("Health is: " + this.health);
        System.out.println("Energy is: " + this.energy);
        System.out.println("Is he dead: " + isDead());
    }

}

