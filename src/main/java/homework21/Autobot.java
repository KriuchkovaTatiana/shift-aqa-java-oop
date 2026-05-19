public class Autobot extends Transformer {
    String teamName;
    final String eyeColor = "Blue"; // final, т.к. значение eyeColor неизменно
    boolean kindness = true;

    public Autobot(String name, String teamName) {
        super(name); // вызов конструктора из класса Transformer для получения имени
        this.teamName = teamName;
    }

    public void setKindness(boolean kindness){ // метод для изменения свойства kindness (по условию его можно менять)
        this.kindness = kindness;
    }

    public void transform() {
        System.out.println(name + " transforms into a vehicle");
    }
}
