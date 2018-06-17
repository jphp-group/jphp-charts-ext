<?php
namespace php\gui\charts;


use php\gui\charts\UXAxis;

class UXCategoryAxis extends UXAxis{
    /**
    * @var double
    */
    public $startMargin;
    /**
    * @var bool
    */
    public $gapStartAndEnd;
    /**
    * @var double
    */
    public $categorySpacing;
    /**
    * @var double
    */
    public $endMargin;
}