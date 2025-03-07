package aa;
import java.util.Scanner;

public class NotOrtalamasi {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int s1,s2,s3;
		
		System.out.println("Vize notunuzu giriniz : ");
		s1 = input.nextInt();
		
		System.out.println("Final notunuzu giriniz : ");
		s2= input.nextInt();
		
		
		
		double not = (s1*0.4) + (s2*0.6);
		 if (not < 60) {
			 System.out.println("Maalesef kaldınız büte girmelisiniz");
			 }
		 else {
			 System.out.println("Geçtiniz");
		 }
		 
		 System.out.println("Büt notunu giriniz :");
		 s3= input.nextInt();
		 
		 double not2 = (s1*0.4) + (s3*0.6);
		 if (not2 < 60) {
			 System.out.println("Kaldınız");
		 }
		 else {
			 System.out.println("Geçtiniz");
		 }
		
		
		 
				 
		
		
		
		
		
	

	}

}
