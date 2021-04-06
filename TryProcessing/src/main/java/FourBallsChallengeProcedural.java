import processing.core.PApplet;

public class FourBallsChallengeProcedural extends PApplet{


    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int startPosition = 0;
    public static void main(String[] args) {
        PApplet.main("FourBallsChallengeProcedural", args);
    }

    @Override
    public void settings() {
        super.settings();

        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        for (int i = 1; i <=4 ; i++) {
            ellipse(startPosition * i, HEIGHT * i / 5, DIAMETER, DIAMETER);
        }
        startPosition++;
    }
}
