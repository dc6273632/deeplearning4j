package org.deeplearning4j.nn.params;

import org.deeplearning4j.nn.api.ParamInitializer;
import org.deeplearning4j.nn.conf.NeuralNetConfiguration;
import org.deeplearning4j.nn.conf.layers.Layer;
import org.nd4j.linalg.api.ndarray.INDArray;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * @author Adam Gibson
 */
public class EmptyParamInitializer implements ParamInitializer {

    private static final EmptyParamInitializer INSTANCE = new EmptyParamInitializer();

    public static EmptyParamInitializer getInstance() {
        return INSTANCE;
    }

    @Override
    public int numParams(Layer layer) {
        return 0;
    }

    @Override
    public List<String> paramKeys(Layer layer) {
        return Collections.emptyList();
    }

    @Override
    public List<String> weightKeys(Layer layer) {
        return Collections.emptyList();
    }

    @Override
    public List<String> biasKeys(Layer layer) {
        return Collections.emptyList();
    }

    @Override
    public boolean isWeightParam(String key) {
        return false;
    }

    @Override
    public boolean isBiasParam(String key) {
        return false;
    }

    @Override
    public Map<String, INDArray> init(Layer layer, INDArray paramsView, boolean initializeParams) {
        return Collections.EMPTY_MAP;
    }

    @Override
    public Map<String, INDArray> getGradientsFromFlattened(Layer layer, INDArray gradientView) {
        return Collections.emptyMap();
    }
}