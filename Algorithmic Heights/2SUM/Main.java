import java.io.*;
import java.lang.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(), n = sc.nextInt();
        for (int i = 0; i < k; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                list.add(sc.nextInt());
            }
            int end = -1, start = 0,len=n+1;
            for(int j=0;j<n;j++){
                int s = -1 * list.get(j);
                for(int q=j+1;q<n;q++){
                    if(s == list.get(q)){
                        if((len)>(q-j+1)){
                            start = j;
                            end = q;
                            len = end-start+1;
                        }
                    }
                }
            }

            if(end!=-1){
                System.out.println((start+1) + " " + (end+1));
            }else{
                System.out.println("-1");
            }
        }
    }
}
