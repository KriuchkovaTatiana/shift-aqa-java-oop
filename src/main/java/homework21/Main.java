public class Main {
    public static void main(String [] args) {
        Autobot bumblebee = new Autobot("Bumblebee", "Autobots");
        //bumblebee.setKindness(false); // сеттер для изменения свойства kindness
        bumblebee.run();;
        bumblebee.fire();
        bumblebee.charge();
        bumblebee.transform();

        Decepticon megatron = new Decepticon("Megatron", "Decepticons");
        //megatron.setKindness(true);
        megatron.run();;
        megatron.fire();
        megatron.charge();
        megatron.transform("an aircraft");

    }
}
