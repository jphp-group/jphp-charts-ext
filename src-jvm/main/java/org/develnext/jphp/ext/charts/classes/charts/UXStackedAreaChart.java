package org.develnext.jphp.ext.charts.classes.charts;

import javafx.scene.chart.AreaChart;
import javafx.scene.chart.Axis;
import javafx.scene.chart.StackedAreaChart;
import org.develnext.jphp.ext.charts.ChartsExtension;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Property;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Namespace(ChartsExtension.NS)
@Name("UXStackedAreaChart")
public class UXStackedAreaChart extends UXXYChart<StackedAreaChart>{
	interface WrappedInterface{
		@Property boolean createSymbols();
	}

	public UXStackedAreaChart(Environment env, StackedAreaChart wrappedObject){
		super(env, wrappedObject);
	}
	public UXStackedAreaChart(Environment env, ClassEntity clazz){
		super(env, clazz);
	}
	@Signature
	@SuppressWarnings("unchecked")
	public void __construct(Axis x, Axis y){
		__wrappedObject = new StackedAreaChart(x, y);
	}
}
