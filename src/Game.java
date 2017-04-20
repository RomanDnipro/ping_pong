public class Game {

    public static void main(String[] args) {

        Ball ball = new Ball();
        Player player1 = new Player(ball, 10, "ping");
        Player player2 = new Player(ball, 10, "pong");
    }
}
