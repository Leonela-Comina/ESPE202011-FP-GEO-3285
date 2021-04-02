/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.RestaurantSystem.model;

/**
 *
 * @author BIOSTAR
 */
public class Soda {
    private String name; 
    private String color;
    private String taste;
    private float netContent;
    private float price;

    public Soda(String name, String color, String taste, float netContent, float price) {
        this.name = name;
        this.color = color;
        this.taste = taste;
        this.netContent = netContent;
        this.price = price;
    }

    public Soda(String name, String color, String taste, String netContent, String price) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the taste
     */
    public String getTaste() {
        return taste;
    }

    /**
     * @param taste the taste to set
     */
    public void setTaste(String taste) {
        this.taste = taste;
    }

    /**
     * @return the netContent
     */
    public float getNetContent() {
        return netContent;
    }

    /**
     * @param netContent the netContent to set
     */
    public void setNetContent(float netContent) {
        this.netContent = netContent;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }
    
    
    
    
     }
