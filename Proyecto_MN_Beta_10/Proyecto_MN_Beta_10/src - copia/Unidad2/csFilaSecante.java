package Unidad2;

public class csFilaSecante {
    ///////////Atributos//////////////////
    private int it; //Iteracion 
    private double a; //Inicial Xi-1
    private double b; //Inicial Xi
    private double c; //Funcion F(Xi-1)
    private double d; //Resta (Xi-1)-(Xi)
    private double e; //Funcion F(Xi)
    private double f; //F(Xi)*[(Xi-1)-(Xi)]
    private double g; //[F(Xi-1)]-[F(Xi)]
    private double h; //Raiz
    private double i; //Error
    //////////////////////////////////////
    
    
    
    ////////////GET & SET///////////////////
    public int getIt() {
        return it;
    }

    public void setIt(int it) {
        this.it = it;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getF() {
        return f;
    }

    public void setF(double f) {
        this.f = f;
    }

    public double getG() {
        return g;
    }

    public void setG(double g) {
        this.g = g;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getI() {
        return i;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public void setI(double i) {
        this.i = i;
    }
    ////////////////////////////////////////
    

}
