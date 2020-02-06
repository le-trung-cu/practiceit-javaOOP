package programmeOOP.object;

/**
 * Point
 */
public class Point {

    private int x;
    private int y;

    public Point(int x1, int y1) {
        x = x1;
        y = y1;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    /**
     * BJP4 Exercise 8.1: quadrantPoint
     * 
     * @return
     */
    public int quadrant() {
        if (this.x * this.y == 0) {
            return 0;
        } else if (this.x > 0) {
            if (this.y > 0)
                return 1;
            else
                return 4;
        } else {
            if (this.y > 0) {
                return 2;
            } else
                return 3;
        }
    }

    /**
     * BJP4 Exercise 8.2: flipPoint
     */
    public void filp() {
        this.x += this.y;
        this.y -= this.x;
        this.x = -(this.x + this.y);

        // int t = this.x;
        // this.x = -this.y;
        // this.y = -t;
    }

    /**
     * 
     * @param point
     * @return
     */
    public int manhattanDistance(Point point) {
        return Math.abs(this.x - point.x) + Math.abs(this.y - point.y);
    }

    /**
     * BJP4 Exercise 8.4: isVerticalPoint
     * 
     * @param other
     * @return
     */
    public boolean isVertical(Point other) {
        return this.x == other.x;
    }

    /**
     * BJP4 Exercise 8.5: slopePoint
     * 
     * @param other
     * @return
     */
    public double slope(Point other) {
        if (this.x == other.x) {
            throw new IllegalArgumentException();
        }

        return (double) (other.y - this.y) / (other.x - this.x);
    }

    /**
     * BJP4 Exercise 8.6: isCollinearPoint
     */
    public boolean isCollinear(Point p1, Point p2) {
        if ((p2.x - p1.x) == 0 || (this.x - p1.x) == 0) {
            if ((p2.x - p1.x) == 0 && (this.x - p1.x) == 0) {
                return true;
            } else
                return false;
        }

        double slope1 = (double) (p2.y - p1.y) / (p2.x - p1.x);
        double slope2 = (double) (this.y - p1.y) / (this.x - p1.x);

        return Math.round(slope1 * 10000) == Math.round(slope2 * 10000);
    }
}