import java.io.*;
import java.util.*;

class Solution {
					
	static int height;
	static int breadth;			
	static int area;
		
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		height = sc.nextInt();
		sc.nextLine();
		breadth = sc.nextInt();
			
		sc.close();
			
			
			
		if(height <= 0 || breadth <=0){
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}else{
			area = breadth * height;
			System.out.println(area);
		}
							
    }
}