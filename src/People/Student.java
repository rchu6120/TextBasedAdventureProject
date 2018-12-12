package People;

/**
 * Person represents the player as they move through the game.
 */
public class Student {
    String firstName;
    String familyName;
    int xLoc, yLoc;


    public int getxLoc() {
        return xLoc;
    }

    public void setxLoc(int xLoc) {
        this.xLoc = xLoc;
    }

    public int getyLoc() {
        return yLoc;
    }

    public void setyLoc(int yLoc) {
        this.yLoc = yLoc;
    }

    public Student(int xLoc, int yLoc)
    {
        this.xLoc = xLoc;
        this.yLoc = yLoc;
    }
}
