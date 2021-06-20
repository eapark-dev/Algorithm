import java.text.SimpleDateFormat; 
import java.util.Date;
import java.util.Calendar;

public class TwentySixteen {
    class Solution {
        public String solution(int a, int b) {
            String answer = "";
            try
            {
                String month = Integer.toString(a);
                String day = Integer.toString(b);
        
                if(month.length() == 1) {
                    month = "0"+month;
                }
                if(day.length() == 1) {
                    day = "0"+day;
                }
                
                String sDate = "2016"+month+day;
                SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
                Date date = format.parse(sDate);
                Calendar cal = Calendar.getInstance() ;
                cal.setTime(date);    
                int num = cal.get(Calendar.DAY_OF_WEEK); 
                
                switch (num) {
                    case 1 : answer = "SUN"; 
                        break;
                    case 2 : answer = "MON"; 
                        break;
                    case 3 : answer = "TUE"; 
                        break;
                    case 4 : answer = "WED"; 
                        break;
                    case 5 : answer = "THU"; 
                        break;
                    case 6 : answer = "FRI"; 
                        break;
                    case 7 : answer = "SAT"; 
                        break;
                }
            }catch(Exception e)
            {
                e.printStackTrace();
            }     
            return answer;
        }
    }
}
