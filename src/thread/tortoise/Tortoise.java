package thread.tortoise;

import javax.swing.*;

public class Tortoise extends Thread {
    public static final int MILESTONES = 5;
    private final Thread tortoise;
    public Tortoise() {
        this.tortoise = new Thread(this, "Torotise");
    }

    public Thread getTortoise() {
        return tortoise;
    }
}

