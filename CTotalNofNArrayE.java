//Write a Java program to count total number of negative elements in an array
public class CTotalNofNArrayE {
	public static void main(String[] args) {
		int i = 0, count = 0;
		int[] count_NegArr = {1,2,-3,-4,5,-6,7,-8,9};
		while(i < count_NegArr.length) 
		{
			if(count_NegArr[i] < 0) {
				count++;
			}
			i++;
		}
		System.out.println("\nThe Total Number of Negative Array Elements are : " + count);
	}
}