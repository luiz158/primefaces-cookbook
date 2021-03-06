package org.primefaces.cookbook.controller.chapter9;

import org.primefaces.model.chart.BubbleChartModel;
import org.primefaces.model.chart.BubbleChartSeries;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * User: mertcaliskan
 * Date: 10/3/12
 */
@Named
@ViewScoped
public class BubbleChartBean implements Serializable {

    private BubbleChartModel model;

    public BubbleChartBean() {
        createBubbleChart();
    }

    private void createBubbleChart() {
        model = new BubbleChartModel();

        model.add(new BubbleChartSeries("California", 3576, 170506, 4455));
        model.add(new BubbleChartSeries("Texas", 3248, 296259, 1710));
        model.add(new BubbleChartSeries("Florida", 2496,114422, 3104));
        model.add(new BubbleChartSeries("New York", 1422, 112347, 2885));
        model.add(new BubbleChartSeries("Georgia", 1403, 151746, 2179));
    }

    public BubbleChartModel getModel() {
        return model;
    }
}
