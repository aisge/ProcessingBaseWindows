import processing.core.PApplet;

public class MyApplet extends PApplet {

    @Override
    public void settings() {
        size(640, 480);
    }

    @Override
    public void setup() {
        frameRate(30);
    }

    @Override
    public void draw() {
        background(0);
        fill(0, 255,0);
        text("Implement me...", 50, 50);
    }

    @Override
    public void keyPressed() {

    }

}
