package programmeOOP.object;

/**
 * Line
 */
public class Line {

    private Point p1, p2;

    public Line(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public Line(int x1, int y1, int x2, int y2){
        p1 = new Point(x1, y1);
        p2 = new Point(x2, y2);
    }

    public Point getP1(){
        return p1;
    }
    public Point getP2(){
        return p2;
    }

    public String toString(){
        return "[(" + (int) p1.getX() +", " + (int) p1.getY() + "), (" + (int) p2.getX() +", " + (int) p2.getY() +")]";
    }

    public double getSlope(){
        if(Math.round(p1.getX()*1000) == Math.round(p2.getX()*1000)){
            throw new IllegalStateException ();
        }
        return (double) (p2.getY() - p1.getY())/(p2.getX() - p1.getX());
    }

    public boolean isCollinear(Point p){
        if(p1.getX() == p2.getX() && p.getX() == p1.getX()){
            return true;
        }else if(p1.getX() == p2.getX() || p.getX() == p1.getX()){
            return false;
        }

        if(Math.round((double) 1000 * (p.getY() - p1.getY())/(p.getX() - p1.getX())) == Math.round((double) 1000 * (p2.getY() - p1.getY())/(p2.getX() - p1.getX()))){
            return true;
        }
        return false;
    }
}

