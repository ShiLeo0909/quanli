package oop13.bai2;

public class SimpsonRule implements Integrator {
    private double precision;
    private int maxIterations;

    public SimpsonRule(double precision, int maxIterations) {
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
        int n0 = 1;
        double resultN = integrate(poly, lower, upper, n0);
        double result2N = integrate(poly, lower, upper, 2 * n0);
        int iterations = 1;

        while (Math.abs(result2N - resultN) / 15 >= precision && iterations < maxIterations) {
            resultN = result2N;
            n0 *= 2;
            result2N = integrate(poly, lower, upper, 2 * n0);
            iterations++;
        }

        return result2N;
    }

    /**
     * Phương thức tính xấp xỉ giá trị tích phân với numOfSubIntervals (số chẵn) khoảng phân hoạch đều.
     * @param poly
     * @param lower
     * @param upper
     * @param numOfSubIntervals
     * @return giá trị xấp xỉ giá trị tích phân.
     */
    private double integrate(Polynomial poly, double lower, double upper, int numOfSubIntervals) {
        /* TODO */
        double deltaX = (upper - lower) / numOfSubIntervals;
        double sum1 = 0;
        double sum2 = 0;

        for (int i = 0; i < numOfSubIntervals; i += 2) {
            double x0 = lower + i * deltaX;
            double x1 = lower + (i + 1) * deltaX;
            double x2 = lower + (i + 2) * deltaX;

            double y0 = poly.evaluate(x0);
            double y1 = poly.evaluate(x1);
            double y2 = poly.evaluate(x2);

            sum1 += y0 + 4 * y1 + y2;
            sum2 += y0 + 2 * y1 + y2;
        }

        return (deltaX / 3) * (sum1 + 2 * sum2);
    }
}
