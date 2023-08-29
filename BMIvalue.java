import java.util.Scanner;
public class BMIvalue{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int count=0;
		while(count<100) {
			count=count+1;
			System.out.println("student height in inches:");
			int inches= input.nextInt();
			
			System.out.println("student weight in pounds:");
			int pounds= input.nextInt();
			
			//converting
			
			float meters=inches*0.025f;
			float kg=pounds*0.45f;
			
			System.out.println("student height in meters:" + meters);
			System.out.println("student weight in kg:" + kg);
			
			float BMI= kg/(meters*meters);
			
			if(BMI<18.5) {
				System.out.println("under weight=" + BMI);
			}
			else if (18.5<=24.9) {
				System.out.println("normal=" + BMI);
			}
			else if (25<=29.9) {
				System.out.println("overweight=" + BMI);
			}
			else {
				System.out.println("non=" + BMI);
			}
		}
	}
}
		