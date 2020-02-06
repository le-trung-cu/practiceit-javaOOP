package programmeOOP.object;

/**
 * Rectangle
 */
public class Rectangle {

    private final int x, y, width, height;

    public Rectangle(final int x, final int y, final int width, final int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public Rectangle(Point p, final int width, final int height) {
        x = p.getX();
        y = p.getY();
        this.width = width;
        this.height = height;
    }

    public boolean contains(int x, int y) {
        return (x >= this.x) && (x <= this.x + width) && (y >= this.y) && (y <= this.y + height);
    }

    public boolean contains(Point p) {
        return contains(p.getX(), p.getY());
    }

    public Rectangle union(Rectangle rect) {
        int x1 = x > rect.x ? rect.x : x;
        int y1 = y > rect.x ? rect.y : y;

        int x2 = x + width < rect.x + rect.width ? rect.x + rect.width : x + width;
        int y2 = y + height < rect.y + rect.height ? rect.y + rect.height : y + height;

        return new Rectangle(x1, y1, x2 - x1, y2 - y1);
    }

    public Rectangle intersection(Rectangle rect) {
        int x1 = x > rect.x ? x : rect.x;
        int y1 = y > rect.y ? y: rect.y;

        int x2 = x + width > rect.x + width ? rect.x + width: x + width;
        int y2 = y + height > rect.y + height ? rect.y + height: y + height;

        if(x2 > x1 && y2 > y1){
            return new Rectangle(x1, y1, x2 - x1, y2 - y1);
        }
        return null;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Rectangle[x=" + x + ",y=" + y + ",width=" + width + ",height=" + height + "]";
    }

}