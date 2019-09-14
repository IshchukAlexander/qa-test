package task3;

interface Playable {
    void play ();
    void pause ();
    void stop ();
}
interface Recodable{
    void record ();
    void pause ();
    void stop ();

}

class Player implements Playable, Recodable {
    @Override
    public void record() {
        System.out.println("Происходит запись ");
    }

    @Override
    public void stop() {
        System.out.println("Запись остановлена");
    }

    @Override
    public void play() {
        System.out.println("Play");
    }

    @Override
    public void pause() {
        System.out.println("Pause");
    }
}

public class Main {
    public static void main(String[] args) {
        Player p =new Player();
        p.record();
        p.stop();
        p.play();
        p.pause();
    }
}
