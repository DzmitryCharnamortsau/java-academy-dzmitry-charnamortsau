package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Todo: powerpuff fighting game
        //Features:
        //-Play online
        //Customizing characters
        //Solo mode
        //Finishing moves
        //Team attack
        //Health boost
        PowerpuffGirl blossom = new PowerpuffGirl("Blossom", "Pink");
        System.out.println(blossom.getName());
        blossom.setHealth(20);
        blossom.Heal(120);
    }
}