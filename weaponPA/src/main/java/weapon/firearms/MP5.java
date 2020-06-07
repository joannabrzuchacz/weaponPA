package weapon.firearms;

public class MP5 extends Firearm{

    public MP5(String producentName, String modelName) {
        super(producentName, modelName);
    }

    public String attack() {
        return "Multiple shots";
    }
}
