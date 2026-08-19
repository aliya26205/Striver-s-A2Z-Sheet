/*Given two integers low and high, return the sum of all integers from low to high inclusive. */
package Learnthebasics.thingstoknown;
import java.util.*;
public class forloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int low=sc.nextInt();
        int high=sc.nextInt();
        int sum=0;
        for(int i=low;i<=high;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
