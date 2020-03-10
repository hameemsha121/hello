import java.time.LocalDate;
public class TodayDate{
	public static void main(String[] args){
	LocalDate date=LocalDate.now();
	System.out.println("today's date : "+date);
	LocalTime time=LocalTime.now();
	System.out.println("current time : "+time);
}
