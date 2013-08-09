import java.util.Scanner;
public class TempConvert {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int tempF, tempC;
		
		System.out.print("Enter a temperature in degrees Fahrenheit: ");
		tempF = sc.nextInt();
		tempC = (tempF + 32 ) * 5 / 9;
		
		System.out.println(tempF + " degrees Fahrenheit equals " + tempC + " degrees Celcius.");
	}

}
