package org.develnext.jphp.ext.charts.classes.axis;

import org.develnext.jphp.ext.charts.ChartsExtension;

import javafx.scene.chart.CategoryAxis;
import php.runtime.annotation.Reflection.Final;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Property;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Namespace(ChartsExtension.NS)
@Name("UXCategoryAxis")
@Final
public final class UXCategoryAxis extends UXAxis<CategoryAxis>{
	interface WrappedInterface{
		@Property double categorySpacing();
		@Property double endMargin();
		@Property boolean gapStartAndEnd();
		@Property double startMargin();
	}
	
	public UXCategoryAxis(Environment env, CategoryAxis wrappedObject){
		super(env, wrappedObject);
	}
	public UXCategoryAxis(Environment env, ClassEntity clazz){
		super(env, clazz);
	}
	@Signature
	public void __construct(){
		__wrappedObject = new CategoryAxis();
	}
}
