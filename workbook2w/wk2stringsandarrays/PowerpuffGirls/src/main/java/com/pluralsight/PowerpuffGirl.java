package com.pluralsight;

public class PowerpuffGirl {
    //instance variables (typically hidden)
    private String name;
    private int health;
    private String outfitColor;
    private  int attackDamage;
    private int power; //if <20 print "Drink potion"
    //constructor
    public PowerpuffGirl(String name, String outfitColor){
        this.name = name;
        this.outfitColor = outfitColor;
        this.power = 100;//default
        this.health = 100;//default
    }
    public String getName(){
        return this.name;
    }
    public int getHealth(){
        return this.health;
    }
    public void setHealth(int newHealth){
        if (newHealth > 0 && newHealth <= 100) {
            this.health = newHealth;
        } else{
            System.out.println("Come on, it's impossible!");
        }
    }
    public void Heal(int howMuchHealth){
        int sum = this.health + howMuchHealth;
        if (sum > 100){
            this.health = 100;
            System.out.println("Fully recovered");
        }else{
            setHealth(sum);
        }
    }
}
