package calculadora;

public class Subtracao extends Operacao {
    private double x, y;

    public Subtracao() {}

    public Subtracao(double x, double y) {
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
        return x - y;
    }
}
