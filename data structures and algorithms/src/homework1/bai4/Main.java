package homework1.bai4;

public class Main {
    public static void main(String[] args) {
        CenterO centerO = new CenterO(0, 0, 0);
        Globular globular1  = new Globular(1 ,2,3,4);
        Globular globular2 = new Globular(1,2,3,5);
        System.out.println(Sxq(globular1));
        System.out.println(V(globular1));
        checkBao(globular1, globular2);
        checkGiao(globular1, globular2);
    }
    public static int Sxq(Globular globular){
        double sxq = 4 * Math.PI  * Math.pow(globular.getR(), 2);
        return (int) sxq;
    }
    public static int V (Globular globular){
        double v = 4/3 * Math.PI *Math.pow(globular.getR(), 3);
        return (int) v;
    }
    public static void checkBao(Globular globular1 , Globular globular2){
        if(globular1.getX() != globular2.getX() || globular1.getY() != globular2.getY() || globular1.getZ() != globular2.getZ()){
            System.out.println("Hai hình cầu không bao nhau");
        }else{
            if(globular1.getR() > globular2.getR()){
                System.out.println("globular1 bao globular2");
            }else if(globular1.getR() < globular2.getR()){
                System.out.println("globular2 bao globular1");
            }else {
                System.out.println("Hai hình cầu trùng nhau");
            }
        }
    }
    public static void checkGiao(Globular globular1 , Globular globular2){
        if(Kc(globular1 , globular2) < (globular1.getR()+ globular2.getR())){
             if(Kc(globular1 , globular2) == Math.abs(globular1.getR()- globular2.getR())) {
                 System.out.println("Hai hình cầu tiếp xúc trong");
             }else{
                 System.out.println("Hai hình cầu giao nhau");
             }
        }else if(Kc(globular1 , globular2) == globular1.getR()+ globular2.getR()) {
            System.out.println("Hai hình cầu tiếp xúc ngoài");
        }else{
            System.out.println("Hai hình cầu không cắt nhau");
        }if(globular1.getX() == globular2.getX() & globular1.getY() == globular2.getY() & globular1.getZ() == globular2.getZ()){
            System.out.println("Hai hình cầu đồng tâma");
        }

    }
    public static double Kc (Globular globular1 , Globular globular2){
        double x = Math.pow(globular1.getX()- globular2.getX(), 2);
        double y = Math.pow(globular1.getY()- globular2.getY(), 2);
        double z = Math.pow(globular1.getZ()- globular2.getZ(), 2);
        double kc = Math.sqrt(x + y +z);
        return kc;
    }
}
