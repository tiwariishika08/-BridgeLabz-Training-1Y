import java.util.Scanner;
class Controlflow{
public static void main(String[] args){
    for(int p=1;p<=5;p++){
        for(int k=1;k<=5;k++){ 
    System.out.print("*");
    }
     System.out.println();
    }
System.out.println("while ");
int i =1 ;
while(i<=20){
System.out.println(i+" ");
i++;
}
System.out.println("do while");
int j = 0;
do{
System.out.println(j);
j++;
}
while(j<=20);
System.out.println("for each ");
int arr[]={10,20,30,40};
for(int num: arr){
System.out.println(num);
}
} 
}