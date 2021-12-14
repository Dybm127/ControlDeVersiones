/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 * Clase donde se define la geometría
 * @version 1.0
 * @since 30-11-2021
 * @author Derian Batallas Minda
 */
public class Geometria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //probar clases cálculo áreas figuras geométricas      
        /**
         * Método consultor del atributo areaCuadrado
         * @return Área del cuadrado
         */
        Cuadrado cuadrado = new Cuadrado(10);
        cuadrado.area();
        System.out.println("Área del cuadrado de lado 10: " + 
                cuadrado.getareaCuadrado());
        
         /**
         * Método consultor del atributo areaRadio
         * @return Área del Radio
         */
        Circulo circulo = new Circulo(200);
        circulo.area();
        System.out.println("Área del círculo de radio 200: " + 
                circulo.getAreaRadio());
        
         /**
         * Método consultor del atributo areaRectangulo
         * @return Área del rectangulo
         */
        Rectangulo rectangulo = new Rectangulo(100, 20);
        rectangulo.area();
        System.out.println("Área del rectángulo de base 100 y altura 20: " + 
                rectangulo.getAreaRectangulo());

         /**
         * Método consultor del atributo areaTRiangulo
         * @return Área del cuadrado
         */
        Triangulo triangulo = new Triangulo(5, 10);
        triangulo.area();
        System.out.println("Área del triángulo de base 5 y altura 10: " + 
                triangulo.getareaTriangulo());        
    }   
    
}
