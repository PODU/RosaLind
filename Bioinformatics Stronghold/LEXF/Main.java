import java.io.*;
import java.lang.*;
import java.util.*;

public class Main{

    public static void check(int c,int n,String s,String[] arr,int idx){
        if(c==n){
            for(int i=0;i<arr.length;i++){
                System.out.println(s+arr[i]);
            }
        }else{
            for(int i=0;i<arr.length;i++){
                check(c+1,n,s+arr[i],arr,i);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] s=sc.nextLine().split(" ");
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<s.length;i++){
            check(2,n,s[i],s,i);
        }
    }
}
