


public class Game {

    /*public static void main(String[] args)  throws InterruptedException {

        Ball ball = new Ball();
        Player player1 = new Player(ball, 1000, "ping");
        Player player2 = new Player(ball, 1000, "pong");
        player1.start();
        player2.start();
    }*/

    public static void main(String[] args) throws InterruptedException {
        Ball ball = new Ball();
        Player player1 = new Player(ball, 1000, "ping" );
        Player player2 = new Player(ball, 1000, "pong" );
        player1.start();
        player2.start();


    }
}
