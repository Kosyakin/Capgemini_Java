package prog;

import java.util.Scanner;
import java.util.Random;

public class arr_creator {
	Random rand=new Random();
	Viewer v1=new Viewer();
	Scanner in=new Scanner(System.in);
	//Question to the user
	public int Task(){
		System.out.println("\nEnter the number of array elements(at least 10):");
		
		try {
		int a=in.nextInt();
		
		if(a>10) {
		return a;
		}
		else{
			System.out.println("A number less than 10 is entered");
			return 0;
			}
		}
		catch(Exception e) {System.out.print("A non-integer number was entered, repeat the input");
			return 0;
		}
		
	}
	
	//Creating an array
	public int[] Creator(int a) {
		
	int[] Arr=new int[a];
		for(int i=0;i<a;i++) {
			Arr[i]=i+1;			
		}
		
		return Arr;
	}
	
	//Deleting a random element
	public int[] Delete(int[] Arr,int a) {
		
		int[] arr2= new int[a-1];
		int b=rand.nextInt(a);
		if(b<a) {
			for(int i=b;i<a-1;i++) {//offset in the array
				Arr[i]=Arr[i+1];
			
			}
			System.out.println("\n\nn-1 array:\n");
			for(int i=0;i<a-1;i++) {
			
				arr2[i]=Arr[i];
		
			}
		}
		v1.View(arr2,a-1);
		
		return arr2;
	}
	
	
	
	//Checking array elements
	public void Finder(int[] Arr,int[] arr_first,int a) {
		boolean d;

		for(int j=0;j<a+1;j++)
		 {
			d=false;
			
			
			for(int i=0;i<a;i++)
			 {	
				if(arr_first[j]==Arr[i]) {
					d=true;
					break;
				}											
			}
			
			if (d==false) {
				System.out.println("\n"+"Lost number:"+(j+1));
				break;
			}			
		}
	}
	
	
	
	
	
	public int[] Mixer(int[] arr,int a) {
		int j,k,b;
		
		
		for(int i=0;i<10*(a);i++) {
			j=rand.nextInt(a);
			k=rand.nextInt(a);
			b=arr[j];
			arr[j]=arr[k];
			arr[k]=b;
		}
		System.out.println("\nMixed n-1 array:\n");
		v1.View(arr,a);
		return arr;		
	}
	
	
	
}
