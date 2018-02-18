
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int tests=Integer.parseInt(br.readLine());



        int t = 0;

        while(t<tests){
            String line1 = br.readLine(); // to read multiple integers line
            String[] strs1 = line1.trim().split("\\s+");
            int nums = Integer.parseInt(strs1[0]);
            int weight = Integer.parseInt(strs1[1]);
            String line = br.readLine(); // to read multiple integers line
            String[] strs = line.trim().split("\\s+");
            int arr[] = new int[nums];
            int max = 0;
            int count = 0;
            int last = 0;	boolean flag = false;
            int n =0;

            for(int i = last; i < nums; i++){

                if(n<nums){
                    arr[n] = Integer.parseInt(strs[n]);
                    n++;}
                if(!flag && arr[i]<weight){
                    count = 0;
                    last = i;
                }
                else if(arr[i]>weight&& !flag){

                    count +=arr[i];
                }
                else if(arr[i]==weight&& !flag){
                    count+=arr[i];
                    max = Math.max(count, max);
                    flag = true;
                    last = i;

                }
                else if(flag && arr[i]>weight){
                    count+=arr[i];
                    max = Math.max(count, max);
                }
                else if(flag && arr[i]<weight){
                    count = 0;
                    flag = false;
                    last = i;

                }
                else if(flag && arr[i]==weight){
                    count = 0;
                    flag = false;
                    i = last;
                }
            }



            System.out.println(max);


            t++;
        }


    }
}