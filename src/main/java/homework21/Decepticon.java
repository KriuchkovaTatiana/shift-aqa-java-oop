public class Decepticon extends Transformer {
    String teamName;
    final String eyeColor = "Red";
    boolean kindness = false;

    public Decepticon(String name, String teamName) {
        super(name);
        this.teamName = teamName;
    }

    public void setKindness(boolean kindness){
        this.kindness = kindness;
    }

    public void transform(String type) {
        System.out.println(name + " transforms into " + type); // добавлен параметр type для передачи типа трансформации
    }
}