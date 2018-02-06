package class99;
import java.util.Scanner;
public class CountyTest {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
		
		System.out.println("County Name: ");
			String Cname1 = scanner.nextLine();
			
		System.out.println("County population: ");
			int Cpopulation1 = scanner.nextInt();
			
		System.out.println("County Year Established: ");
			int CYE1 = scanner.nextInt();
			
		System.out.println("County Land Volume: ");
			double CLV1 = scanner.nextDouble();
			
		County county1 = new County(Cname1, Cpopulation1, CYE1, CLV1);
		
		System.out.println(county1.Cname);
		
		System.out.println(county1.Cpopulation);
		
		System.out.println(county1.CYE);
		
		System.out.println(county1.CLV);
			
		
			
		}

}
