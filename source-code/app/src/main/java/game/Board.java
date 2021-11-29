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
    User player1;
    User player2;
    User currUser;

    Board() {
        this.player1=new User("Player1");
        this.player2=new User("Player2");
    }

    public void setPlayer1(User player1) {
        this.player1 = player1;
    }

    public void setPlayer2(User player2) {
        this.player2 = player2;
    }

    public void setCurrUser(User currUser) {
        this.currUser = currUser;
    }

    public User getPlayer1() {
        return player1;
    }

    public User getPlayer2() {
        return player2;
    }

    public User getCurrUser() {
        return currUser;
    }

    public GridPane create(Stage stage) {
        GridPane board=new GridPane();

        for(int i=0; i<this.size; i++) {
            for(int j=0; j<this.size; j++) {
                Rectangle tile=new Rectangle(50, 50);
                tile.setFill(Color.WHITESMOKE);
                tile.setStroke(Color.BLACK);

                final int index=i+(j*3);

                board.add(tile, i, j);
                tile.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        if(currUser==player1) {
                            tile.setFill(Color.RED);
                            player1.setPick(index);
                            setCurrUser(player2);
                        } else {
                            tile.setFill(Color.BLUE);
                            player2.setPick(index);
                            setCurrUser(player1);
                        }
                    }
                });
            }
        }
        return board;
    }

    // public void changePlayer(User currUser) {
    //     if(currUser==player1) {
    //         currUser=player2;
    //     } else {
    //         currUser=player1;
    //     }
    // }
}
