public class btvnt1 {
public static void main(String[] args){
int n = 5;
if ( n <2 ){
System.out.println(n + " không phải là số nguyên tố "); 
}else {
for(int i = 0; i < n; i++){
if ( n % i == 0){
System.out.println(n + " không phải là số nguyên tố ");
}else{
System.out.println(n + " là số nguyên tố"); 
}
}
}
}
}