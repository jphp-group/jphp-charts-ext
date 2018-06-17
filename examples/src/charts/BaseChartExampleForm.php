<?php
namespace charts;

use php\gui\UXForm;
use php\gui\UXScene;
use php\gui\layout\UXAnchorPane;


abstract class BaseChartExampleForm extends UXForm{
    function __construct(){
        parent::__construct();
        
        $this->scene = new UXScene(new UXAnchorPane(), [640, 480]);
        $node = $this->createChart();
        UXAnchorPane::setAnchor($node, 0);
        $this->add($node);
    }
    abstract function createChart();
}