package weapon.coldsteel;

import weapon.Weapon;

public abstract class Coldsteel extends Weapon {

    public Coldsteel(String producentName, String modelName) {
        super(producentName, modelName);
    }

    public abstract String attack();

    public String makeSound(){
        return "Ciach";
    };
}
