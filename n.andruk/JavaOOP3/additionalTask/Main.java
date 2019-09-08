package additionalTask;

public class Main extends Printer {
    public static void main(String[] args) {
        Printer  printer = new Printer();
        Printer main = new Main();

        main.print("Привет я сообщение ");
        printer.print("Привет я другое сообщение", " тестовое сообщение ");

    }
}
