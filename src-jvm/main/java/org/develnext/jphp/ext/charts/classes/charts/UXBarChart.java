package org.develnext.jphp.ext.charts.classes.charts;

import org.develnext.jphp.ext.charts.ChartsExtension;

import javafx.scene.chart.Axis;
import javafx.scene.chart.BarChart;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Property;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Namespace(ChartsExtension.NS)
@Name("UXBarChart")
public class UXBarChart extends UXXYChart<BarChart>{
	interface WrappedInterface{
		@Property double barGap();
		@Property double categoryGap();
	}
	
	public UXBarChart(Environment env, BarChart wrappedObject){
		super(env, wrappedObject);
	}
	public UXBarChart(Environment env, ClassEntity clazz){
		super(env, clazz);
	}
	@Signature
	@SuppressWarnings("unchecked")
	public void __construct(Axis x, Axis y){
		__wrappedObject = new BarChart(x, y);
	}
}
