package application;
import java.io.*;

public class urinals {
	
	boolean goodString(String str)
	{
		System.out.println("Not yet implemented");
		return true;
	}
	
	static void usingKeyboard()
	{
		System.out.println("Not yet implemented");
	}
	
	static void usingFile() throws IOException
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the file path:");
		String filePath = reader.readLine();
		File file = new File(filePath);
		BufferedReader fileReader = new BufferedReader(new FileReader(file));
		//String st;
		//while((st=fileReader.readLine())!= null)
		
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Welcome!");
		System.out.println("Let us figure out how many urinals are free");
		System.out.println("How would you like to give the inputs?");
		System.out.println("Enter 1 for using keyboard");
		System.out.println("Enter 2 for using a file");
		int choice = Integer.parseInt(br.readLine());
		switch(choice)
		{
		case 1: usingKeyboard();break;
		case 2: usingFile();break;
		default: System.out.println("Invalid choice");break;
		}

	}
}
