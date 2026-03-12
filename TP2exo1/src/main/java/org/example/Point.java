package org.example;

public class Point {
    private double abs;
    private double ord;

    public double getAbs() {
        return abs;
    }

    public double getOrd() {
        return ord;
    }

    public void setAbs(double abs) {
        this.abs = abs;
    }

    public void setOrd(double ord) {
        this.ord = ord;
    }

    public Point(double abs, double ord) {
        this.abs = abs;
        this.ord = ord;
    }
    public double calculerDistance(Point p)
    {
        return Math.sqrt(Math.pow(p.abs-this.abs, 2) + Math.pow(p.ord-this.ord, 2));
    }
    public Point calculerMilieu(Point p)
    {
        double xM = (this.abs + p.abs)/2;
        double yM = (this.ord + p.ord)/2;
        return new Point(xM,yM);
    }
    @Override
    public String toString() {
        return "Point{" +
                "abs=" + abs +
                ", ord=" + ord +
                '}';
    }
}
