import java.io.*;
import java.lang.*;
import java.util.*;

public class Main{

    public static ArrayList<String> l = new ArrayList<>();

    public static void check(int c,int n,String s,ArrayList<Integer> list){
        if(c==n){
            for(int i=0;i<list.size();i++){
                if(s.indexOf(""+list.get(i))==-1 && s.indexOf(""+(-1*list.get(i)))==-1){
                    l.add(s+list.get(i));
                }
            }
        }else{
            for(int i=0;i<list.size();i++){
                if(s.indexOf(""+list.get(i))==-1  && s.indexOf(""+(-1*list.get(i)))==-1){
                    check(c+1,n,s+list.get(i)+" ",list);
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(i);
            list.add(-1*i);
        }
        String s="";
        for(int i=0;i<list.size();i++){
            check(2,n,s+list.get(i)+" ",list);
        }
        System.out.println(l.size());
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }
    }
}
