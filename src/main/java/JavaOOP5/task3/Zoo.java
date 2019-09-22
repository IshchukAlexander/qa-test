package JavaOOP5.task3;

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
        System.out.println("Размер списка до удаления: " + arrayList.size());
        // удаление элементов по индексу
        arrayList.remove(2); // cat
        arrayList.remove(3); //rabbit
        arrayList.remove(5);  //frog
        // размер листа на текущее время
        System.out.println("Размер списка после удаления: "+ arrayList.size());
        System.out.println(arrayList);


    }
}
