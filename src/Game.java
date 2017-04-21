public class Game {

    public static void main(String[] args) {

        Ball ball = new Ball();
        Player player1 = new Player(ball, 1000, "ping");
        Player player2 = new Player(ball, 1000, "pong");
         player1.start();
         player2.start();
    }
}
