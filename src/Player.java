public class Player extends Thread {

    private final Ball ball;
    private final long timelnMillis;
    private final String word;

    public Player(Ball ball, long timelnMillis, String word) {
        this.ball = ball;
        this.timelnMillis = timelnMillis;
        this.word = word;
    }

    public void startPlay(){

    }
}
