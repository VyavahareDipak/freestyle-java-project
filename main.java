public class Main
{
	public static void main(String[] args) {
		// Get the current date and time
LocalDateTime now = LocalDateTime.now();

// Define the format
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

// Format the current date and time
String formattedNow = now.format(formatter);

// Print the formatted date and time
System.out.println("Current Timestamp:" + formattedNow);
	}
}

//comment to test the code.