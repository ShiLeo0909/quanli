//package thicuoiki;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class ShoesManagement {
//    /*
//  Hàm đọc dữ liệu từ tệp fileName. Tệp fileName gồm thông tin của các đôi giày theo thứ tự sau:
//  Mã giày
//  Tên giày
//  Nhà sản xuất
//  Năm sản xuất
//  Giá
//  */
//    public ArrayList<Shoes> readShoes(String fileName) {
//        ArrayList<Shoes> list = new ArrayList<>();
//        try{
//            Scanner sc = new Scanner (new File(fileName));
//            while( sc.hasNextLine()){
//                sc.nextLine();
//                String id = sc.nextLine();
//                String name = sc.nextLine();
//                String manu = sc.nextLine();
//                int year = sc.nextInt();
//                double price = sc.nextDouble();
//                list.add(new Shoes(id , name, manu , year , price));
//
//            }
//            sc.close();
//
//        }catch(FileNotFoundException e ){
//            e.printStackTrace();
//        }
//
//        return list;
//    }
//
//    // Sử dụng hàm toString của Shoes để in ra thông tin các đôi giày vừa đọc được trong tệp
//    public void printShoes(ArrayList<Shoes> shoes) {
//        for( Shoes i : shoes){
//            System.out.println(i.toString());
//        }
//    }
//
//    // Tìm và trả về các đôi giày có giá nhỏ nhất
//    public ArrayList<Shoes> getMinPriceShoes(ArrayList<Shoes> shoes) {
//        ArrayList<Shoes> min = new ArrayList<>();
//        for (int i = 0; i <  shoes.size()-1; i++) {
//            for (int j = i+1; j < shoes.size(); j++) {
//                if(shoes.get(i).getPrice()< shoes.get(j).getPrice()){
//                    Shoes tmp = shoes.get(i);
//                    shoes.set(i, shoes.get(j));
//                    shoes.set( j , tmp);
//                }
//            }
//        }
//        return min;
//    }
//
//    // Sắp xếp lại cac đôi giày theo tên (thứ tự từ A-Z)
//    public void sortByName(ArrayList<Shoes> shoes) {
//        for (int i = 0; i < shoes.size()-1; i++) {
//            for (int j = i+1; j < shoes.size() ; j++) {
//                if(shoes.get(i).getName().compareTo(shoes.get(j).getName()) >0){
//                    Shoes   tmp = shoes.get(i);
//                    shoes.set(i , shoes.get(j));
//                    shoes.set(j, tmp);
//                }
//            }
//        }
//        printShoes(shoes);
//
//    }
//
//    /*
//        Hàm đọc dữ liệu khách hàng từ tệp có tên fileName. Tệp fileName chứa thông tin của các khách hàng theo thứ tự sau:
//        Mã khách hàng
//        Tên khách hàng
//        Ngày sinh
//        Địa chỉ
//        Giới tính
//        Điểm tích luỹ
//        Số đôi giày đã mua (n)
//        // n dòng tiếp theo là id của các đôi giày đã mua
//        Id đôi giày 1
//        Id đôi giày 2
//        ...
//
//    */
//    public ArrayList<Customer> readCustomer(String fileName) {
//        ArrayList<Customer> customers = new ArrayList<>();
//        try{
//            Scanner sc = new Scanner (new File(fileName));
//            while( sc.hasNextLine()){
//                String id = sc.nextLine();
//                String name = sc.nextLine();
//                String birthday = sc.nextLine();
//                String address = sc.nextLine();
//                String gender = sc.nextLine();
//                double score = sc.nextDouble();
//                int n = sc.nextInt();
//                sc.nextLine();
//                ArrayList<String> shoesIds = new ArrayList<>();
//                for (int i = 0; i < n ; i++) {
//                    shoesIds.add(sc.nextLine());
//                }
//                customers.add(new Customer(id , name , address , birthday , gender , score , shoesIds ));
//            }
//            sc.close();
//
//        }catch(FileNotFoundException e ){
//            e.printStackTrace();
//        }
//
//        return customers;
//    }
//
//
//    // Hàm in ra tên của các đôi giày mà khách hàng đã mua. Mỗi tên cách nhau một dấu cách
//    public void printNameOfShoes(Customer customer, ArrayList<Shoes> shoes) {
//        for (int i = 0; i <  customer.getShoesIds().size(); i++) {
//            for (int j = 0; j <  shoes.size(); j++) {
//                if(customer.getShoesIds().get(i).equals(shoes.get(j).getName())){
//                    System.out.println(shoes.get(j) + " ");
//                }
//            }
//        }
//
//    }
//
//
//    public static void main(String[] args) {
//        ShoesManagement shoesManagement = new ShoesManagement();
//        ArrayList<Shoes> shoes = shoesManagement.readShoes("shoes.txt");
//        System.out.println(shoesManagement.getMinPriceShoes(shoes));
//        shoesManagement.sortByName(shoes);
//        System.out.println(shoes);
//        ArrayList<Customer> customers = shoesManagement.readCustomer("customers.txt");
//        shoesManagement.printNameOfShoes(customers.get(0), shoes);
//    }
//}
