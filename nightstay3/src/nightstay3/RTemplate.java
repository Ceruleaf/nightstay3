/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nightstay3;

/**
 *
 * @author Turgut Reiss
 */
abstract class RTemplate {
    public abstract void order(int h);
    public abstract double getharga();
    public abstract double getTotal();    
    public abstract String displaydescription();
    public abstract boolean getStatus();
    public abstract void setStatus(boolean newstat);
    
    //RoomID, harga, status, TIME(Database).
}
