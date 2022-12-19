package ood.Map;

/**
 * The lane of game map.
 */
public class Lane {
    private String pos;
    private int width;
    private int height;

    public Lane() {
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
