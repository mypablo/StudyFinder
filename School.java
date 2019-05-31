import java.util.Scanner;
public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String username;
		char grade;
		int id;
		
		Scanner usern = new Scanner(System.in);
		Scanner idds  = new Scanner(System.in);
		
		

			System.out.println("Insert username : ");
				String user = usern.nextLine();
		
					System.out.println("Insert a letter for grade: ");
						String grad = usern.nextLine();
		
							System.out.println("Insert id: ");
								int ids = idds.nextInt();
		
						System.out.println("Your informations input is:"+"\n" + "Username." + user + "\n " +
								"Grade."+ grad +"\n "+ "ID." + ids );
		
	}

}
