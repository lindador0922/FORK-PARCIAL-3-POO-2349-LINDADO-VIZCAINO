/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.storage;

/**
 *
 * @author Robert Lindado y Sebastian Vizcaino
 */
public class HistoryInstance {
    // Instancia Singleton

    private static History instance;

    public static History getInstance() {
        if (instance == null) {
            instance = new History();
        }
        return instance;
    }
}
