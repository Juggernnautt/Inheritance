/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan5;

/**
 *
 * @author Ditya RA
 */
public class truck {
    public int cedance;
    public int gear;
    public int speed;
    public truck(int startCadance,int startSpeed,int startGear){
        gear = startGear;
        cedance = startCadance;
        speed = startSpeed;
    }
    public void setCadance (int newValue){
        cedance =newValue;
    }
    public void setGear(int newValue){
        gear =newValue;
    }
    public void applybrake (int decrement){
        speed = decrement;
    }
    public void speedUp (int increment){
        speed=increment;
    }
}
