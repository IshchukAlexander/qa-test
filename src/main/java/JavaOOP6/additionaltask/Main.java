package JavaOOP6.additionaltask;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double add = calculator.addition(5.0,11.1);
        double mul = calculator.multiplication(6.0, 12.0);
        double div = calculator.division(36.0, 6.0);
        double sub = calculator.subtraction(26.0, 6.0);

        System.out.println("Сложение "+add + "\n"+"Умножение "+mul+"\n"+"Деление "+div+"\n"+"Вычитание "+sub);
    }
}
