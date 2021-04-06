import processing.core.PApplet;

public class TryProcessing extends PApplet{


    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 100;

    @Override
    public void settings() {
        super.settings();

        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
       super.setup();
//        drawCircle(WIDTH / 2, HEIGHT / 2, 100);

    }

    @Override
    public void draw() {
//        super.draw();
        changeBG();
        drawCircle(mouseX, mouseY, DIAMETER);

    }

    private void changeBG() {
        background(180);
    }

    private void drawCircle(int mouseX, int mouseY, int diameter) {
        ellipse(mouseX, mouseY, diameter, diameter);
    }

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }
}