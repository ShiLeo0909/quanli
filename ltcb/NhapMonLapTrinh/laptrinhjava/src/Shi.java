public class Shi {
public static void main(String[] args){
double a = Double.parseDouble(args[0]);
double b = Double.parseDouble(args[1]);
double c = Double.parseDouble(args[2]);
double d = Double.parseDouble(args[3]);
double m = a + b;
double n = c + d;
double p = a - b;
double q = c - d;
double l = a*c - b*d;
double h = a*d + b*c;
double e = h / (c*c + d*d);
double k = l / (c*c + d*d);
printComplex(a,b);
System.out.print("+");
printComplex(c,d);
System.out.print("=");
printComplex(m,n);
printComplex(a,b);
System.out.print("-");
printComplex(p,q);
System.out.print("=");
printComplex(p,q);
printComplex(a,b);
System.out.print("*");
printComplex(l,h);
System.out.print("=");
printComplex(l,h);
printComplex(a,b);
System.out.print("/");
printComplex(e,k);
System.out.print("=");
printComplex(e,k);
}
public static void printComplex(double a, double b){
System.out.print("("+ a + "+" + b + "i" + ")");
}
}