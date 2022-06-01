package myFirstGroupProject;

public class MyTask8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//.Write a Java Program to print the first 10 numbers of
		//Fibonacci  series.
				int num=10; int x1=0; int x2=1; int nextValue=0;
				System.out.print("The Fibonacci series are 0 1"+" ");
				for(int i=0; i<=num; i++) {
					nextValue=x1+x2;
					System.out.print(nextValue+" ");
					x1=x2;
					x2=nextValue;
					}
		

	}

}
