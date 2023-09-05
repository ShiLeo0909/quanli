package EX1_5;

public class ResizableCircle extends Circle implements Resizacble {
    public ResizableCircle(double radius) {
        super(radius);
    }

    public void resize(int percent) {
        radius *= percent / 100.0;
    }

    @Override
    public String toString() {
        return "ResizableCircle[" + super.toString() +
                ']';
    }
}
