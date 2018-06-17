<?php
namespace charts;

use php\gui\UXForm;
use php\gui\charts\{UXChart, UXNumberAxis, UXXYChartData, UXXYChartSeries, UXLineChart, UXAreaChart, UXAxis, UXValueAxis,
                   UXBarChart, UXCategoryAxis, UXScatterChart, UXBubbleChart, UXStackedAreaChart, UXStackedBarChart, UXPieChart, UXUXPieChartData, UXXYChart, UXPieChartData};

class UXPieChartExample extends BaseChartExampleForm{
    function createChart(){
        
        $chart = new UXPieChart();
        $chart->chartData->addAll([new UXPieChartData("Грейпфруты", 13),
                new UXPieChartData("Апельсины", 25),
                new UXPieChartData("Сливы", 10),
                new UXPieChartData("Груши", 22),
                new UXPieChartData("Яблоки", 30)]);

        $chart->title = "Импорт фруктов";
        
        return $chart;
    }
}