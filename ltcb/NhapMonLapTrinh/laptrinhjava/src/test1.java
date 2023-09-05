public class new1{
public static void main(String[] args){
int a = Integer.parseInt(args[0]);
int b = Integer.parseInt(args[1]);
int c = Integer.parseInt(args[2]);
boolean check = true;
if ( a == b && b == c){
check = true;
}else{
check = false;
break;
}
}
}