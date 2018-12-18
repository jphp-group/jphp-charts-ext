package org.develnext.jphp.ext.charts.classes.axis;

import org.develnext.jphp.ext.charts.ChartsExtension;
import org.develnext.jphp.ext.javafx.classes.layout.UXRegion;

import javafx.geometry.Side;
import javafx.scene.chart.Axis;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import php.runtime.annotation.Reflection.Abstract;
import php.runtime.annotation.Reflection.Getter;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Property;
import php.runtime.annotation.Reflection.Setter;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Namespace(ChartsExtension.NS)
@Name("UXAxis")
@Abstract
public class UXAxis<T extends Axis> extends UXRegion<T>{
	interface WrappedInterface{
		@Property boolean animated();
		@Property boolean autoRanging();
		@Property String label();
		@Property Side side();
		@Property double tickLabelGap();
		@Property double tickLabelRotation();
		@Property boolean tickLabelsVisible();
		@Property double tickLength();
		@Property boolean tickMarkVisible();
	}

	public UXAxis(Environment env, T wrappedObject){
		super(env, wrappedObject);
	}
	public UXAxis(Environment env, ClassEntity clazz){
		super(env, clazz);
	}
	@Getter
	public Font getTickLabelFont(){
		return getWrappedObject().getTickLabelFont();
	}
	@Setter
	public void setTickLabelFont(Font font){
		getWrappedObject().setTickLabelFont(font);
	}
	@Getter
	public Color getTickLabelFill(){
		Paint paint = getWrappedObject().getTickLabelFill();
		if(paint instanceof Color){
			return (Color)paint;
		}
		return null;
	}
	@Setter
	public void setTickLabelFill(Color color){
		getWrappedObject().setTickLabelFill(color);
	}
}