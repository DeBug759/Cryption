import java.util.Objects;

public class Main {
    public enum State{
        WELCOME,
        HOME_OPTIONS,
        ENCRYPT,
        DECRYPT,
        EXIT;
    }

    public static State state = State.WELCOME;

    public static void main(String[] args) throws InterruptedException {
        Methods methods = new Methods();

        do{
            switch (state){
                case WELCOME -> methods.welcome();
                case ENCRYPT -> methods.encrypt();
                case DECRYPT -> methods.decrypt();
                case HOME_OPTIONS -> methods.homeOptions();
                case EXIT -> methods.exit(State.EXIT);
            }
        } while (State.EXIT != state);

    }
}