package org.develnext.jphp.ext.charts;

import javafx.scene.chart.*;

import org.develnext.jphp.ext.charts.classes.charts.*;
import org.develnext.jphp.ext.charts.classes.data.*;
import org.develnext.jphp.ext.charts.classes.axis.*;

import php.runtime.env.CompileScope;
import php.runtime.ext.support.Extension;

public class ChartsExtension extends Extension{

	public static final String NS = "php\\gui\\charts";
	
	@Override
	public Status getStatus(){
		return Status.EXPERIMENTAL;
	}

	@Override
	public void onRegister(CompileScope scope){
		registerWrapperClass(scope, XYChart.Data.class, UXXYChartData.class);
		registerWrapperClass(scope, XYChart.Series.class, UXXYChartSeries.class);
		registerWrapperClass(scope, PieChart.Data.class, UXPieChartData.class);

		registerWrapperClass(scope, Axis.class, UXAxis.class);
		registerWrapperClass(scope, CategoryAxis.class, UXCategoryAxis.class);
		registerWrapperClass(scope, ValueAxis.class, UXValueAxis.class);
		registerWrapperClass(scope, NumberAxis.class, UXNumberAxis.class);

		registerWrapperClass(scope, Chart.class, UXChart.class);
		registerWrapperClass(scope, XYChart.class, UXXYChart.class);
		registerWrapperClass(scope, LineChart.class, UXLineChart.class);
		registerWrapperClass(scope, AreaChart.class, UXAreaChart.class);
		registerWrapperClass(scope, StackedAreaChart.class, UXStackedAreaChart.class);
		registerWrapperClass(scope, BarChart.class, UXBarChart.class);
		registerWrapperClass(scope, StackedBarChart.class, UXStackedBarChart.class);
		registerWrapperClass(scope, ScatterChart.class, UXScatterChart.class);
		registerWrapperClass(scope, BubbleChart.class, UXBubbleChart.class);
		registerWrapperClass(scope, PieChart.class, UXPieChart.class);
	}
}