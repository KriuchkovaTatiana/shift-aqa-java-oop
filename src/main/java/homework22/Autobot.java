public class Autobot extends Transformer implements Action {
    String teamName;
    final String eyeColor = "Blue"; // final, т.к. значение eyeColor неизменно
    boolean kindness = true;

    public Autobot(String name, String teamName) {
        super(name); // вызов конструктора из класса Transformer для получения имени
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
        System.out.println(name + " transforms into a vehicle");
    }

    @Override
    public String toString() { // для отображения читаемой информации
        return "Autobot {name = " + name + ", team: " + teamName + ", kindness = " + kindness + "}";
    }

}
