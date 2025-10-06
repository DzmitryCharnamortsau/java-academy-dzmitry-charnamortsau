package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main (String[] args){
        int health = 100;      // Your hero’s health ❤️
        int gold = 50;         // Starting gold 💰
        String weapon = "Sword"; // Your first weapon ⚔️
        int potions = 3;

        System.out.println("Hero starts with:");
        System.out.println("Health: " + health);
        System.out.println("Gold: " + gold);
        System.out.println("Weapon: " + weapon);
        System.out.println("Potions: " + potions);
        for (int room = 1; room <=5; room++){
            System.out.println("You enter room " + room);
            for (int goblin = 2; goblin <=2; goblin++){
                System.out.println("Fighting goblin " + goblin);
            }
        }
        specialAttack("sword");
        xpPoints(48);
        greetHero("Good job, my friend!");
    }
    public static void specialAttack(String weapon){
        System.out.println("Swinging " + weapon);
    }
    public static void xpPoints(double points){
        System.out.println("You've got " + points + " points");
    }
    public static void greetHero(String greeting){
        System.out.println(greeting);
    }
    int x = 50;


}
