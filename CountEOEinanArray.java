//Write a Java program to count total number of even and odd elements in an array.
public class CountEOEinanArray{  
public static void main(String args[]){  
int a[]={1,2,3,4,5,6,7,8,9};  
System.out.println("Odd Numbers are:");  
for(int i=0;i<a.length;i++){  
if(a[i]%2!=0){  
System.out.println(a[i]);  
}  
}  
System.out.println("Even Numbers are:");  
for(int i=0;i<a.length;i++){  
if(a[i]%2==0){  
System.out.println(a[i]);  
}  
}  
}
}  