//Write a Java program to count total number of notes in given amount
import java.io.Scanner;
class NotesinGA
{
	public static void main(String args[])throws IOException
	{
		// create object of buffer class.
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		// The Rsominations in an array
		int Rs[]={1000,500,100,50,20,10,5,2,1}; 
		
		// enter the amount you want.
		System.out.print("Enter any Amount : "); 
		
		// to store amount.
		int amount=Integer.parseInt(br.readLine());
 
		// create copy of the amount
		int copy=amount; 
		int totalNotes=0,count=0;
 
		System.out.println("\nRs OMINATIONS : \n");
 
		// check for notes.
		for(int i=0;i<9;i++) 
		{
			// count number of notes.
			count=amount/Rs[i]; 
			if(count!=0) 
			{
				System.out.println(Rs[i]+"\tx\t"+count+"\t= "+Rs[i]*count);
			}
			totalNotes=totalNotes+count; //finding the total number of notes
			amount=amount%Rs[i]; //finding the remaining amount whose Rsomination is to be found
		}
 
		System.out.println("--------------------------------");
		
		// printing the total amount
		System.out.println("TOTAL\t\t\t= "+copy); 
		System.out.println("--------------------------------");
		
		// printing the total number of notes
		System.out.println("Total Number of Notes\t= "+totalNotes); 
	}
}