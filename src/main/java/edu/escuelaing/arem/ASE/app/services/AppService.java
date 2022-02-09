package edu.escuelaing.arem.ASE.app.services;

import com.google.gson.JsonObject;

/**
 * @author Juan Carlos Alayon Molina
 * @version 1.0
 */
public interface AppService {
    /**
     * Metodo que crea un Objeto JSON a partir de un float y un String
     * @param value, valor resultado
     * @param unit, unidad en que se encuentra value
     * @return JsonObject, objeto JSON que representa una respuesta
     */
    public JsonObject createJsonObject(float value, String unit);
}
