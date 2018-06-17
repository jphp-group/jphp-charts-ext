<?php
namespace php\gui\charts;


use php\gui\charts\UXChart;
use php\gui\UXList;

class UXXYChart extends UXChart{
    /**
    * @var UXList of XYChartSeries
    */
    public $series;
    /**
    * @var bool
    */
    public $verticalGridLinesVisible;
    /**
    * @var bool
    */
    public $horizontalGridLinesVisible;
    /**
    * @var bool
    */
    public $alternativeColumnFillVisible;
    /**
    * @var bool
    */
    public $alternativeRowFillVisible;
    /**
    * @var bool
    */
    public $verticalZeroLineVisible;
    /**
    * @var bool
    */
    public $horizontalZeroLineVisible;
}