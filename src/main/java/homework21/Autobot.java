public class Autobot extends Transformer {
    private String teamName;
    private final String eyeColor = "Blue"; // final, т.к. значение eyeColor неизменно
    private boolean kindness = true;

    public Autobot(String name, String teamName) {
        super(name); // вызов конструктора из класса Transformer для получения имени
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getEyeColor() {
        return eyeColor;
    } //cеттер не нужен - поле eyeColor final

    public boolean isKindness() {
        return kindness;
    }

    public void setKindness(boolean kindness){ // метод для изменения свойства kindness (по условию его можно менять)
        this.kindness = kindness;
    }

    public void transform() {
        System.out.println(getName() + " transforms into a vehicle");
    }
}
