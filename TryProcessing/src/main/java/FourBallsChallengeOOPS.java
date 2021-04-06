import processing.core.PApplet;

class Circle {
    public int steps, diameter;
    public int xPos, yPos;

    public Circle(int steps, int diameter, int start, int height) {
        this.steps = steps;
        this.diameter = diameter;
        this.xPos = start;
        this.yPos = height * steps / 5;
    }
    public void updateX(){
        this.xPos += this.steps;
    }
}

public class FourBallsChallengeOOPS extends PApplet{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    public static final int START = 0;
    private static Circle[] circles;

    public static void main(String[] args) {
        PApplet.main("FourBallsChallengeOOPS",args);

        circles = new Circle[5];
        for (int i = 1; i <= 4; i++) circles[i] = new Circle(i, DIAMETER, START, HEIGHT);

    }

    @Override
    public void settings() {
        super.settings();

        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        for (int i = 1; i <=4 ; i++) {
            drawCircle(circles[i]);
            circles[i].updateX();
        }
    }

    private void drawCircle(Circle c) {
        ellipse(c.xPos, c.yPos, c.diameter, c.diameter);
    }
}
