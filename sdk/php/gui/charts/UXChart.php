<?php
namespace php\gui\charts;


use php\gui\layout\UXRegion;

class UXChart extends UXRegion{
    /**
    * @var string
    */
    public $title;
    /**
    * @var bool
    */
    public $animated;
    /**
    * @var string
    */
    public $titleSide;
    /**
    * @var bool
    */
    public $legendVisible;
    /**
    * @var string
    */
    public $legendSide;
}