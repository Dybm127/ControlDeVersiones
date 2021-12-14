/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 * Clase donde se definen el lado y
 * el área del cuadrado.
 * @version 1.0
 * @since 30-11-2021
 * @author Derian Batallas Minda
 */
public class Cuadrado implements FiguraGeometrica
{
    // Atributo que contiene el lado del cuadrado.
    private double lado;
    // Atributo que contiene el área del cuadrado.
    private double areaCuadrado;

    public Cuadrado(double lado) 
    {
        this.lado = lado;
    }
    /** 
     * Método consultor para el atributo lado.
     * @return Devuelve el Lado del cuadrado
     * */
    public double getLado() 
    {
        return lado;
    }

    /** 
     * Método modificador del atributo setLado.
     * @param lado del cuadrado
     * */
    public void setLado(double lado) 
    {
        this.lado = lado;
    }
    
    /** 
     * Método consultor para el atributo areaCuadrado.
     * @return Devuelve el Área del cuadrado
     * */
    public double getareaCuadrado() 
    {
        return areaCuadrado;
    }    
    
    @Override
    public void area() 
    {
        areaCuadrado = lado * lado;
    }    
}