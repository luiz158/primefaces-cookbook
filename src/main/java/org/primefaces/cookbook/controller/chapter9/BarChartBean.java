package org.primefaces.cookbook.controller.chapter9;

import org.primefaces.cookbook.utils.MessageUtil;
import org.primefaces.event.ItemSelectEvent;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * User: mertcaliskan
 * Date: 10/1/12
 */
@Named
@ViewScoped
public class BarChartBean implements Serializable {

    private BarChartModel model;

    public BarChartBean() {
        model = new BarChartModel();

        createModel();
    }

    private void createModel() {
        ChartSeries sales = new ChartSeries();
        sales.setLabel("Sales");
        sales.set("2004", 1000);
        sales.set("2005", 1170);
        sales.set("2006", 660);
        sales.set("2007", 1030);

        ChartSeries expenses = new ChartSeries();
        expenses.setLabel("Expenses");
        expenses.set("2004", 400);
        expenses.set("2005", 460);
        expenses.set("2006", 1120);
        expenses.set("2007", 540);

        model.addSeries(sales);
        model.addSeries(expenses);
    }

    public String getDatatipFormat() {
        return "<span style=\"display:none;\">%s</span><span>%s</span>";
    }

    public void itemSelect(ItemSelectEvent event) {
        MessageUtil.addInfoMessageWithoutKey("Item selected",
                "Series Index:" + event.getSeriesIndex() + ", Item Index: " + event.getItemIndex());
    }

    public BarChartModel getModel() {
        return model;
    }
}