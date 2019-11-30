package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class CherryBomb extends Plant{
    ImageView powie=new ImageView(new Image("file:src/sample/assets/powie.gif",180,160,false,false));
    public CherryBomb(int x, int y,int row,int col) {
        super(x, y, "file:src/sample/assets/anim_cherrybomb.gif", 4,90,68,row,col);
        powie.setX(x-40);
        powie.setY(y-20);
        powie.setVisible(false);
        powie.setDisable(true);

    }

//    public void addPowie(){
//
//    }
    @Override
    public void attack(Pane pane) {
        pane.getChildren().add(powie);
        Thread t = new Thread(() -> {
            try {
                Thread.sleep(1800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            img.setVisible(false);
            img.setDisable(true);
            powie.setVisible(true);
            //roast zombies
            removepowie();
        });
        t.start();
    }

    public void removepowie(){
        Thread t = new Thread(() -> {
            try {
                Thread.sleep(1250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("ee");
            powie.setVisible(false);
        });
        t.start();
    }
}
