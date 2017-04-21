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

            while (true) {
                ball.gotBall();
                sleep(timelnMillis);
                System.out.println(word);
                ball.returnBall();
            }

    }

    @Override
    public void run() {
        try {
            this.startPlay();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
