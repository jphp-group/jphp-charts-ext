package org.develnext.jphp.ext.charts.classes.charts;

import org.develnext.jphp.ext.charts.ChartsExtension;
import org.develnext.jphp.ext.javafx.classes.layout.UXRegion;

import javafx.geometry.Side;
import javafx.scene.chart.Chart;
import php.runtime.annotation.Reflection.Abstract;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Property;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;


@Namespace(ChartsExtension.NS)
@Name("UXChart")
@Abstract
public class UXChart<T extends Chart> extends UXRegion<T>{
	interface WrappedInterface{
		@Property boolean animated();
		@Property Side legendSide();
		@Property boolean legendVisible();
		@Property String title();
		@Property Side titleSide();
	}
	
	public UXChart(Environment env, T wrappedObject){
		super(env, wrappedObject);
	}
	public UXChart(Environment env, ClassEntity clazz){
		super(env, clazz);
	}
}
