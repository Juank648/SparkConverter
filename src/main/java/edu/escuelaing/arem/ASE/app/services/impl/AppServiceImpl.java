package edu.escuelaing.arem.ASE.app.services.impl;

import com.google.gson.JsonObject;
import edu.escuelaing.arem.ASE.app.services.AppService;
import org.eclipse.jetty.http.HttpStatus;


/**
 * @author Juan Carlos Alayon Molins
 * @version 1.0
 */
public class AppServiceImpl implements AppService {
    @Override
    public JsonObject createJsonObject(float value, String unit) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("status_code", HttpStatus.OK_200);
        jsonObject.addProperty("value", value);
        jsonObject.addProperty("unit", unit);
        return jsonObject;
    }
}
