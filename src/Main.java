
public class Main {
    public static Methods.State state = Methods.State.WELCOME;

    public static void main(String[] args) {
        Methods methods = new Methods();

        state = Methods.State.ENCRYPT;

       /* switch (state){
            case WELCOME -> methods.welcome();
            case ENCRYPT -> methods.encrypt();
        }*/

        System.out.println(state);
        /*if(state == Methods.State.WELCOME){
            methods.welcome();
        }
        if(state == Methods.State.ENCRYPT){
            methods.encrypt();
        }*/

    }
}