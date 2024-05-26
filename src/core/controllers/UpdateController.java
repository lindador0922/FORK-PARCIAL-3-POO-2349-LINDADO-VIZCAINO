/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.controllers;

import core.controllers.utils.Response;
import core.controllers.utils.Status;
import core.models.Operation;
import java.util.ArrayList;
import java.util.Collections;
import core.storage.History;

/**
 *
 * @author Robert Lindado y Sebastian Vizcaino
 */
public class UpdateController {
        public static Response readHistory() {
        try {
            History history = History.getInstance();
            
            // Historial por orden de antiguedad (mas recientes primero)
            ArrayList<Operation> recentHistory = new ArrayList<>(history.getOperations());
            Collections.reverse(recentHistory);
            
            return new Response("History obtained", Status.OK, recentHistory);
        } catch (Exception ex) {
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }
}
