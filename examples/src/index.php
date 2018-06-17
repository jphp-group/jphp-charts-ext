<?php 
use php\gui\UXApplication;
use php\gui\UXForm;
use php\gui\UXScene;
use php\gui\UXListView;
use php\gui\UXHyperlink;
use php\gui\layout\UXVBox;
use php\gui\layout\UXAnchorPane;
use php\gui\event\UXMouseEvent;
use php\gui\UXDesktop;

UXApplication::launch(function(UXForm $form){
    $form->scene = new UXScene(new UXVBox(), [640, 480]);
    $form->resizable = false;
    
    static $forms = [];
    
    $listView = new UXListView();
    $listView->on('click', function(UXMouseEvent $e)use(&$forms){
        if($e->clickCount < 2){
            return;
        }
        $item = $e->sender->selectedItem;
        if(!$item){
            return;
        }
        if(!$forms[$item]){
            $class = "charts\\{$item}";
            $forms[$item] = new $class;
        }
        $forms[$item]->show();
    });
    
    $listView->items->addAll(['UXAreaChartExample', 'UXBarChartExample', 'UXLineChartExample', 'UXPieChartExample']);
    UXVBox::setVgrow($listView, 'ALWAYS');
    
    $link = new UXHyperlink('Больше информации');
    $link->on('action', function(){
        $desktop = new UXDesktop();
        $desktop->browse('https://docs.oracle.com/javafx/2/charts/chart-overview.htm');
    });
    
    $form->add($listView);
    $form->add($link);
    $form->show();
});