package dragonsVillage.Datagrams.basicDatagram;

public class MoveDatagram {

    private int x;
    private int y;
    private int speed;

    public MoveDatagram(int x, int y, int speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MoveDatagram that = (MoveDatagram) o;

        if (speed != that.speed) return false;
        if (x != that.x) return false;
        if (y != that.y) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        result = 31 * result + speed;
        return result;
    }

    @Override
    public String toString() {
        return "MoveDatagram{" +
                "x=" + x +
                ", y=" + y +
                ", speed=" + speed +
                '}';
    }
}
