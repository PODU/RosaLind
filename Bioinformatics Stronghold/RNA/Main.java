import java.io.*;
import java.lang.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        int idx = t.indexOf("T");
        while(idx!=-1){
            if(idx+1<t.length())
                t = t.substring(0,idx)+"U"+t.substring(idx+1,t.length());
            else
                t = t.substring(0,idx)+"U";
            idx = t.indexOf("T");
        }
        System.out.println(t);
    }
}
