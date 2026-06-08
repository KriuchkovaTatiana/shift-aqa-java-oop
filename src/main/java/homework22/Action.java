public interface Action {

    void fire();
    void charge();
    default void run() {
        System.out.println("Transformer is running");
    };
}
