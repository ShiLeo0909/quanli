package oop13.bai2;

public class IntegrationCalculatorTestDrive {
    public static void main(String[] args) {
        /*
         TODO

         - Chạy demo các hàm test.
         - Lưu kết quả chạy chương trình vào file text có tên <TenSinhVien_MaSinhVien_Integration>.txt
           (ví dụ, NguyenVanA_123456_Integration.txt)
         - Nộp file kết quả chạy chương trình (file text trên) cùng với các file source code.
         */
        testArrayPolynomial();
        testListPolynomial();
        testIntegrationCalculator();
    }

    public static void testArrayPolynomial() {
        /*
         TODO

         - Viết chương trình test các chức năng của ArrayPolynomial (thêm phần tử vào đa thức, xóa phần tử trong đa thức,
           sửa hệ số tại một phần tử, cộng 2 đa thức, trừ 2 đa thức, nhân 2 đa thức, tính giá trị của đa thức khi biết
           giá trị của x).
         */
        ArrayPolynomial polynomial1 = new ArrayPolynomial()
                .append(1)
                .append(2)
                .append(3);

        // Tạo đa thức 4 + 5x + 6x^2 + 7x^3
        ArrayPolynomial polynomial2 = new ArrayPolynomial()
                .append(4)
                .append(5)
                .append(6)
                .append(7);

        // In thông tin đa thức
        System.out.println("Polynomial 1: " + polynomial1.toString());
        System.out.println("Polynomial 2: " + polynomial2.toString());

        // Thêm phần tử vào đa thức
        polynomial1.append(4);
        System.out.println("Polynomial 1 after appending: " + polynomial1.toString());

        // Xóa phần tử trong đa thức
        polynomial2.remove(2);
        System.out.println("Polynomial 2 after removing: " + polynomial2.toString());

        // Sửa hệ số tại một phần tử
        polynomial1.set(10, 1);
        System.out.println("Polynomial 1 after setting coefficient: " + polynomial1.toString());

        // Cộng 2 đa thức
        ArrayPolynomial sum = polynomial1.plus(polynomial2);
        System.out.println("Sum of Polynomial 1 and Polynomial 2: " + sum.toString());

        // Trừ 2 đa thức
        ArrayPolynomial difference = polynomial1.minus(polynomial2);
        System.out.println("Difference of Polynomial 1 and Polynomial 2: " + difference.toString());

        // Nhân 2 đa thức
        ArrayPolynomial product = polynomial1.multiply(polynomial2);
        System.out.println("Product of Polynomial 1 and Polynomial 2: " + product.toString());

        // Tính giá trị của đa thức khi biết giá trị của x
        double x = 2.5;
        double value = polynomial1.evaluate(x);
        System.out.println("Value of Polynomial 1 at x = " + x + ": " + value);

    }

    public static void testListPolynomial() {
        /*
         TODO

         - Viết chương trình test các chức năng của ListPolynomial (thêm phần tử vào đa thức, xóa phần tử trong đa thức,
           sửa hệ số tại một phần tử, cộng 2 đa thức, trừ 2 đa thức, nhân 2 đa thức, tính giá trị của đa thức khi biết
           giá trị của x).
         */
        // Tạo đa thức 1 + 2x + 3x^2
        ListPolynomial polynomial1 = new ListPolynomial();
        polynomial1.append(1);
        polynomial1.append(2);
        polynomial1.append(3);

        // In ra đa thức 1
        System.out.println("Polynomial 1: " + polynomial1);

        // Thêm phần tử vào đa thức
        polynomial1.append(4);
        polynomial1.insert(5, 1);

        // In ra đa thức 1 sau khi thay đổi
        System.out.println("Polynomial 1 (after modification): " + polynomial1);

        // Xóa phần tử trong đa thức
        polynomial1.remove(2);

        // In ra đa thức 1 sau khi xóa
        System.out.println("Polynomial 1 (after removal): " + polynomial1);

        // Sửa hệ số của phần tử
        polynomial1.set(6, 0);

        // In ra đa thức 1 sau khi sửa
        System.out.println("Polynomial 1 (after setting coefficient): " + polynomial1);

        ListPolynomial polynomial2 = new ListPolynomial();
        polynomial2.append(2);
        polynomial2.append(3);
        polynomial2.append(4);

        // In ra đa thức 2
        System.out.println("Polynomial 2: " + polynomial2);

        // Cộng 2 đa thức
        ListPolynomial sum = polynomial1.plus(polynomial2);

        // In ra tổng của 2 đa thức
        System.out.println("Sum: " + sum);

        // Trừ 2 đa thức
        ListPolynomial difference = polynomial1.minus(polynomial2);

        // In ra hiệu của 2 đa thức
        System.out.println("Difference: " + difference);

        // Nhân 2 đa thức
        ListPolynomial product = polynomial1.multiply(polynomial2);

        // In ra tích của 2 đa thức
        System.out.println("Product: " + product);

        // Tính giá trị của đa thức khi biết giá trị của x
        double x = 2.5;
        double value = polynomial1.evaluate(x);

        // In ra giá trị của đa thức khi x = 2.5
        System.out.println("Value at x = " + x + ": " + value);
    }

    public static void testIntegrationCalculator() {
        /*
         TODO

         - Tạo một đa thức.
         - Viết demo chương trình tính tích phân xác định của đa thức theo các phương pháp đã cho (MidpointRule, TrapezoidRule, SimpsonRule) sử dụng
           IntegrationCalculator. Các phương pháp tính tích phân có thể thay đổi ở thời gian chạy chương trình.
         - In ra thông tin phương pháp sử dụng, đa thức, và giá trị tích phân của đa thức.
         */
        // Tạo một đa thức
        ArrayPolynomial poly = new ArrayPolynomial();// Ví dụ: đa thức 1 + 2x + 3x^2
        poly.append(1);
        poly.append(2);
        poly.append(3);
        // Tạo các phương pháp tích phân
        Integrator midpointRule = new MidpointRule(0.0001, 100);
        Integrator trapezoidRule = new TrapezoidRule(0.0001, 100);
        Integrator simpsonRule = new SimpsonRule(0.0001, 100);

        // Tạo đối tượng IntegrationCalculator
        IntegrationCalculator calculator = new IntegrationCalculator(poly);

        // Đặt phương pháp tích phân cho IntegrationCalculator
        calculator.setIntegrator(midpointRule);

        // Tính tích phân và in kết quả
        double result = calculator.integrate(0, 1);
        System.out.println("Phương pháp tích phân: Midpoint Rule");
        System.out.println("Đa thức: " + poly);
        System.out.println("Giá trị tích phân: " + result);

        // Đặt phương pháp tích phân khác cho IntegrationCalculator
        calculator.setIntegrator(trapezoidRule);

        // Tính tích phân và in kết quả
        result = calculator.integrate(0, 1);
        System.out.println("Phương pháp tích phân: Trapezoid Rule");
        System.out.println("Đa thức: " + poly);
        System.out.println("Giá trị tích phân: " + result);

        // Đặt phương pháp tích phân khác cho IntegrationCalculator
        calculator.setIntegrator(simpsonRule);

        // Tính tích phân và in kết quả
        result = calculator.integrate(0, 1);
        System.out.println("Phương pháp tích phân: Simpson Rule");
        System.out.println("Đa thức: " + poly);
        System.out.println("Giá trị tích phân: " + result);

    }
}
