public class point {
    private double x;
    private double y;

    public point(double x, double y){
        setx(x);
        sety(y);
    }


    double getx(){
        return x;
    }

    double gety(){
        return y;
    }

    double getDistance(point temp1){
        double x1 =this.x; double x2 =temp1.getx();
        double y1 = this.y; double y2 = temp1.gety();
        return Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));

    }





    public void setx(double x){
        this.x = x;
    }
    public void sety(double y){
        this.y = y;
    }

}