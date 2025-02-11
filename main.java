import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
public class Main
{
	public static void main(String[] args) {
		  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
        System.out.println("Current Date and Time: " + dtf.format(now));  
	}
}

//comment to test the code.