import java.io.*;
import java.lang.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        int idx = s.indexOf(t);
        int base = 0;
        while(idx!=-1){
            System.out.print((base+idx+1)+" ");
            base = base+idx+1;
            s = s.substring(idx+1,s.length());
            idx = s.indexOf(t);
        }
    }
}
