package Learnthebasics.thingstoknown;
import java.util.*;
public class if_else {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        boolean c=sc.nextBoolean();
        if(age>=18){
            if(c){
                System.out.println("Eligible to vote");
            }else{
                System.out.println("Not a citizen to vote");
            }
        }else{
            System.out.println("not eleigible under age");
        }
    }
}
