/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.controllers;

import core.controllers.utils.Response;
import core.controllers.utils.Status;
import core.models.Calculator;
import core.models.Operation;
import java.text.DecimalFormat;
import core.storage.History;
import core.storage.HistoryInstance;


/**
 *
 * @author Robert Lindado y Sebastian Vizcaino
 */
public class PotencyController {
    public static Response potency(String a, String b) {
        try {
            double number1, number2, result;

            /* VALIDACION DE ENTRADAS */
            DecimalFormat df = new DecimalFormat("#.###");

            // Convertir de String a Double
            try {
                number1 = Double.parseDouble(a);
                number2 = Double.parseDouble(b);
            } catch (NumberFormatException ex) {
                return new Response("Numbers must be numeric", Status.BAD_REQUEST);
            }

            // Reduccion de decimales (a solo 3)
            try {
                number1 = Double.parseDouble(df.format(number1));
                number2 = Double.parseDouble(df.format(number2));
            } catch (NumberFormatException ex) {
                return new Response("Couldn't reformat operands", Status.INTERNAL_SERVER_ERROR);
            }

            /* OPERACION */
            Calculator calculator = new Calculator();
            result = calculator.potency(number1, number2);

            // Reducir resultado a 3 cifras decimales
            try {
                result = Double.parseDouble(df.format(result));
            } catch (NumberFormatException ex) {
                return new Response("Couldn't reformat result", Status.INTERNAL_SERVER_ERROR);
            }

            /* GENERAR HISTORIAL */
            History history = HistoryInstance.getInstance();
            history.addOperation(new Operation(number1, number2, "^", result));

            return new Response("Number powered", Status.OK, result);
        } catch (Exception ex) {
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }

}
