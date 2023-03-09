import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
		
		NumberFormat usF = NumberFormat.getCurrencyInstance(Locale.US);	
		NumberFormat inF = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
		NumberFormat chF = NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat frF = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + usF.format(payment));
		System.out.println("India: " + inF.format(payment));
		System.out.println("China: " + chF.format(payment));
		System.out.println("France: " + frF.format(payment));
    }
}