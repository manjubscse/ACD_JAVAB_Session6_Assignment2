
import java.util.Scanner;

public class UserException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating Scanner object

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the age");
		// initialize age variable to get Integer value from user
		
		int age = s.nextInt();

		s.close();// closing Scanner object

		// checking if age is less than zero
		if (age < 0) {

			// using User defined Exception

			try {

				// using throw keyword

				throw new NegativeAgeException("Age should not be less than Zero");
			}

			catch (NegativeAgeException e) {
				//Displays message passed to exception as above
				System.out.println(e);

			}
		} else {
			// prints age
			System.out.println("Age is: " + age);

		}

	}

}
