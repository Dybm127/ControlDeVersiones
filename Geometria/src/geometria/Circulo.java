/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 * Clase donde se definen el radio y
 * el área del circulo
 * @version 1.0
 * @since 30-11-2021
 * @author Derian Batallas Minda
 */
public class Circulo implements FiguraGeometrica 
{
    private double radio;
    private double areaRadio;
    static final double pi = 3.1415;

    public Circulo(double radio) 
    {
        this.radio = radio;
    }
    
    /** 
     * Método consultor para el atributo radio.
     * @return Devuelve el Radio del circulo
     * */
    public double getRadio() 
    {
        return radio;
    }

    /** 
     * Método modificador del atributo setRadio.
     * @param radio del circulo.
     * */
    public void setRadio(double radio) 
    {
        this.radio = radio;
    }
    
    /** 
     * Método consultor para el atributo areaRadio.
     * @return Devuelve el Área del circulo
     * */
    public double getAreaRadio() 
    {
        return areaRadio;
    }

    @Override
    public void area() 
    {
        areaRadio = pi * radio * radio;
    }    
}
