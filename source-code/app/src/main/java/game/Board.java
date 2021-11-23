package game;

import javafx.event.EventHandler;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;

public class Board {
    private final int size=3;

    Board() {
        GridPane board=new GridPane();
        
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                Rectangle tile=new Rectangle(50, 50);
                tile.setFill(Color.WHITESMOKE);
                tile.setStroke(Color.BLACK);

                board.add(tile, i, j);
                tile.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        tile.setFill(Color.RED);
                    }
                });
            }
        }
    }

    public GridPane create(Stage stage) {
        GridPane board=new GridPane();

        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                Rectangle tile=new Rectangle(50, 50);
                tile.setFill(Color.WHITESMOKE);
                tile.setStroke(Color.BLACK);

                board.add(tile, i, j);
                tile.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        tile.setFill(Color.RED);
                    }
                });
            }
        }
        return board;
    }
}
