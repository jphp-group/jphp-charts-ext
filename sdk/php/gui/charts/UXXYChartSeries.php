<?php
namespace php\gui\charts;

use php\gui\UXNode;

class UXXYChartSeries{
    /**
    * @var string
    */
    public $name;
    /**
    * @var UXNode
    */
    public $node;
    /**
    * @var UXXYChart
    */
    public $chart;
    /**
    * @var UXList of UXXYChartData
    */
    public $chartData;
}