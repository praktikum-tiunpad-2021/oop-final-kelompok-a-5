package game;

import java.util.Vector;

public class User {
    private Vector<Integer> pick;

    User() {
        this.pick=new Vector<Integer>();
    }

    public void setPick(int value) {
        pick.add(value);
    }

    public Vector<Integer> getPick() {
        return pick;
    }
}
