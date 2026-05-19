public class Transformer {
    String name;
    public void run() {
        System.out.println(name + " is running");
    }
    public void fire() {
        System.out.println(name + " is firing");
    }
    public void charge() {
        System.out.println(name + " is charging");
    }
    public Transformer(String name) {
        this.name = name;
    }
}
