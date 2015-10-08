import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
    public static void main(String[] args) throws IOException
    {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.print("Enter email id: ");
	    String emailId = br.readLine();

	    Document doc = Jsoup.connect("http://www.ecs.soton.ac.uk/people/" + emailId).get();

	    System.out.println(doc.select("#uos-sia-page-title").text());
    }
}
