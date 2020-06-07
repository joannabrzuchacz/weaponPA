package weapon.throwableWeapons;

import weapon.Weapon;

public abstract class ThrowableWeapon extends Weapon {

    public ThrowableWeapon(String producentName, String modelName) {
        super(producentName, modelName);
    }

    public abstract String attack();

    public String makeSound(){
        return "Boom!";
    };
}
