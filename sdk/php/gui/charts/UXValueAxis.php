<?php
namespace php\gui\charts;


use php\gui\charts\UXAxis;

class UXValueAxis extends UXAxis{
    /**
    * @var double
    */
    public $minorTickVisible;
    /**
    * @var double
    */
    public $upperBound;
    /**
    * @var double
    */
    public $lowerBound;
    /**
    * @var double
    */
    public $minorTickLength;
    /**
    * @var int
    */
    public $minorTickCount;
}