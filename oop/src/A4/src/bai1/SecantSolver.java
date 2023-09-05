package bai1;

public class SecantSolver implements RootSolver {
    private double tolerance;
    private int maxIterations;

    /**
     * Khởi tạo giá trị các tham số.
     *
     * @param tolerance
     * @param maxIterations
     */
    public SecantSolver(double tolerance, int maxIterations) {
        /* TODO */
        this.tolerance = tolerance;
        this.maxIterations = maxIterations;
    }

    public SecantSolver() {
    }

    /**
     * Tìm nghiệm của hàm một biến theo phương pháp Secant
     *
     * @param function
     * @param lower
     * @param upper
     * @return nghiệm của hàm trong đoạn [lower, upper]
     */
    @Override
    public double solve(AbstractFunction function, double lower, double upper) {
        /* TODO */
        double x0 = lower;
        double x1 = upper;
        double f0 = function.evaluate(x0);
        double f1 = function.evaluate(x1);
        double x = 0;

        for (int i = 0; i < maxIterations; i++) {
            if (Math.abs(f1 - f0) < tolerance) {
                break;
            }

            x = x1 - (f1 * (x1 - x0)) / (f1 - f0);
            double fx = function.evaluate(x);

            if (Math.abs(fx) < tolerance) {
                break;
            }

            x0 = x1;
            x1 = x;
            f0 = f1;
            f1 = fx;
        }

        return x;
    }
}
