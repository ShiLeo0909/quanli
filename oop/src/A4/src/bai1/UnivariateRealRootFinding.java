package bai1;


public class UnivariateRealRootFinding {
    private AbstractFunction function;
    private RootSolver rootSolver;

    /**
     * Khởi tạo hàm.
     * @param function
     */
    public UnivariateRealRootFinding(AbstractFunction function) {
        /* TODO */
        this.function = function;
    }

    /**
     * Khởi tạo hàm và phương pháp tìm nghiệm.
     * @param function
     * @param rootSolver
     */
    public UnivariateRealRootFinding(AbstractFunction function, RootSolver rootSolver) {
        /* TODO */
        this.function = function;
        this.rootSolver = rootSolver;
    }

    public void setPoly(AbstractFunction function) {
        /* TODO */
        this.function = function;
    }

    public void setRootSolver(RootSolver rootSolver) {
        /* TODO */
        this.rootSolver = rootSolver;
    }

    /**
     * Tìm nghiệm của hàm theo phương pháp đã cho.
     * @param lower
     * @param upper
     * @return nghiệm của hàm.
     */
    public double solve(double lower, double upper) {
        /* TODO */
        if (function == null || rootSolver == null) {
            throw new IllegalStateException("The method looks for the function or the method has not been started.");
        }

        return rootSolver.solve(function, lower, upper);
    }

}