package weapon.throwableWeapons;

public class Granade extends ThrowableWeapon {


    public Granade(String producentName, String modelName) {
        super(producentName, modelName);
    }

    public String attack() {
        return "Explosion";
    }
}
