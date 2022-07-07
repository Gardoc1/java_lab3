import Game.*;

public class Main {


    public static void main(String[] args) {
        Model model = new Model();
        View main_menu = new View();
        Controller controller = new Controller(model, main_menu);
    }

}