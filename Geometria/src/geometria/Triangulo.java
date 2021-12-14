/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 * Clase donde se definen la base, la altura y
 * el área del triángulo.
 * @version 1.0
 * @since 30-11-2021
 * @author Derian Batallas Minda
 */

public class Triangulo implements FiguraGeometrica
{
	// Atributo que contiene la base del triángulo
    private double base;
	// Atributo que contiene la altura del triángulo
    private double altura;
	// Atributo que contiene el área del triángulo
    private double areaTriangulo;
    
    // Constructor que pone la base y la altura.
    public Triangulo(double base, double altura) 
    {
        this.base = base;
        this.altura = altura;
    }
 
    public double getBase() 
    {
        return base;
    }

    public void setBase(double base)
    {
        this.base = base;
    }

    public double getAltura() 
    {
        return altura;
    }

    public void setAltura(double altura) 
    {
        this.altura = altura;
    }

    public double getareaTriangulo() 
    {
        return areaTriangulo;
    }

   
    @Override
    public void area() 
    {
        areaTriangulo = base * altura / 2;
    }    
    
}