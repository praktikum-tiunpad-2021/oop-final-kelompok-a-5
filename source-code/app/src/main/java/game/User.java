package game;

import java.util.Collection;
import java.util.Collections;
import java.util.Vector;
import javafx.scene.paint.Color;



public class User {
    private Vector<Integer> pick;
    private String title;

    User() {
        this.pick=new Vector<Integer>();
        this.title="";
    }

    User(String title) {
        this.pick=new Vector<Integer>();
        
        this.title=title;
    }

    public void setPick(int value) {
        pick.add(value);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Vector<Integer> getPick() {
        return pick;
    }

    public String getTitle() {
        return title;
    }
}
