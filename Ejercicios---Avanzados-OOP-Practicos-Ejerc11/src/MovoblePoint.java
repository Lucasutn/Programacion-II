public class MovoblePoint implements Movable {

    int x;
    int y;
    int xSpeed;
    int ySpeed;


    public MovoblePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovoblePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    @Override
    public void moveUp() {
        this.x=this.y+1;

    }

    @Override
    public void moveDown() {
        this.y=this.y-1;

    }

    @Override
    public void moveLeft() {
        this.x=this.x-1;

    }

    @Override
    public void moveRight() {
        this.x=this.x+1;

    }
}
