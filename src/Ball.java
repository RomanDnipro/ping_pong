public class Ball {

    private boolean ballIsOcupide;

    public synchronized void gotBall() throws InterruptedException {
        if (ballIsOcupide){
            this.wait();
        }
        ballIsOcupide = false;
    }

    public synchronized void returnBall(){
        ballIsOcupide = true;
        this.notify();
    }
}
