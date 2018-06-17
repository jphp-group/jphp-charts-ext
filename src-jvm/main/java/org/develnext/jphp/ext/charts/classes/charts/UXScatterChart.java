package org.develnext.jphp.ext.charts.classes.charts;

import javafx.scene.chart.Axis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.ScatterChart;
import org.develnext.jphp.ext.charts.ChartsExtension;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Property;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Namespace(ChartsExtension.NS)
@Name("UXScatterChart")
public class UXScatterChart extends UXXYChart<ScatterChart>{

	public UXScatterChart(Environment env, ScatterChart wrappedObject){
		super(env, wrappedObject);
	}
	public UXScatterChart(Environment env, ClassEntity clazz){
		super(env, clazz);
	}
	@Signature
	@SuppressWarnings("unchecked")
	public void __construct(Axis x, Axis y){
		__wrappedObject = new ScatterChart(x, y);
	}
}
