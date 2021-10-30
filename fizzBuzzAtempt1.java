

// outputs strings of numbers from 1 to n
// However if the string value equals a multple of 3 it get replaces with"Fizz"
// If the string is amultiple of 5 it returns Buzz
// and Finaly if the string retruns both a multiple of 5 and 3 then it returns "FizzBuzz" 
import java.util.Scanner;
public class fizzBuzzAtempt1
{


	public static void main(String[] args)
	{
		System.out.println("Greetings,\nPlease type in your interger value here:");
		Scanner scan= new Scanner(System.in);
		
		int n=scan.nextInt();
		
		String Fizz="Fizz";
		String Buzz= "Buzz";
		String FizzBuzz = "FizzBuzz";
		
		int fizzCounter=0;
		int BuzzCounter=0;
		int fizzBuzzCounter=0;
		
		for(int w = 1; w<=n; w++){
			
			if(w%3!=0 && w%5!=0){
			System.out.println(w+"\n");
			}
			
			else if(w%3==0 && w%5!=0){
				fizzCounter++;
				System.out.println("Fizz"+"\n");
				 
			}else if(w%5==0 && w%3!=0)
			{
				BuzzCounter++;
			System.out.println("Buzz"+"\n");
			
			}else if(w%3==0 && w%5==0){
				fizzBuzzCounter++;
				System.out.println("FizzBuzz"+"\n");
			}
			
			
			
		}






	}






}