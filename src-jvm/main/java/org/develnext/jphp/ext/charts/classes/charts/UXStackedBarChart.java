package org.develnext.jphp.ext.charts.classes.charts;

import javafx.scene.chart.Axis;
import javafx.scene.chart.StackedBarChart;
import org.develnext.jphp.ext.charts.ChartsExtension;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Property;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Namespace(ChartsExtension.NS)
@Name("UXStackedBarChart")
public class UXStackedBarChart extends UXXYChart<StackedBarChart>{
	interface WrappedInterface{
		@Property double categoryGap();
	}

	public UXStackedBarChart(Environment env, StackedBarChart wrappedObject){
		super(env, wrappedObject);
	}
	public UXStackedBarChart(Environment env, ClassEntity clazz){
		super(env, clazz);
	}
	@Signature
	@SuppressWarnings("unchecked")
	public void __construct(Axis x, Axis y){
		__wrappedObject = new StackedBarChart(x, y);
	}
}
