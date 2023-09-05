package bai1;

public class NewtonRaphsonSolver implements RootSolver {
    private double tolerance;
    private int maxIterations;

    /**
     * Khởi tạo giá trị các tham số.
     * @param tolerance
     * @param maxIterations
     */
    public NewtonRaphsonSolver(double tolerance, int maxIterations) {
        /* TODO */
        this.tolerance = tolerance;
        this.maxIterations = maxIterations;
    }

    public NewtonRaphsonSolver() {
    }

    /**
     * Tìm nghiệm của hàm một biến sử dụng phương pháp Newton-Raphson.
     * @param function
     * @param lower
     * @param upper
     * @return nghiệm của hàm.
     */
    @Override
    public double solve(AbstractFunction function, double lower, double upper) {
        /* TODO */
        double x0 = (lower + upper) / 2.0;
        double x = x0;
        double fx = function.evaluate(x);

        for (int i = 0; i < maxIterations; i++) {
            double derivative = (function.evaluate(x + tolerance) - fx) / tolerance;
            double delta = fx / derivative;
            x -= delta;
            fx = function.evaluate(x);

            if (Math.abs(delta) < tolerance) {
                break;
            }
        }

        return x;
    }
}
