/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.storage;

import core.models.Operation;
import java.util.ArrayList;

/**
 *
 * @author edangulo
 */
public class History {
    
    // Instancia Singleton
    private static History instance;
    
    // Atributos del Storage
    private ArrayList<Operation> operations;
    
    private History() {
        this.operations = new ArrayList<>();
    }
    
    public static History getInstance() {
        if (instance == null) {
            instance = new History();
        }
        return instance;
    }
    
    public void addOperation(Operation operation) {
        this.operations.add(operation);
    }
    
    public ArrayList<Operation> getOperations() {
        return operations;
    }
}
