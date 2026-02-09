import java.util.Scanner;
public class Vote
{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int age[] = new int[10];
System.out.println("enter the age of 10 student");
for(int i=0;i<age.length;i++){
age[i] = sc.nextInt();
}
for(int i=0;i<age.length;i++){
if(age[i]<0){
System.out.println("invalid age ");
}
else if(age[i] >=18){
System.out.println("eligible to vote");
}
else{
System.out.println("not eligible ");
}
}
}
}

