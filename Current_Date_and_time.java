
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
public class Current_Date_and_time {    
  public static void main(String[] args) {    
   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
   LocalDateTime now = LocalDateTime.now();  
   System.out.println(dtf.format(now));  
  }    
}    
