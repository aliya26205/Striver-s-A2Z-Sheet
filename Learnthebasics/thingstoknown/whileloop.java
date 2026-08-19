/*Given a digit d (0 to 9), find the sum of the first 50 positive integers (integers > 0) \
that end with digit d.
A number ends with digit d if its last digit is d. */
package Learnthebasics.thingstoknown;
import java.util.*;
public class whileloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        int n=1;
        int count=0;
        int sum=0;
        while(count<50){
            if(n%10==d){
                sum=sum+n;
                count++;
            }
            n++;
        }
        System.out.println(sum);
    }
}
