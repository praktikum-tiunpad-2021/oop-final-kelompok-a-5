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

    public GridPane create(Stage stage, User user) {
        GridPane board=new GridPane();

        for(int i=0; i<this.size; i++) {
            for(int j=0; j<this.size; j++) {
                Rectangle tile=new Rectangle(50, 50);
                tile.setFill(Color.WHITESMOKE);
                tile.setStroke(Color.BLACK);

                final int index=(i*3)+j;

                board.add(tile, i, j);
                tile.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        tile.setFill(Color.RED);
                        user.setPick(index);
                    }
                });
            }
        }
        return board;
    }
}
