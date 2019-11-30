package sample;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class Sunflower extends Plant{
    transient private Timeline sunProducer;
    public Sunflower(int x, int y,int row,int col){
        super(x,y,"file:src/sample/assets/sunflower.gif",100,73,74,row,col);
    }

    @Override
    public void attack(Pane pane){
        produceSun(pane);
    }

    public void produceSun(Pane pane){
        Timeline sunProducer = new Timeline(new KeyFrame(Duration.seconds(7), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                checkHp();
                Sun s = new Sun(getX()+20, getY()+40, false);
                s.makeImage(pane);
            }
        }));
        sunProducer.setCycleCount(Timeline.INDEFINITE);
        sunProducer.play();
        this.sunProducer = sunProducer;
    }
    public Timeline getTimeline()
    {
        return this.sunProducer;
    }

    public void checkHp()
    {
        if(getHp()<=0)
        {
            endAnimation(sunProducer);
        }
    }
}
