import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		String str;
		int i = 0;
		
		while(sc.hasNext()){
			str = sc.nextLine();
			i++;
			System.out.printf("%d %s %n", i, str);				
		}
				
		sc.close();
		
		
    }
}