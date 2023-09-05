package oop10.decorator.file;

import java.io.*;

public class FileDataSource implements DataSource {
    private String filename;

    public FileDataSource(String filename) {
        this.filename = filename;
    }

    @Override
    public void writeData(String data) {
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("ex.txt"));
            writer.write("This is the first line");
            writer.newLine();
            writer.write("This is the second line");
            writer.close();
            System.out.println("Data written to file successfully!");

        }catch(IOException e){
        System.out.println("An error occurred");
        e.printStackTrace();
    }
    }

    @Override
    public String readData() {
        String fileName = "ex.txt";
        StringBuilder content = new StringBuilder();
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String line;
            while((line = br.readLine()) !=  null){
                System.out.println(line);
                content.append(line);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        return content.toString();
    }
}
