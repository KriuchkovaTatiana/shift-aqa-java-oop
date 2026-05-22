public class Decepticon extends Transformer implements Action {
    String teamName;
    final String eyeColor = "Red";
    boolean kindness = false;

    public Decepticon(String name, String teamName) {
        super(name);
        this.teamName = teamName;
    }

    @Override
    public void fire(){
        System.out.println(name + " is firing");
    }

    @Override
    public void charge(){
        System.out.println(name + " is charging");
    }

    @Override
    public void transform() {
        System.out.println(name + " transforms into a vehicle, weapon or aircraft");
    }

    @Override
    public String toString() {
        return "Decepticon {name = " + name + ", team: " + teamName + ", kidness = " + kindness + "}";
    }
}