import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        System.out.println("Какую сумму Вы хотите получить ? ");
        Scanner sc = new Scanner(System.in);
        double credit = sc.nextDouble();

        if (credit > 0) {
            System.out.println("Желаете погасить кредит ? (yes/no)");
            String cRedit = sc.next();
            if (cRedit.equals("yes")) {
                System.out.println("Введите сумму для погашения кредита : ");
                double money = sc.nextDouble();
                payment(money, credit);
            } else if (cRedit.equals("no")) {
                System.out.println("Спасибо, что выбрали наш банк. Досвидания!");
            }else {
                 System.out.println("Не верное значение! ");
            }

            }else if (credit <=0){
            System.out.println("Введите пожалуйста корректную сумму!!!");
        }
    }


        public static void payment ( double money, double credit) {
            if (money == credit) {
                System.out.println("Кредит погашен!!!");
            } else if (money > credit) {
                System.out.println("Переплата составляет : " + (money - credit));
                System.out.println("Кредит погашен!!!");
            } else if (money <= 0) {
                System.out.println("Введите пожалуйста корректную сумму!!!");
            } else if (money >=0){
                System.out.println("Ваш кредит составляет : "+ credit);
                System.out.println("Вы внесли : " + money);
                System.out.println("Задолжность составляет : " + (credit-money));
        }
    }

}


