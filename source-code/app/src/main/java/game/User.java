package game;

public class User {
    private int[] pick;

    User() {
        this.pick=new int[9];
    }

    public void setPick(int value, int index) {
        this.pick[index]=value; 
    }
}
