package Classwork.Labs.Lab7.EnumExample;

public enum Level {
    Low(3),
    Medium(7),
    High(9);

    private int value;
    Level(int value) {
        this.value = value;
    }
    
}
