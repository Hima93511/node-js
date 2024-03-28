import java.time.*;

class HelloWorld {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        
        int dd = date.getDayOfMonth();
        int mm = date.getMonthValue();
        int yyyy = date.getYear();
        
        System.out.printf("%d-%d-%d\n", dd, mm, yyyy);
        
        int h = time.getHour();
        int m = time.getMinute();
        int s = time.getSecond();
        int n = time.getNano();
        
        System.out.printf("%d:%d:%d:%d\n", h, m, s, n);
    }
}
# the code is written by himanshu garg 
