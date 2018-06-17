<?php
namespace charts;

use php\gui\UXForm;
use php\gui\charts\{UXChart, UXNumberAxis, UXXYChartData, UXXYChartSeries, UXLineChart, UXAreaChart, UXAxis, UXValueAxis,
                   UXBarChart, UXCategoryAxis, UXScatterChart, UXBubbleChart, UXStackedAreaChart, UXStackedBarChart, UXPieChart, UXPieChartData, UXXYChart};

class UXAreaChartExample extends BaseChartExampleForm{
    function createChart(){
        $x = new UXNumberAxis;
        $y = new UXNumberAxis;
        
        $chart = new UXAreaChart($x, $y);
        
        $chart->title = 'График изменения погоды';
        $seriesApril = new UXXYChartSeries();
        $seriesApril->name = "Апрель";
        $seriesApril->chartData->add(new UXXYChartData(1, 4));
        $seriesApril->chartData->add(new UXXYChartData(3, 10));
        $seriesApril->chartData->add(new UXXYChartData(6, 15));
        $seriesApril->chartData->add(new UXXYChartData(9, 8));
        $seriesApril->chartData->add(new UXXYChartData(12, 5));
        $seriesApril->chartData->add(new UXXYChartData(15, 18));
        $seriesApril->chartData->add(new UXXYChartData(18, 15));
        $seriesApril->chartData->add(new UXXYChartData(21, 13));
        $seriesApril->chartData->add(new UXXYChartData(24, 19));
        $seriesApril->chartData->add(new UXXYChartData(27, 21));
        $seriesApril->chartData->add(new UXXYChartData(30, 21));
        
        $seriesMay = new UXXYChartSeries();
        $seriesMay->name = "Май";
        $seriesMay->chartData->add(new UXXYChartData(1, 20));
        $seriesMay->chartData->add(new UXXYChartData(3, 15));
        $seriesMay->chartData->add(new UXXYChartData(6, 13));
        $seriesMay->chartData->add(new UXXYChartData(9, 12));
        $seriesMay->chartData->add(new UXXYChartData(12, 14));
        $seriesMay->chartData->add(new UXXYChartData(15, 18));
        $seriesMay->chartData->add(new UXXYChartData(18, 25));
        $seriesMay->chartData->add(new UXXYChartData(21, 25));
        $seriesMay->chartData->add(new UXXYChartData(24, 23));
        $seriesMay->chartData->add(new UXXYChartData(27, 26));
        $seriesMay->chartData->add(new UXXYChartData(31, 26));
        
        $chart->series->addAll([$seriesApril, $seriesMay]);
        
        return $chart;
    }
}