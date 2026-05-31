public class Decepticon extends Transformer {
    private String teamName;
    private final String eyeColor = "Red";
    private boolean kindness = false;
    public Decepticon(String name, String teamName) {
        super(name);
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
    }

    public boolean isKindness() {
        return kindness;
    }

    public void setKindness(boolean kindness){
        this.kindness = kindness;
    }

    public void transform(String type) {
        System.out.println(getName() + " transforms into " + type); // добавлен параметр type для передачи типа трансформации
    }
}