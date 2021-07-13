package prog;


public class Program
{

	public static void main(String[] args) 
	{		
		arr_creator arr1_cr=new arr_creator();
		int a=0;
		while(a==0) {
		a=arr1_cr.Task();
		}
		int n=a-1;
		int[] arr= new int[a];
		int[] arr2= new int[n];
		
		arr=arr1_cr.Creator(a);
		arr1_cr.v1.View(arr, a);
		
		arr2=arr1_cr.Delete(arr, a);
		arr2=arr1_cr.Mixer(arr2,n);
	
		
		
		arr1_cr.Finder(arr2,arr1_cr.Creator(a), n);
		
		
	}
		
		
	
	
}

