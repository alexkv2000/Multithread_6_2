import java.util.Random;

public class LandPlot {
    private final int length;
    private final int width;
    private final int cost;
    private final Random random = new Random();

    public LandPlot() {
        length = random.nextInt(100) + 60;
        width = random.nextInt(30) + 10;
        cost = length * width * (random.nextInt(1000) + 500);
    }

    public int getCost() {
        return cost;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Участок длиной " + length +
                " м, шириной " + width +
                " м, стоимостью " + cost +
                " рублей.";
    }
}
