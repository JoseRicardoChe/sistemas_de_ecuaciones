package Unidad6;

import org.mariuszgromada.math.mxparser.Argument;
import org.mariuszgromada.math.mxparser.Expression;

public class InterpretarEcuacion {

    String ecua;

    public double interprete(double f, String eq) {
        Argument x = new Argument("x");
        x.setArgumentValue(f);
        Expression e = new Expression(eq, x);
        return e.calculate();
    }
}
