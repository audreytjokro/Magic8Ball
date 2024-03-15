import java.awt.*;

public class Ball implements Comparable<Ball>{
    // instance fields
    private Color color;
    private int size;


    // constructors
    // we don't have a default constructor anymore
    // cannot construct a ball with no parameters
    public Ball(Color color, int size) {
        this.color = color;
        this.size = size;
    }


    // getters

    public Color getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    @Override
    public int compareTo(Ball other) {
        if (this.size < other.size){
            return -1;
        } else if (this.size > other.size){
            return 1;
        } else { // return 0
            return 0;
        }
    }


    // toString()
    // @override function verifies that somewhere in the inheritance hierarchy
    // there is a method that returns a string
    // and is called toString and doesn't take in parameters, does an "extra check"

    // if we removed the S for example it will tell us there's no method that we can
    // override in the superclass in the object class

    public String toString(){
        return "Ball Color: [ red = " + color.getRed() +
                ", green = " + color.getGreen() +
                ", blue = " + color.getBlue() +
                "] Ball size: " + getSize() + "inches";
    }
}
