package org.develnext.jphp.ext.charts.classes.charts;

import org.develnext.jphp.ext.charts.ChartsExtension;

import javafx.collections.ObservableList;
import javafx.scene.chart.Axis;
import javafx.scene.chart.XYChart;
import php.runtime.annotation.Reflection.Abstract;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Property;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Namespace(ChartsExtension.NS)
@Name("UXXYChart")
@Abstract
public class UXXYChart<T extends XYChart> extends UXChart<T>{
	interface WrappedInterface{
		@Property Boolean alternativeColumnFillVisible();
		@Property Boolean alternativeRowFillVisible();
		@Property Boolean horizontalGridLinesVisible();
		@Property Boolean horizontalZeroLineVisible();
		@Property Boolean verticalGridLinesVisible();
		@Property Boolean verticalZeroLineVisible();
		@Property("series") ObservableList<XYChart.Series> data();
		Axis getXAxis();
		Axis getYAxis();
	}
	
	
	public UXXYChart(Environment env, T wrappedObject){
		super(env, wrappedObject);
	}
	public UXXYChart(Environment env, ClassEntity clazz){
		super(env, clazz);
	}
}
