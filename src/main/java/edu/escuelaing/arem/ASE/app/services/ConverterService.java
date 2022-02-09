package edu.escuelaing.arem.ASE.app.services;

/**
 * @author Juan Carlos Alayon Molina
 * @version 1.0
 */
public interface ConverterService {
    /**
     * Metodo que convierte grados Celsius a Fahrenheit
     * @param cel, Grados Celsius a convertir
     * @return JsonObject, Objeto float que representa la cantidad en grados Fahrenheit equivalente
     */
    public float CelToFar(float cel);

    /**
     * Metodo que convierte grados Fahrenheit a Celsius
      * @param far, Grados Fahrenheit a convertir
     * @return float, Objeto float que representa la cantidad en grados Celsius equivalente
     */
    public float FarToCel(float far);
}
