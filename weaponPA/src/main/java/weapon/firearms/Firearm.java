package weapon.firearms;
import weapon.Weapon;

public abstract class Firearm extends Weapon{

    public Firearm(String producentName, String modelName) {
        super(producentName, modelName);
    }

    public abstract String attack();

    public String makeSound(){
        return "Ratata";
    };
}
