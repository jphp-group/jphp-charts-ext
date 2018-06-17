<?php
namespace php\gui\charts;

use php\gui\text\UXFont;
use php\gui\paint\UXColor;
use php\gui\layout\UXRegion;

class UXAxis extends UXRegion{
    /**
    * @var bool
    */
    public $tickLabelsVisible;
    /**
    * @var bool
    */
    public $tickLabelRotation;
    /**
    * @var string
    */
    public $side;
    /**
    * @var string
    */
    public $label;
    /**
    * @var bool
    */
    public $tickMarkVisible;
    /**
    * @var double
    */
    public $tickLength;
    /**
    * @var bool
    */
    public $autoRanging;
    /**
    * @var double
    */
    public $tickLabelGap;
    /**
    * @var bool
    */
    public $animated;
    /**
    * @var UXFont
    */
    public $tickLabelFont;
    /**
    * @var UXColor
    */
    public $tickLabelFill;
}