package task2;

import javax.swing.text.TabExpander;
import java.util.Scanner;

abstract class AbstractHandler{
    abstract void open();
    abstract void create ();
    abstract void change ();
    abstract void save () ;
}

class XMLHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("Могу открыть файл типа XML");
    }

    @Override
    void create() {
        System.out.println("Могу создать файл типа XML");
    }

    @Override
    void change() {
        System.out.println("Могу редактировать файл типа XML");
    }

    @Override
    void save() {
        System.out.println("Могу сохратить файл типа XML");
    }
}
class TXTHandler extends  AbstractHandler{
    @Override
    void open() {
        System.out.println("Могу открыть файл типа TXT");
    }

    @Override
    void create() {
        System.out.println("Могу создать файл типа TXT");
    }

    @Override
    void change() {
        System.out.println("Могу редактировать файл типа TXT");
    }

    @Override
    void save() {
        System.out.println("Могу сохратить файл типа TXT");
    }
}
class DOCHandler extends AbstractHandler{
    @Override
    void open() {
        System.out.println("Могу открыть файл типа DOC");
    }

    @Override
    void create() {
        System.out.println("Могу создать файл типа DOC");
    }

    @Override
    void change() {
        System.out.println("Могу редактировать файл типа DOC");
    }

    @Override
    void save() {
        System.out.println("Могу сохратить файл типа DOC");
    }
}


public class Main {
    public static void main(String[] args) {
System.out.println("Введите формат файла : XML/TXT/DOC");
        Scanner sc = new Scanner(System.in);
        String fail = sc.nextLine();

        if (fail.equals("XML")){
            XMLHandler xml = new XMLHandler();
            xml.open();
            xml.create();
            xml.change();
            xml.save();
        } else if (fail.equals("TXT")){
            TXTHandler txt = new TXTHandler();
            txt.open();
            txt.create();
            txt.change();
            txt.save();
        }else if (fail.equals("DOC")){
            DOCHandler doc = new DOCHandler();
            doc.open();
            doc.create();
            doc.change();
            doc.save();
        } else {
            System.out.println("Error");
        }
    }
}
