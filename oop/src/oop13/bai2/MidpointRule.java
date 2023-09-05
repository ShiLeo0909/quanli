package oop13.bai2;

public class MidpointRule implements Integrator {
    private double precision;
    private int maxIterations;

    public MidpointRule(double precision, int maxIterations) {
        /* TODO */
        this.precision = precision;
        this.maxIterations = maxIterations;
    }

    /**
     * Phương thức tính xấp xỉ giá trị tích phân. Giá trị xấp xỉ được chấp nhận nếu phép tính đạt độ chính xác đã cho,
     * hoặc có số vòng vượt quá ngưỡng quy định.
     * Độ chính xác được xác định như sau, chọn n0 tùy ý, sau đó tính I_n với n = n0, 2n0, 4n0, ...
     * Việc tính toán dừng lại khi |I_2n - In|/3 < eps (precision), hoặc số lần chia đôi vượt quá ngưỡng quy định (maxIterations).
     * @param poly
     * @param lower
     * @param upper
     * @return
     */
    @Override
    public double integrate(Polynomial poly, double lower, double upper) {
        /* TODO */
        int n = 1;
        double previousApproximation = 0.0;
        double currentApproximation = approximate(poly, lower, upper, n);

        while (Math.abs(currentApproximation - previousApproximation) / 3 >= precision && n <= maxIterations) {
            previousApproximation = currentApproximation;
            n *= 2;
            currentApproximation = approximate(poly, lower, upper, n);
        }

        return currentApproximation;
    }

    /**
     * Phương thức tính xấp xỉ giá trị tích phân với numOfSubIntervals khoảng phân hoạch đều.
     * @param poly
     * @param lower
     * @param upper
     * @param numOfSubIntervals
     * @return giá trị xấp xỉ giá trị tích phân.
     */
    private double integrate(Polynomial poly, double lower, double upper, int numOfSubIntervals) {
        /* TODO */
        double deltaX = (upper - lower) / numOfSubIntervals;
        double sum = 0;

        for (int i = 0; i < numOfSubIntervals; i++) {
            double x = lower + (i + 0.5) * deltaX;
            double y = poly.evaluate(x);
            sum += y;
        }

        return deltaX * sum;
    }
    private double approximate(Polynomial poly, double lower, double upper, int numOfSubIntervals) {
        double delta = (upper - lower) / numOfSubIntervals;
        double sum = 0.0;

        for (int i = 0; i < numOfSubIntervals; i++) {
            double midpoint = lower + (i + 0.5) * delta;
            double evaluation = poly.evaluate(midpoint);
            sum += evaluation;
        }

        return delta * sum;
    }
}
