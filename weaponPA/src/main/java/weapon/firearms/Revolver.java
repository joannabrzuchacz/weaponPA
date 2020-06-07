package weapon.firearms;

public class Revolver extends Firearm{

    public Revolver(String producentName, String modelName) {
        super(producentName, modelName);
    }

    public String attack() {
        return "One shot";
    }
}
