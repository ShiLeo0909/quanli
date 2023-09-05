package thithu;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;
import java.io.File;
public class CustomManagement {
    public static ArrayList<NewBook> readData(String filename){
        Scanner input = null;
        ArrayList<NewBook> listbook = new ArrayList<>();
        try {
            input = new Scanner(new File(filename));
            while(input.hasNext()){
                String id = input.nextLine();
                String name = input.nextLine();
                String author = input.nextLine();
                int cost = Integer.parseInt(input.nextLine());
                Double percent = Double.parseDouble(input.nextLine());
                NewBook book = new NewBook(id, name, author, cost, percent);
                listbook.add(book);               
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return listbook;
    }
    public static void printInfo(ArrayList<NewBook> listbook){
        for (int i=0 ; i < listbook.size() ; i++){
            System.out.println(listbook.get(i));
        }
    }
    public static void sort(ArrayList<NewBook> listbook)
	{
		for (int i=0 ; i < listbook.size() -1 ; i++){
            for (int j=i+1 ; j< listbook.size() ; j++){
                if (listbook.get(i).getAuthor().compareTo(listbook.get(j).getAuthor()) > 0){
                    NewBook book = listbook.get(i);
                    listbook.set(i,listbook.get(j));
                    listbook.set(j,book);
                }
            }
        }
	}
    public static ArrayList<String> inputlistid(int n , Scanner input){
        ArrayList<String> listid = new ArrayList<>();
        for (int i=0;i<n;i++){
            String id = input.nextLine();
            listid.add(id);
        }
        return listid;
    }
    public static ArrayList<NewBook> matchBook(ArrayList<String> idbook , String filename){
        ArrayList<NewBook> listbook = readData(filename);
        ArrayList<NewBook> listsold = new ArrayList<>();
        for (int i=0;i<idbook.size();i++){
            for (int j=0;j<listbook.size();j++){
                if (idbook.get(i).equals(listbook.get(j).getID())){
                    listsold.add(listbook.get(j));
                }
            }
        }
        return listsold;
    }
    public static Custom readCustomer(Scanner input){
        String idcustom = input.nextLine();
        String namecustom = input.nextLine();
        System.out.println("Nhap vao so luong id book");
        int n = input.nextInt();
        input.nextLine();
        ArrayList<String> listidbook = inputlistid(n, input);
        int vip = input.nextInt();
        Custom customer = new Custom(idcustom, namecustom, listidbook, vip);
        return customer;
    }
    public static void writeFile(Custom customer  , String filenamein , String filenameout){
        Formatter fmt = null;
        try {
            fmt = new Formatter(new File(filenameout));
            double s=0;
            ArrayList<NewBook> dataBook = readData(filenamein);
            ArrayList<NewBook> listsold = matchBook(customer.getListID(),filenamein);
            fmt.format(customer.toString() + "\n");
            for (int i=0;i<customer.getSizeList();i++){
                fmt.format("\n" + (i+1) + "." + listsold.get(i));
                s+=listsold.get(i).getCost();
            }
            fmt.format("\nTong tien la" +s);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            fmt.close();
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Custom tester = readCustomer(input);
        writeFile(tester, "book.txt", "invoice.txt");
    }
}
