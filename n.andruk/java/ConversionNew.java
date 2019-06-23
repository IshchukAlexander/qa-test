import java.util.Scanner;

public class ConversionNew {
   public static final double uah_to_usd = 0.0388;
   public static final double uah_to_eur = 0.0337;
   public static final  double usd_to_uah = 26.16;
   public static final  double usd_to_eur = 0.88;
   public static final double eur_to_uah = 29.46;
   public static final  double eur_to_usd = 1.13;
     public static void main(String[] args) {
        System.out.println( "Какую валюту хотите продать ? (usd, uah, eur) :");
        Scanner buy = new Scanner(System.in);
        String currency1= buy.next();
        System.out.println( "Какую валюту купить ? (usd, uah, eur) :");
        Scanner sell = new Scanner(System.in);
        String currency2 = sell.next();

        System.out.println( "Сумма  :");
        Scanner m= new Scanner(System.in);
        double money = m.nextDouble();
        if (money < 0){
            System.out.println("Неверное значение!!!");
            return;
        }
        if (currency1.equals("uah") && currency2.equals("usd")){
            System.out.println("Вы покупаете usd за uah = "+ (money * uah_to_usd)+"$");

        }else if (currency1.equals("uah") && currency2.equals("eur")){
            System.out.println("Вы покупаете eur за uah = "+ (money * uah_to_eur) + "€");
        }else  if (currency1.equals("usd") && currency2.equals("uah")){
            System.out.println("Вы покупаете uah за usd = "+ (money * usd_to_uah)+"₴");
        }else if (currency1.equals("usd") && currency2.equals("eur")){
            System.out.println("Вы покупаете eur за usd = "+ (money * usd_to_eur)+"€");
        }else if (currency1.equals("eur") && currency2.equals("uah")){
            System.out.println("Вы покупаете uah за eur = "+ (money * eur_to_uah)+"₴");
        }else if (currency1.equals("eur") && currency2.equals("usd")){
            System.out.println("Вы покупаете usd за eur = "+ (money * eur_to_usd)+"$");
        } else  if (currency1.equals("usd") && currency2.equals("usd")){
            System.out.println(money);
        }else  if (currency1.equals("eur") && currency2.equals("eur")){
            System.out.println(money);
        }else if (currency1.equals("uah") && currency2.equals("uah")){
            System.out.println(money);
        } else {
            System.out.println("Такой валюты нету");
        }
}
}
//    public static double convUAHtoUSD ( double money){
//        System.out.println("Вы покупаете usd за uah = "+ (money * uah_to_usd)+"$");
//}
//    public static void convUAHtoEUR ( double money){
//    System.out.println("Вы покупаете eur за uah = "+ (money * uah_to_eur) + "€");
//}
//    public static void convUSDtoUAH ( double money){
//        System.out.println("Вы покупаете uah за usd = "+ (money * usd_to_uah)+"₴");
//    }
//    public static void convUSDtoEUR ( double money){
//        System.out.println("Вы покупаете eur за usd = "+ (money * usd_to_eur)+"€");
//    }
//    public static void convEURtoUAH ( double money){
//        System.out.println("Вы покупаете uah за eur = "+ (money * eur_to_uah)+"₴");
//    }
//    public static void convEURtoUSD ( double money){
//        System.out.println("Вы покупаете usd за eur = "+ (money * eur_to_usd)+"$");
//    }
//}
