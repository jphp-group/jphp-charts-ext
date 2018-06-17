<?php
namespace php\gui\charts;


use php\gui\charts\UXChart;
use php\gui\UXList;

class UXPieChart extends UXChart{
    /**
    * @var double
    */
    public $startAngle;
    /**
    * @var bool
    */
    public $clockwise;
    /**
    * @var double
    */
    public $labelLineLength;
    /**
    * @var bool
    */
    public $labelsVisible;
    /**
    * @var UXList of PieChartData
    */
    public $chartData;
}