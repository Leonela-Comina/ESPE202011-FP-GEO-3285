/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.transport.model;

/**
 *
 * @author BIOSTAR
 */
public class Transport {

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
     * @return the transport
     */
    public String getTransport() {
        return transport;
    }

    /**
     * @param transport the transport to set
     */
    public void setTransport(String transport) {
        this.transport = transport;
    }

    /**
     * @return the terminal
     */
    public String getTerminal() {
        return terminal;
    }

    /**
     * @param terminal the terminal to set
     */
    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    /**
     * @return the ticketValue
     */
    public float getTicketValue() {
        return ticketValue;
    }

    /**
     * @param ticketValue the ticketValue to set
     */
    public void setTicketValue(float ticketValue) {
        this.ticketValue = ticketValue;
    }

    /**
     * @return the numberOfPassengers
     */
    public float getNumberOfPassengers() {
        return numberOfPassengers;
    }

    /**
     * @param numberOfPassengers the numberOfPassengers to set
     */
    public void setNumberOfPassengers(float numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }
    private String name;
    private String transport;
    private String terminal;
    private float ticketValue;
    private float numberOfPassengers;

    public Transport(String name, String transport, String terminal, float ticketValue, float numberOfPassengers) {
        this.name = name;
        this.transport = transport;
        this.terminal = terminal;
        this.ticketValue = ticketValue;
        this.numberOfPassengers = numberOfPassengers;
    }
    
            
    
}
