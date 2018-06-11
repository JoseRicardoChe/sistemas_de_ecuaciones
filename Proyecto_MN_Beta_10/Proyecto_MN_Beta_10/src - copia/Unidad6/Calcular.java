/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad6;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 *
 * @author Emmanuel Ay Tuz
 */
public class Calcular {

    public static void main() {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine interprete = manager.getEngineByName("js");
        try {
            String formula = "- 2 * x ^ 3 + 12 * x ^ 2 - 20 * x +8.5;";
            String[] split = formula.split(formula);
            interprete.put("x", 5);
            System.out.println("Resultado = " + interprete.eval(formula));
        } catch (ScriptException se) {
            se.printStackTrace();
        }
    }
}
