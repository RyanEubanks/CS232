package Classwork.Labs.CubeProject;

public class Cube {
    
    // Declare variables
    private float height, length, width, volume;

    // Cube constructor
    public Cube(float height, float length, float width) {
        this.height = height;
        this.length = length;
        this.width = width;
        calcVolume();
    }

    // Getters
    public float getHeight() {
        return this.height;
    }

    public float getLength() {
        return this.length;
    }

    public float getWidth() {
        return this.width;
    }

    public float getVolume() {
        return this.volume;
    }

    // calculate volume
    public float calcVolume() {
        this.volume = this.height * this.width * this.length;
        return this.volume;
    }

    // overriding the toString() method
    @Override 
    public String toString() {
        return " " + this.volume;
    }
}
