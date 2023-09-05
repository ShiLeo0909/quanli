//package oop10.decorator;
//
//import java.io.ByteArrayInputStream;
//import java.io.ByteArrayOutputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.zip.DeflaterOutputStream;
//import java.util.zip.InflaterInputStream;
//
//public class CompressionDecorator extends DataSourceDecorator{
//    private int compLevel = 6;
//    public CompressionDecorator(DataSource s) {
//        super(s);
//    }
//    public int getCompLevel() {
//        return compLevel;
//    }
//    public void setCompLevel(int index) {
//        this.compLevel = index;
//    }
//    @Override
//    public void writeData(String data) {
//        super.writeData(data);
//    }
//
//    @Override
//    public String readData() {
//       return super.readData();
//    }
//    private String compress(String stringData){
//        byte[] data  = stringData.getBytes();
//        try {
//            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
//            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream,new Deflater(compLevel));
//            deflaterOutputStream.write(data);
//            deflaterOutputStream.close();
//            byteArrayOutputStream.close();
//            return getEncoder().encodeToString(byteArrayOutputStream.toByteArray());
//        }catch (IOException e){
//            return null;
//        }
//    }
//    private String decompress(String stringData){
//        byte[] data = getDeacoder().decode(stringData);
//        try {
//            InputStream inputStream = new ByteArrayInputStream(data);
//            InflaterInputStream inflaterInputStream = new InflaterInputStream(inputStream);
//            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
//            int index;
//            while ((index = inflaterInputStream.read()) != -1){
//                byteArrayOutputStream.write(index);
//            }
//            inputStream.close();
//            inflaterInputStream.close();
//            byteArrayOutputStream.close();
//            return new String(byteArrayOutputStream.toByteArray());
//        }catch (IOException e){
//            return null;
//        }
//    }
//}
