import java.io.*;
import java.lang.*;
import java.util.*;

public class Main{

    public static int count(String r,String s){
        int idx = s.indexOf(r);
        int c=0;
        while(idx!=-1){
            c++;
            s = s.substring(idx+1,s.length());
            idx = s.indexOf(r);
        }
        return c;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print(count("A",s) +" ");
        System.out.print(count("C",s) +" ");
        System.out.print(count("G",s) +" ");
        System.out.println(count("T",s) +" ");
    }
}
