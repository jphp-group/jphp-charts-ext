package org.develnext.jphp.ext.charts.classes.data;

import javafx.scene.Node;
import javafx.scene.chart.PieChart;
import org.develnext.jphp.ext.charts.ChartsExtension;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;


@Reflection.Namespace(ChartsExtension.NS)
@Reflection.Name("UXPieChartData")
@Reflection.Final
public final class UXPieChartData extends BaseWrapper<PieChart.Data> {
    interface WrappedInterface{
        @Reflection.Property PieChart chart();
        @Reflection.Property String name();
        @Reflection.Property Node node();
        @Reflection.Property Double pieValue();
    }

    public UXPieChartData(Environment env, PieChart.Data wrappedObject) {
        super(env, wrappedObject);
    }

    public UXPieChartData(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Reflection.Signature
    public void __construct(String name, double value){
        __wrappedObject = new PieChart.Data(name, value);
    }
}
