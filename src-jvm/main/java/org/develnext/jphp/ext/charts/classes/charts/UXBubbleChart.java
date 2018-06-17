package org.develnext.jphp.ext.charts.classes.charts;

import javafx.scene.chart.Axis;
import javafx.scene.chart.BubbleChart;
import javafx.scene.chart.ScatterChart;
import org.develnext.jphp.ext.charts.ChartsExtension;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Namespace(ChartsExtension.NS)
@Name("UXBubbleChart")
public class UXBubbleChart extends UXXYChart<BubbleChart>{

	public UXBubbleChart(Environment env, BubbleChart wrappedObject){
		super(env, wrappedObject);
	}
	public UXBubbleChart(Environment env, ClassEntity clazz){
		super(env, clazz);
	}
	@Signature
	@SuppressWarnings("unchecked")
	public void __construct(Axis x, Axis y){
		__wrappedObject = new BubbleChart(x, y);
	}
}
