package org.develnext.jphp.ext.charts.classes.charts;

import org.develnext.jphp.ext.charts.ChartsExtension;

import javafx.scene.chart.Axis;
import javafx.scene.chart.LineChart;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Property;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Namespace(ChartsExtension.NS)
@Name("UXLineChart")
public class UXLineChart extends UXXYChart<LineChart>{
	interface WrappedInterface{
		@Property Boolean createSymbols();
	}
	
	public UXLineChart(Environment env, LineChart wrappedObject){
		super(env, wrappedObject);
	}
	public UXLineChart(Environment env, ClassEntity clazz){
		super(env, clazz);
	}
	@Signature
	@SuppressWarnings("unchecked")
	public void __construct(Axis x, Axis y){
		__wrappedObject = new LineChart(x, y);
	}
}
