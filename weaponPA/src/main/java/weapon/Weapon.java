package weapon;

public abstract class Weapon {

    private String producentName;
    private String modelName;

    public Weapon(String producentName, String modelName) {
        this.producentName = producentName;
        this.modelName = modelName;
    }

    public String getProducentName() {
        return producentName;
    }

    public String getModelName() {
        return modelName;
    }

    public abstract String attack();

    public abstract String makeSound();
}
