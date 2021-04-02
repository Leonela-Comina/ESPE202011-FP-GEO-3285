/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.RestaurantSystem.controll;

import Utils.fileManager;
import ec.edu.espe.RestaurantSystem.model.Soda;

/**
 *
 * @author BIOSTAR
 */
public class SodaController {
    
    public void save(Soda soda){
        String data = soda.getName()+ " ; " + soda.getColor() + " ; " + soda.getTaste() + " ; " + soda.getNetContent() + " ; " + soda.getPrice();
        fileManager.save(data, "sodas");
    }
    public String read (){
        String data;
        data = fileManager.read("sodas");
        return data;
    }
}
