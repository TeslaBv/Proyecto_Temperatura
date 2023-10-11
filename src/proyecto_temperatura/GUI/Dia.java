/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_temperatura.GUI;

/**
 *
 * @author Fabian
 */
public class Dia {
    private double temperaturaMañana;
    private double temperaturaMedioDia;
    private double temperaturaNoche;

    public Dia() 
    {
    }
    
    public void Dia( double mañana,double medioDia, double noche)
    {
        this.temperaturaMañana=mañana;
        this.temperaturaMedioDia=medioDia;
        this.temperaturaNoche=noche;
    }

    public double getTemperaturaMañana() 
    {
        return temperaturaMañana;
    }

    public void setTemperaturaMañana(double temperaturaMañana) 
    {
        this.temperaturaMañana = temperaturaMañana;
    }

    public double getTemperaturaMedioDia() 
    {
        return temperaturaMedioDia;
    }

    public void setTemperaturaMedioDia(double temperaturaMedioDia) 
    {
        this.temperaturaMedioDia = temperaturaMedioDia;
    }

    public double getTemperaturaNoche() {
        return temperaturaNoche;
    }

    public void setTemperaturaNoche(double temperaturaNoche) 
    {
        this.temperaturaNoche = temperaturaNoche;
    }    
}
