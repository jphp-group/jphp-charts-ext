<?php
namespace charts;

use php\gui\UXForm;
use php\gui\charts\{UXChart, UXNumberAxis, UXXYChartData, UXXYChartSeries, UXLineChart, UXAreaChart, UXAxis, UXValueAxis,
                   UXBarChart, UXCategoryAxis, UXScatterChart, UXBubbleChart, UXStackedAreaChart, UXStackedBarChart, UXPieChart, UXPieChartData, UXXYChart};

class UXBarChartExample extends BaseChartExampleForm{
    function createChart(){
        $x = new UXCategoryAxis();
        $y = new UXNumberAxis();
        $chart = new UXBarChart($x, $y);
        $chart->title = "Статистика";
        $x->label = "Страна";
        $y->label = "Значение";

        $series1 = new UXXYChartSeries();
        $series1->name = "2003";       
        $series1->chartData->add(new UXXYChartData("austria", 25601.34));
        $series1->chartData->add(new UXXYChartData("brazil", 20148.82));
        $series1->chartData->add(new UXXYChartData("france", 10000));
        $series1->chartData->add(new UXXYChartData("italy", 35407.15));
        $series1->chartData->add(new UXXYChartData("usa", 12000));      

        $series2 = new UXXYChartSeries();
        $series2->name = "2004";
        $series2->chartData->add(new UXXYChartData("austria", 57401.85));
        $series2->chartData->add(new UXXYChartData("brazil", 41941.19));
        $series2->chartData->add(new UXXYChartData("france", 45263.37));
        $series2->chartData->add(new UXXYChartData("italy", 117320.16));
        $series2->chartData->add(new UXXYChartData("usa", 14845.27));  

        $series3 = new UXXYChartSeries();
        $series3->name = "2005";
        $series3->chartData->add(new UXXYChartData("austria", 45000.65));
        $series3->chartData->add(new UXXYChartData("brazil", 44835.76));
        $series3->chartData->add(new UXXYChartData("france", 18722.18));
        $series3->chartData->add(new UXXYChartData("italy", 17557.31));
        $series3->chartData->add(new UXXYChartData("usa", 92633.68));  
        
        $chart->series->addAll([$series1, $series2, $series3]);
        
        return $chart;
    }
}