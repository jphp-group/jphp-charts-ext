<?php
namespace php\gui\charts;


use php\gui\charts\UXValueAxis;

class UXNumberAxis extends UXValueAxis{
    /**
    * @var bool
    */
    public $forceZeroInRange;
    /**
    * @var double
    */
    public $tickUnit;
}