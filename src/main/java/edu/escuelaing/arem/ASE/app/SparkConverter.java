package edu.escuelaing.arem.ASE.app;

import edu.escuelaing.arem.ASE.app.services.AppService;
import edu.escuelaing.arem.ASE.app.services.ConverterService;
import edu.escuelaing.arem.ASE.app.services.impl.ConverterServiceImpl;

import static spark.Spark.*;

/**
 * @author Juan Carlos Alayon Molina
 * @version 1.0
 */
public class SparkConverter
{
    private static String faToCelPath = "/celsius/:fahrenheit";
    private static String celToFaPath = "/fahrenheit/:celsius";
    private static AppService appService;
    private static ConverterService converterService = new ConverterServiceImpl();

    public static void main( String[] args )
    {
        //Setting de portNumber
        port(getPort());

        //After-filters are evaluated after each request, and can read the request and read/modify the response:
        //CORS
        after((request, response) -> {
            response.header("Access-Control-Allow-Origin", "*");
            response.header("Access-Control-Allow-Methods", "GET");
        });


        float val = Float.parseFloat(":temp");
        get(faToCelPath, "application/json",(req, res) -> appService.createJsonObject(converterService.FarToCel(val),"fahrenheit"));
        get(celToFaPath, "application/json",(req, res) -> appService.createJsonObject(converterService.CelToFar(val),"celsius"));


    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set (i.e. on localhost)
    }
}
