import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        Autobot bumblebee = new Autobot("Bumblebee", "Autobots");
        bumblebee.run();;
        bumblebee.fire();
        bumblebee.charge();
        bumblebee.transform();

        System.out.println();

        Decepticon megatron = new Decepticon("Megatron", "Decepticons");
        megatron.run();;
        megatron.fire();
        megatron.charge();
        megatron.transform();

        System.out.println();

        List<Transformer> transformers = new ArrayList<>();
        transformers.add(bumblebee);
        transformers.add(megatron);
        System.out.println(transformers);

    }
}
