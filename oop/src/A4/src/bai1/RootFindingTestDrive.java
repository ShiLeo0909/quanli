package bai1;

public class RootFindingTestDrive {
    public static void main(String[] args) {
        /*
        TODO

        Chạy các hàm test để test chương trình.
        Lưu kết quả chạy chương trình vào file text có tên <TenSinhVien_MaSinhVien_RootFinding>.txt
        (ví dụ, NguyenVanA_123456_RootFinding.txt).
        Nén tất cả các file source code và file kết quả chạy chương trình vào file zip có tên
        <TenSinhVien_MaSinhVien_RootFinding>.zip (ví dụ, NguyenVanA_123456_RootFinding.txt), và nộp bài
        lên classroom.
        */
        testRootSolver();
    }

    public static void testRootSolver() {
        /*
         TODO

         - Viết chương trình tìm nghiệm của hàm (sin(x).x - 3) theo các phương pháp đã cho (Bisection, Newton-Raphson, Secant) sử dụng
           UnivariateRealRootFinding. Các phương pháp tìm nghiệm của thể thay đổi ở thời gian chạy chương trình.
         - In ra phương pháp sử dụng, hàm và nghiệm của hàm tìm được.
         */
        double a = 12; // Điểm đầu của đoạn [a, b]
        double b = 14; // Điểm cuối của đoạn [a, b]

        // Tạo hàm x.sin(x) - 3
        UnivariateRealFunction function = new UnivariateRealFunction() {
            @Override
            public double evaluate(double x) {
                return x * Math.sin(x) - 3;
            }
        };

        // Bisection method
        BisectionSolver bisectionSolver = new BisectionSolver();
        double bisectionResult = bisectionSolver.solve(function,a,b);
        System.out.println("Bisection Method:");
        System.out.println("Function: x.sin(x) - 3");
        System.out.println("Interval: [" + a + ", " + b + "]");
        System.out.println("Root: " + bisectionResult);
        System.out.println();

        // Newton-Raphson method
        NewtonRaphsonSolver newtonRaphsonSolver = new NewtonRaphsonSolver();
        double newtonRaphsonResult = newtonRaphsonSolver.solve(function, a, b);
        System.out.println("Newton-Raphson Method:");
        System.out.println("Function: x.sin(x) - 3");
        System.out.println("Interval: [" + a + ", " + b + "]");
        System.out.println("Root: " + newtonRaphsonResult);
        System.out.println();

        // Secant method
        SecantSolver secantSolver = new SecantSolver();
        double secantResult = secantSolver.solve(function,a, b);
        System.out.println("Secant Method:");
        System.out.println("Function: x.sin(x) - 3");
        System.out.println("Interval: [" + a + ", " + b + "]");
        System.out.println("Root: " + secantResult);
    }
}
