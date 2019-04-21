import java.io.*;
import java.lang.*;
import java.util.*;

public class Main{

    public static void check(int c,int n,String s){
        if(c==n){
            for(int i=1;i<=n;i++){
                if(s.indexOf(""+i)==-1){
                    System.out.println(s+i);
                }
            }
        }else{
            for(int i=1;i<=n;i++){
                if(s.indexOf(""+i)==-1){
                    check(c+1,n,s+i+" ");
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a=1;
        for(int i=1;i<=n;i++){
            a*=i;
        }
        System.out.println(a);
        String s="";
        for(int i=1;i<=n;i++){
            check(2,n,s+i+" ");
        }
    }
}
