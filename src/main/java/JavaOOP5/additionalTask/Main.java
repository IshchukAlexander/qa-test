package JavaOOP5.additionalTask;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // объявление списка
        ArrayList<String> arrayList = new ArrayList<String>();

        // добавление элементов в список
        arrayList.add("Александровна");
        arrayList.add("Юрьевна");
        arrayList.add("Михайловна");
        arrayList.add("Николаевич");
        arrayList.add("Владимировна");
        arrayList.add("Сергеевна");
        System.out.println(arrayList);

        System.out.println(" Index, The best teacher :");
        System.out.println(arrayList.indexOf("Николаевич"));
        System.out.println("Index, The bad teacher :");
        System.out.println(arrayList.indexOf("Юрьевна"));
    }
}
