package org.example;

public class TroisPoints{
    private Point premier;
    private Point deuxieme;
    private Point troisieme;

    public TroisPoints(Point premier, Point deuxieme, Point troisieme) {
        this.premier = premier;
        this.deuxieme = deuxieme;
        this.troisieme = troisieme;
    }

    public Point getPremier() {
        return premier;
    }

    public void setPremier(Point premier) {
        this.premier = premier;
    }

    public Point getDeuxieme() {
        return deuxieme;
    }

    public void setDeuxieme(Point deuxieme) {
        this.deuxieme = deuxieme;
    }

    public Point getTroisieme() {
        return troisieme;
    }

    public void setTroisieme(Point troisieme) {
        this.troisieme = troisieme;
    }
    public boolean sontAlignes(){
        double dist12 = this.premier.calculerDistance(this.deuxieme), dist13 = this.premier.calculerDistance(this.troisieme),
                dist23 = this.deuxieme.calculerDistance(this.troisieme);

        if (dist12 == dist13 + dist23 ||  dist13 == dist12 +dist23 || dist23 == dist13 + dist12)
            return true;
        return false;
    }
    public boolean estIsocele()
    {
        double dist12 = this.premier.calculerDistance(this.deuxieme), dist13 = this.premier.calculerDistance(this.troisieme),
                dist23 = this.deuxieme.calculerDistance(this.troisieme);
        if(dist12 == dist13 || dist12 == dist23 || dist23==dist13 )
            return true;
        return false;
    }
}
