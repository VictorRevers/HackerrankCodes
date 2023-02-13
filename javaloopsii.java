import java.util.*;
import java.io.*;
import java.lang.Math;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            //initing value to insert in the array
            int serieValue = 0;
            //array to save series values
            int[] seriesValues = new int[n+1];       
                                  
           for(int x=0;x<n;x++){                
                if(x == 0){
                    serieValue = (a+(int)Math.pow(2,x)*b);
                    seriesValues[x] = serieValue;
                }else{                   
                    serieValue = seriesValues[x-1] + ((int)Math.pow(2,x)*b);
                    seriesValues[x] = serieValue;                       
                }
                System.out.printf("%d ",seriesValues[x]);                                                   
            }
           System.out.println();                   
        }
        in.close();
    }
}
