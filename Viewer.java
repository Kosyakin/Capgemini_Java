
package prog;


public class Viewer {

	public void View(int[] arr,int a) {
		for(int i=0;i<a;i++) {
		
			if (arr[i]<10)						
				System.out.print(" "+arr[i]+"  |");
			
			else if ((arr[i]>=10)&(arr[i]<100)) 
				System.out.print(" "+arr[i]+" |");					 			
			
			else if (arr[i]>=100&arr[i]<1000) 			
				System.out.print(""+arr[i]+" |");
			else if (arr[i]>=1000)
				System.out.print(""+arr[i]+"|");
			
			if ((i+1)%10==0) 
				System.out.println("");	
		}
		System.out.println("");	
	}
}
