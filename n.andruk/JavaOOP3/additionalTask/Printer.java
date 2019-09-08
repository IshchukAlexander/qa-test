package additionalTask;

public class Printer {
    void print(String value){
        // 30 - черный. 31 - красный. 32 - зеленый. 33 - желтый. 34 - синий. 35 - пурпурный. 36 - голубой. 37 - белый.
        System.out.println((char) 27 + "[32m"+value);
    }
    void print (String value1, String value2){
        System.out.println((char) 27 + "[33m"+value1 + (char)27+"[34m"+value2);
    }

}
