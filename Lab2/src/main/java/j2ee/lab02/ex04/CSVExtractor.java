package j2ee.lab02.ex04;

import java.util.Arrays;
import java.util.Scanner;

public class CSVExtractor {
	public static double[] splitString(String str)
	{
		String[] words = str.split(",");
		double[] ret = Arrays.stream(words).mapToDouble(Double::parseDouble).toArray();
		return ret;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a double array seperated by comma: ");
		String str = sc.next();
		System.out.println(Arrays.toString(splitString(str)));
	}
}
