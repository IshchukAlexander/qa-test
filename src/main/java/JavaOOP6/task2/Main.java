package JavaOOP6.task2;

public class Main {
    public static void main(String[] args) {
        // Создаем экземпляры внутренних классов
        Vehicle.Wheel wheel = new Vehicle().new Wheel();
        Vehicle.Door door = new Vehicle().new Door();

        wheel.methodPrint();
        door.methodPrint();

    }
}
