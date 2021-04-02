/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.transport.controller;

import Utils.fileManager;
import ec.edu.espe.transport.model.Transport;

/**
 *
 * @author BIOSTAR
 */
public class TransportController {
    public void save(Transport transporte){
        String data = transporte.getName()+ " ; " + transporte.getTicketValue()+ " ; " + transporte.getTransport()+ " ; " + transporte.getNumberOfPassengers()+ " ; " + transporte.getTerminal();
        fileManager.save(data, "transport");
    }
    public String read (){
        String data;
        data = fileManager.read("transport");
        return data;
    }
}

