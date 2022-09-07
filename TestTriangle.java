import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestTriangle {
	public static void main(String[] args) throws FileNotFoundException {
		
		
		File file=new File("sides.txt");
		Scanner s1=new Scanner(file);
		
		int[] side= new int[3];
		int position = 0;
		for(int i=0; i<=position;i++) {
			s1.hasNextInt();
			side[i++]=s1.nextInt();
		}
		
		try {
			Triangle t1= new Triangle(side[0],side[1],side[2]);
		}
		
		catch(IllegalTriangleException e) {
			System.out.print(e);
		}
		
		
		
	}

}
