package org.develnext.jphp.ext.charts.classes.data;

import org.develnext.jphp.ext.charts.ChartsExtension;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Series;
import php.runtime.annotation.Reflection.Getter;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Property;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;


@Namespace(ChartsExtension.NS)
@Name("UXXYChartSeries")
public class UXXYChartSeries extends BaseWrapper<Series>{
	interface WrappedInterface{
		@Property XYChart chart();
		
		@Property String name();
		@Property Node node();
	}
	public UXXYChartSeries(Environment env, Series wrappedObject){
		super(env, wrappedObject);
	}
	public UXXYChartSeries(Environment env, ClassEntity clazz){
		super(env, clazz);
	}
	@Signature
	@SuppressWarnings("unchecked")
	public void __construct(){
		__wrappedObject = new Series();
		__wrappedObject.setData(FXCollections.observableArrayList());
	}
	@Getter
	@SuppressWarnings("unchecked")
	public ObservableList<XYChart.Data> getChartData(){
		return getWrappedObject().getData();
	}
}
