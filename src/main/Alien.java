package main;

public class Alien extends Sprite {
    private final int INITIAL_X = 400;

    public Alien(int x, int y) {
        super(x, y);

        initAlien();
    }

    private void initAlien() {
        loadImage("C:\\Users\\Tom\\IdeaProjects\\simple_games\\src\\images\\alien.png");
        getImageDimensions();
    }

    public void move() {
        if (x < 0) {
            x = INITIAL_X;
        }

        x -= 1;
    }


}
