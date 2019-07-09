import java.io.*;
import java.lang.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(),n = sc.nextInt();
        for(int z=0;z<k;z++){
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i=0;i<n;i++){
                int q = sc.nextInt();
                if(map.containsKey(q)){
                    int v = map.get(q);
                    map.put(q, v+1);
                }else{
                    map.put(q,1);
                }
            }
            boolean c = true;
            for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                if(entry.getValue()*2>n){
                    c = false;
                    System.out.print(entry.getKey()+" ");
                }
            }
            if(c){
                System.out.print("-1 ");
            }
        }
    }
}
