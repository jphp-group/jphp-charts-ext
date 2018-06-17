package org.develnext.jphp.ext.charts.classes.axis;

import org.develnext.jphp.ext.charts.ChartsExtension;

import javafx.scene.chart.NumberAxis;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Property;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Namespace(ChartsExtension.NS)
@Name("UXNumberAxis")
public class UXNumberAxis extends UXValueAxis<NumberAxis>{
	interface WrappedInterface{
		@Property Double tickUnit();
		@Property Boolean forceZeroInRange();
	}
	
	public UXNumberAxis(Environment env, NumberAxis wrappedObject){
		super(env, wrappedObject);
	}
	public UXNumberAxis(Environment env, ClassEntity clazz){
		super(env, clazz);
	}
	@Signature
	public void __construct(){
		__wrappedObject = new NumberAxis();
	}
	@Signature
	public void __construct(double lowerBound, double upperBound, double tickUnit){
		__wrappedObject = new NumberAxis(lowerBound, upperBound, tickUnit);
	}
}
