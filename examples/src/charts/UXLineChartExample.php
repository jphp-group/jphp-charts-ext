<?php
namespace charts;

use php\gui\UXForm;
use php\gui\charts\{UXChart, UXNumberAxis, UXXYChartData, UXXYChartSeries, UXLineChart, UXAreaChart, UXAxis, UXValueAxis,
                   UXBarChart, UXCategoryAxis, UXScatterChart, UXBubbleChart, UXStackedAreaChart, UXStackedBarChart, UXPieChart, UXPieChartData, UXXYChart};

class UXLineChartExample extends BaseChartExampleForm{
    function createChart(){
        $x = new UXNumberAxis();
        $y = new UXNumberAxis();
        $chart = new UXLineChart($x, $y);
        $chart->title = "График косинусов и синусов";
        $x->label = "X";
        $y->label = "Y";

        $sin = new UXXYChartSeries();
        $sin->name = 'Синус';
        $cos = new UXXYChartSeries();
        $cos->name = 'Косинус';
        
        
        for($i = 0; $i < 20; $i++){
            $sin->chartData->add(new UXXYChartData($i, sin($i)));
            $cos->chartData->add(new UXXYChartData($i, cos($i)));
        }
        
        $chart->series->addAll([$sin, $cos]);
        
        return $chart;
    }
}