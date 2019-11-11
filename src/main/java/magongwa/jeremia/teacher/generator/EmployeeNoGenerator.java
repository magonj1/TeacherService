package magongwa.jeremia.teacher.generator;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class EmployeeNoGenerator {

	
		
		public static String  getEmployeeNo(String schoolId,String province,int count)
		{
			Calendar date = new GregorianCalendar(2012, 9, 5);
			int year = date.get(Calendar.YEAR); 
		    int newCount = count + 1;
		    
			String empNo = year+province+String.format("%05d", newCount)+"T";
		    return empNo;
		}
		

	
	
}
