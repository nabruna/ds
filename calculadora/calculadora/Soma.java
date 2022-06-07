package calculadora;

public class Soma extends Operacao {
    private double x, y;

    public Soma() {}

    public Soma(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    @Override
    public double operacao() {        
        return x + y;
    }
}
