public class Leo{
public static void main(String[] args){
double a = Double.parseDouble(args[0]);
double b = Double.parseDouble(args[1]);
if (a > b){
System.out.println("So lon nhat la a");
}else if (a == b){
System.out.println("Hai so bang nhau");
}else{
System.out.println("So lon nhat la b");
}
}
}