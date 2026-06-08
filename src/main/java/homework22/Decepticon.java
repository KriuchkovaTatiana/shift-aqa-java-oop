public class Decepticon extends Transformer implements Action {
    String teamName;
    final String eyeColor = "Red";
    boolean kindness = false;

    public Decepticon(String name, String teamName) {
        super(name);
        this.teamName = teamName;
    }

    @Override
    public void run(){
        System.out.println(getName() + " is running");
    }

    @Override
    public void fire(){
        System.out.println(getName() + " is firing");
    }

    @Override
    public void charge(){
        System.out.println(getName() + " is charging");
    }

    @Override
    public void transform() {
        System.out.println(getName() + " transforms into a vehicle, weapon or aircraft");
    }

    @Override
    public String toString() {
        return "Decepticon {name = " + getName() + ", team: " + teamName + ", kindness = " + kindness + "}";
    }
}