package prog;

import java.util.Scanner;
import java.util.Random;

public class arr_creator {
	Random rand=new Random();
	Viewer v1=new Viewer();
	
	//Вопрос
	public int Task(){
		System.out.println("\nВведите количество элементов массива(не менее 10):");
		Scanner in=new Scanner(System.in);
		try {
		int a=in.nextInt();
		
		if(a>10) {
		return a;
		}
		else{
			System.out.println("Введено число меньшее 10");
			return 0;
			}
		}
		catch(Exception e) {System.out.print("Введено не целочисленное число, повторите ввод");
			return 0;
		}
		
	}
	
	//Создание массива
	public int[] Creator(int a) {
		
	int[] Arr=new int[a];
		for(int i=0;i<a;i++) {
			Arr[i]=i+1;			
		}
		
		return Arr;
	}
	
	//Удаление случайного элемента
	public int[] Delete(int[] Arr,int a) {
		
		int[] arr2= new int[a-1];
		int b=rand.nextInt(a);
		if(b<a) {
			for(int i=b;i<a-1;i++) {//смещение в массиве
				Arr[i]=Arr[i+1];
			
			}
			System.out.println("\n\nn-1 массив:\n");
			for(int i=0;i<a-1;i++) {
			
				arr2[i]=Arr[i];
		
			}
		}
		v1.View(arr2,a-1);
		
		return arr2;
	}
	
	
	
	//Проверка элементов массива
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
				System.out.println("\n"+"Потерянное число:"+(j+1));
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
		System.out.println("\nПеремешанный n-1 массив:\n");
		v1.View(arr,a);
		return arr;		
	}
	
	
	
}
