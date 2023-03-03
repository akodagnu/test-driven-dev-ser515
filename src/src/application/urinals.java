package application;
import java.io.*;

public class urinals {
	static int countUrinals(String s)
	{
		int c = 0;
		if(s.length()>20 || s.length()==0)
			return -1;
		for(int i=1;i<s.length()-1;i++)
		{
			if(s.charAt(i)!='0' && s.charAt(i)!='1')
				return -1;
			if(s.charAt(i)=='0' && s.charAt(i-1)=='0' && s.charAt(i+1)=='0')
				c++;
			if(s.charAt(i)=='1' && (s.charAt(i-1)=='1' ||s.charAt(i+1)=='1'))
				return -1;
		}
		return c;
	}
	
	static void usingKeyboard()
	{
		System.out.println("Not yet implemented");
	}
	
	static void usingFile() throws IOException
	{
		File file = new File(System.getProperty("user.dir")+"\\src\\urinal.dat");
		BufferedReader fileReader = new BufferedReader(new FileReader(file));
		boolean output = true;
		int counter = 1;
		File out = new File(System.getProperty("user.dir")+"\\rule.txt");
		while(output)
		{
			if(counter == 1)
			{
				if(out.exists() && !out.isDirectory())
				{
					counter++;
				}
				else
				{
					output = false;
				}
			}
			else
			{
				out = new File(System.getProperty("user.dir")+"\\rule"+Integer.toString(counter)+".txt");
				if(out.exists() && !out.isDirectory())
				{
					counter++;
				}
				else
				{
					output = false;
				}
			}
		}
		out.createNewFile();
		FileWriter writer = new FileWriter(out);
		String st;
		int count;
		//writer.write("");
		while((st=fileReader.readLine())!= null)
		{
			count = countUrinals(st);
			writer.write(Integer.toString(count)+System.lineSeparator());
		}
		writer.close();
		System.out.println("Done");
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
