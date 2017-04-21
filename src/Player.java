public class Player extends Thread {

    private final Ball ball;
    private final long timelnMillis;
    private final String word;

    public Player(Ball ball, long timelnMillis, String word) {
        this.ball = ball;
        this.timelnMillis = timelnMillis;
        this.word = word;
    }

    public void startPlay() throws InterruptedException {
        synchronized (ball){
            while (true) {
                sleep(timelnMillis);
                System.out.println(word);
            }
        }
    }

    @Override
    public synchronized void start() {
        try {
            this.startPlay();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
