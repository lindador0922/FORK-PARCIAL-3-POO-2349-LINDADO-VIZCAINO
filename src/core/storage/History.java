/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.storage;

import core.models.Operation;
import java.util.ArrayList;

/**
 *
 * @author Robert Lindado y Sebastian Vizcaino
 */
public class History {

    // Atributos del Storage
    private ArrayList<Operation> operations;

    public History() {
        this.operations = new ArrayList<>();
    }

    public ArrayList<Operation> getOperations() {
        return operations;
    }

    public void addOperation(Operation operation) {
        this.operations.add(operation);
    }

}
