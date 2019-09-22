package JavaOOP5.task2;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        // добавление по индексу
        arrayList.add(0, "wolf");
        arrayList.add(1, "viper");
        arrayList.add(2, "cat");
        arrayList.add(3, "dog");
        arrayList.add(4, "rabbit");
        arrayList.add(5, "lion");
        arrayList.add(6, "fox");
        arrayList.add(7, "frog");

        System.out.println(arrayList);
    }
    //Второй вариант , через for
//    ArrayList list = new ArrayList();
//    //Добавление елементов
//        for (int i = 0; i < 8; i++) {
//        list.add(i, "pet" + i);
//    }
//
//    //Вывод в цикле
//        for (Object o : list) {
//        System.out.println(o);
//    }
//}
}
