//package oop10.decorator;
//
//public class EncryptionDecorator extends DataSourceDecorator {
//    public EncryptionDecorator(DataSource s) {
//        super(s);
//    }
//
//    @Override
//    public void writeData(String data) {
//        super.writeData(data);
//    }
//
//    @Override
//    public String readData() {
//         return  super.readData();
//    }
//    private String encode(String data){
//        byte[] result = data.getBytes();
//        for(int i=0 ; i < result.length; i++){
//            result[i] += (byte) 1;
//        }
//        return getEncoder().encodeToString(result);
//    }
//    private String decode(String data){
//        byte[] result = getDecoder().decode(data);
//        for(int i =0 ; i < result.length ; i++){
//            result[i] -= (byte) 1;
//        }
//        return new String(result);
//    }
//}
