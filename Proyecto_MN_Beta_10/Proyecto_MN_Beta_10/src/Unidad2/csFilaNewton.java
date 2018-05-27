package Unidad2;

public class csFilaNewton {

    private int i; //Iteracion
    private double xo; //Inicial
    private double fxo; //funcion normal
    private double fxdo; //funcion derivada
    private double ximas; //División de normal/derivada
    private double error; //Error Absoluto

    public double getFxdo() {
        return fxdo;
    }

    public void setFxdo(double fxdo) {
        this.fxdo = fxdo;
    }

    public double getXimas() {
        return ximas;
    }

    public void setXimas(double ximas) {
        this.ximas = ximas;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public double getXo() {
        return xo;
    }

    public void setXo(double xo) {
        this.xo = xo;
    }

    public double getFxo() {
        return fxo;
    }

    public void setFxo(double fxo) {
        this.fxo = fxo;
    }

    public double getError() {
        return error;
    }

    public void setError(double error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "csFilaPunto{" + "i=" + i + ", xo=" + xo + ", fxo=" + fxo + ", error=" + error + '}';
    }

}
