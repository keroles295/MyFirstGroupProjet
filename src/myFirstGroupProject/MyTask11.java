package myFirstGroupProject;

public class MyTask11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program to print out duplicate elements from
		//an Array of Strings?
				String[] names= {"Pietro", "Mena", "Mariam", "Nora", "Mena", "Ibram", "Nora", "Kyrolis"};
				
				for(int i=0; i<names.length; i++) {
					for(int x=i+1; x<names.length; x++) {
						if((names[i].equals(names[x]))) {
							System.out.println(names[x]+" ");
						}
					}
				}



	}

}
