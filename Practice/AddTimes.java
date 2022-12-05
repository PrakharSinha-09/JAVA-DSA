import java.util.Scanner;

public class AddTimes {

	
	private static boolean isTimeValid(String time) {

		boolean result = false;
		
		String pattern1 = "(0?[0-9]|1[0-9]|2[0-3]):(0?[0-9]|[1-5][0-9]):(0?[0-9]|[1-5][0-9])";
		String pattern2 = "(0?[0-9]|1[0-9]|2[0-3]):(0?[0-9]|[1-5][0-9])";

		if (time.matches(pattern1) || time.matches(pattern2)) {
			result = true;
		}
		return result;
	}


	public static void main(String[] args) {

		Scanner input = null;
		try {
			input = new Scanner(System.in);
			System.out.println("Enter first time(24 hour) in HH:mm:ss format");
			String time1 = input.next();
			System.out.println("Enter Time in XhYmZs");
			String time2 = input.next();
			char ch[]=time2.toCharArray();
			int i=0;
			while(i!=time2.length())
			{
				if(ch[i]=='h' || ch[i]=='m' || ch[i]=='s')
				{
					ch[i]=':';
				}
				i++;
			}

			String time3=new String(ch);
			time3=time3.substring(0,time3.length()-1);
			// System.out.println(time3);

			if (isTimeValid(time1) && isTimeValid(time3)) {

				// Separating first String using delimiter ":"
				String[] firstTimeParts = time1.split(":");
		
				int hours1 = Integer.parseInt(firstTimeParts[0]);
				int minutes1 = Integer.parseInt(firstTimeParts[1]);
				int seconds1 = Integer.parseInt(firstTimeParts[2]);

				int hours2=0;
				int minutes2=0;
				int seconds2=0;
				String[] secondTimeParts = time3.split(":");

				hours2 = Integer.parseInt(secondTimeParts[0]);
				minutes2 = Integer.parseInt(secondTimeParts[1]);
				seconds2 = Integer.parseInt(secondTimeParts[2]);

				int hours = hours1 + hours2;
				int minutes = minutes1 + minutes2;
				int seconds = seconds1 + seconds2;
				

				if (seconds > 59) {
					seconds = seconds - 60;
					minutes = minutes + 1;
					if (minutes > 59) {
						minutes = minutes - 60;
						hours = hours + 1;
						if (hours > 23) {
							hours = hours - 24;
						
						}
					} else {

						if (hours > 23) {
							hours = hours - 24;
				
						}

					}
				} else {
					if (minutes > 59) {
						minutes = minutes - 60;
						hours = hours + 1;
						if (hours > 23) {
							hours = hours - 24;
							
						}
					} else {

						if (hours > 23) {
							hours = hours - 24;
						
						}

					}
				}

				String finalTime = String.valueOf(hours) + ":" + String.valueOf(minutes) + ":" + String.valueOf(seconds);
				System.out.println("New time is :\n" + finalTime);
				

			} else {
				System.out.println("Time is not valid.");
			}
		} finally {
			if (input != null) {
				input.close();
			}
		}

	}
}