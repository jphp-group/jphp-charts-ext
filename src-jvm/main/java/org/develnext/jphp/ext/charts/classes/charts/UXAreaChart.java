package org.develnext.jphp.ext.charts.classes.charts;

import org.develnext.jphp.ext.charts.ChartsExtension;

import javafx.scene.chart.AreaChart;
import javafx.scene.chart.Axis;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Property;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Namespace(ChartsExtension.NS)
@Name("UXAreaChart")
public class UXAreaChart extends UXXYChart<AreaChart>{
	interface WrappedInterface{
		@Property Boolean createSymbols();
	}
	
	public UXAreaChart(Environment env, AreaChart wrappedObject){
		super(env, wrappedObject);
	}
	public UXAreaChart(Environment env, ClassEntity clazz){
		super(env, clazz);
	}
	@Signature
	@SuppressWarnings("unchecked")
	public void __construct(Axis x, Axis y){
		__wrappedObject = new AreaChart(x, y);
	}
}
