package task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int proKey = 123;
        int expKey = 321;
        System.out.println("Выберите версию документа Free/Pro/Exp : ");
        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine();
        if (c.equals("Free")){
            System.out.println("Free version");
            DocumentWorker documentWorker = new DocumentWorker();
            documentWorker.openDocument();
            documentWorker.editDocument();
            documentWorker.saveDocument();
        }else if (c.equals("Pro")){
            System.out.print("InputKey: ");
            int inputKey = sc.nextInt();
            if (inputKey==proKey){
                System.out.println("Pro version");
                DocumentWorker documentWorkerPro =new ProDocumentWorker();
                documentWorkerPro.openDocument();
                documentWorkerPro.editDocument();
                documentWorkerPro.saveDocument();
            }else {
                System.out.println("Ошибка активации. Неверный код активации!!!");
                System.out.println("Free version");
                DocumentWorker documentWorker = new DocumentWorker();
                documentWorker.openDocument();
                documentWorker.editDocument();
                documentWorker.saveDocument();
            }
        }else if (c.equals("Exp")) {
            System.out.print("InputKey: ");
            int inputKey = sc.nextInt();
            if (inputKey == expKey) {
                System.out.println("Exp version");
                DocumentWorker documentWorkerExp = new ExpertDocumentWorker();
                documentWorkerExp.openDocument();
                documentWorkerExp.editDocument();
                documentWorkerExp.saveDocument();
            } else {
                System.out.println("Ошибка активации. Неверный код активации!!!");
                System.out.println("Free version");
                DocumentWorker documentWorker = new DocumentWorker();
                documentWorker.openDocument();
                documentWorker.editDocument();
                documentWorker.saveDocument();
            }
        }else {
            System.out.println("Выберите из списка версию!!!");
        }

    }
}

