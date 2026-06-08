public class Autobot extends Transformer implements Action {
    String teamName;
    final String eyeColor = "Blue"; // final, т.к. значение eyeColor неизменно
    boolean kindness = true;

    public Autobot(String name, String teamName) {
        super(name); // вызов конструктора из класса Transformer для получения имени
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
        System.out.println(getName() + " transforms into a vehicle");
    }

    @Override
    public String toString() { // для отображения читаемой информации
        return "Autobot {name = " + getName() + ", team: " + teamName + ", kindness = " + kindness + "}";
    }

}
