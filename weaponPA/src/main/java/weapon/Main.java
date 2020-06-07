package weapon;

import weapon.coldsteel.Knife;
import weapon.firearms.Revolver;

public class Main {
    public static void main(String[] args) {

        Weapon knife = new Knife("prod","model");
        System.out.println(knife.makeSound());
        System.out.println(knife.attack());
        Weapon revolver = new Revolver("T30","Revkiller");
        System.out.println(revolver.getModelName() + " makes sound like " + revolver.makeSound());
        System.out.println("... and kills with just "+revolver.attack());
    }
}
