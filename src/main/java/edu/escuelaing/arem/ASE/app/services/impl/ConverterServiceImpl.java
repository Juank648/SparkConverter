package edu.escuelaing.arem.ASE.app.services.impl;

import edu.escuelaing.arem.ASE.app.services.ConverterService;

/**
 * @author Juan Carlos Alayon Molins
 * @version 1.0
 */
public class ConverterServiceImpl implements ConverterService {
    @Override
    public float CelToFar(float cel) {
        float response = (cel * 1.8f) + 32;
        return response;
    }

    @Override
    public float FarToCel(float far) {
        float response = (far - 32) / 1.8f;
        return response;
    }
}
