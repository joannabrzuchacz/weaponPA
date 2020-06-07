package weapon.coldsteel;

public class Knife extends Coldsteel {

    public Knife(String producentName, String modelName) {
        super(producentName, modelName);
    }

    public String attack() {
        return "chlast chlast";
    }
}
