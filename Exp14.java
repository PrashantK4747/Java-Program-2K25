import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;
import java.util.LinkedList;



public class Exp14 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList<String> linkedList=new LinkedList<String>();
		File file=new File("abc.txt");
		FileReader fileReader=new FileReader(file);
		BufferedReader bufferedReader=new BufferedReader(fileReader);
		String string="";
		while((string=bufferedReader.readLine())!=null)
		{
			linkedList.add(string);
			string="";
		}
		System.out.println("Contents of LinkedList is="+linkedList);
		System.out.println("Contents after descending order");
		Iterator<String> iterator=linkedList.descendingIterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}

}
