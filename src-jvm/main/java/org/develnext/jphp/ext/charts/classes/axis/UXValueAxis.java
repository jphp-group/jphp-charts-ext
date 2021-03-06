package org.develnext.jphp.ext.charts.classes.axis;

import org.develnext.jphp.ext.charts.ChartsExtension;

import javafx.scene.chart.ValueAxis;
import php.runtime.annotation.Reflection.Abstract;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Property;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Namespace(ChartsExtension.NS)
@Name("UXValueAxis")
@Abstract
public class UXValueAxis<T extends ValueAxis> extends UXAxis<T>{
	interface WrappedInterface{
		@Property double lowerBound();
		@Property int minorTickCount();
		@Property double minorTickLength();
		@Property boolean minorTickVisible();
		@Property double scale();
		@Property double upperBound();
	}
	
	public UXValueAxis(Environment env, T wrappedObject){
		super(env, wrappedObject);
	}
	public UXValueAxis(Environment env, ClassEntity clazz){
		super(env, clazz);
	}
}
