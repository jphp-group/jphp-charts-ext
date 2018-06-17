package org.develnext.jphp.ext.charts.classes.data;

import org.develnext.jphp.ext.charts.ChartsExtension;

import javafx.scene.Node;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Data;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Getter;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Property;
import php.runtime.annotation.Reflection.Setter;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;


@Namespace(ChartsExtension.NS)
@Name("UXXYChartData")
public class UXXYChartData extends BaseWrapper<Data>{
	interface WrappedInterface{
		@Property Node node();
	}
	
	public UXXYChartData(Environment env, Data wrappedObject){
		super(env, wrappedObject);
	}
	public UXXYChartData(Environment env, ClassEntity clazz){
		super(env, clazz);
	}
	@Signature
	public void __construct(){
		__wrappedObject = new Data();
	}
	@Signature
	@SuppressWarnings("unchecked")
	public void __construct(Environment env, Memory x, Memory y){
		__wrappedObject = new Data(Memory.unwrap(env, x), Memory.unwrap(env, y));
	}
	@Getter
	public Memory getXValue(Environment env){
		return Memory.wrap(env, getWrappedObject().getXValue());
	}
	@SuppressWarnings("unchecked")
	@Setter
	public void setXValue(Environment env, Memory value){
		getWrappedObject().setXValue(Memory.unwrap(env, value));
	}
	@Getter
	public Memory getYValue(Environment env){
		return Memory.wrap(env, getWrappedObject().getYValue());
	}
	@SuppressWarnings("unchecked")
	@Setter
	public void setYValue(Environment env, Memory value){
		getWrappedObject().setYValue(Memory.unwrap(env, value));
	}
}
