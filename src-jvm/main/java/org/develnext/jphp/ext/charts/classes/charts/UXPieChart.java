package org.develnext.jphp.ext.charts.classes.charts;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import org.develnext.jphp.ext.charts.ChartsExtension;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Reflection.Namespace(ChartsExtension.NS)
@Reflection.Name("UXPieChart")
public class UXPieChart extends UXChart<PieChart>{
    interface WrappedInterface{
        @Reflection.Property boolean clockwise();
        @Reflection.Property double labelLineLength();
        @Reflection.Property boolean labelsVisible();
        @Reflection.Property double startAngle();
    }

    public UXPieChart(Environment env, PieChart wrappedObject) {
        super(env, wrappedObject);
    }

    public UXPieChart(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Reflection.Signature
    public void __construct(){
        __wrappedObject = new PieChart(FXCollections.observableArrayList());
    }
    @Reflection.Getter
    public ObservableList<PieChart.Data> getChartData(){
        return getWrappedObject().getData();
    }
}
