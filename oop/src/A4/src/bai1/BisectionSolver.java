package bai1;

public class BisectionSolver implements RootSolver {
    private double tolerance;
    private int maxIterations;

    /**
     * Khởi tạo giá trị các tham số.
     * @param tolerance
     * @param maxIterations
     */
    public BisectionSolver(double tolerance, int maxIterations) {
        /* TODO */
        this.tolerance = tolerance;
        this.maxIterations = maxIterations;
    }

    public BisectionSolver() {
    }

    /**
     * Tìm nghiệm của hàm một biến theo phương pháp chia đôi (Bisection)
     * @param function
     * @param lower
     * @param upper
     * @return nghiệm của hàm.
     */
    @Override
    public double solve(AbstractFunction function, double lower, double upper) {
        /* TODO */
        double x = (lower + upper) / 2.0;
        double fLower = function.evaluate(lower);
        double fUpper = function.evaluate(upper);
        double fx = function.evaluate(x);

        if (fLower * fUpper >= 0) {
            throw new IllegalArgumentException("Không có nghiệm trong khoảng đã cho.");
        }

        for (int i = 0; i < maxIterations; i++) {
            x = (lower + upper) / 2.0;
            fx = function.evaluate(x);

            if (Math.abs(fx) < tolerance) {
                break;
            }

            if (fLower * fx < 0) {
                upper = x;
            } else {
                lower = x;
            }
        }

        return x;
    }
}