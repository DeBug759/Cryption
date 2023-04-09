import java.util.Objects;

public class Main {
    public enum State{
        WELCOME,
        IDLE,
        HOME_OPTIONS,
        ENCRYPT,
        DECRYPT,
        GETTING_INPUT,
        EXIT;
    }

    public static State state = State.WELCOME;

    public static void main(String[] args) {
        Methods methods = new Methods();

        do{
            switch (state){
                case WELCOME -> methods.welcome();
                case ENCRYPT -> methods.encrypt();
                case EXIT -> methods.exit();
            }
        } while (State.EXIT != state);




    }
}