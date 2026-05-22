public interface Action {
    String getName(); // для использования имени трансформера
    default void run() {
        System.out.println(getName() + " is running");
    }
    void fire();
    void charge();
}
