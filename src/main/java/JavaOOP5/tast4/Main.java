package JavaOOP5.tast4;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        ListIterator<Integer> iterator = arrayList.listIterator();

        // Проходимся по массиву до конца
        while (iterator.hasNext()){
            // Редактируем елементы списка(+2 так как индекс итератора с 0)
            arrayList.set(iterator.nextIndex(),iterator.nextIndex()+2 );
            System.out.println(iterator.next());
        }

    }
}
