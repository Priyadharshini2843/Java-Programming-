import java.util.Scanner;
    public class AttendanceTracker {
        public static void main(String[] args){
            final int DAYS=5;
            final int HOURS=8;
            int[][] attendance=new int[DAYS][HOURS];
            Scanner sc=new Scanner(System.in);
            System.out.println("Priyadharshini.M (2024503501)");
            System.out.println("Enter Attendance (1=Present or 0=Absent: )");
            for(int day=0;day<DAYS;day++){
                System.out.println("Day "+(day+1)+ ":");
                for(int hour=0;hour<HOURS;hour++){
                    System.out.println("Hour "+(hour+1)+ ":");
                    int status=sc.nextInt();
                    while(status!=1 && status!=0){
                        System.out.println("Invalid input. Enter 0 or 1: ");
                        status=sc.nextInt();
                    }
                    attendance[day][hour]=status;
                }
            }
            System.out.println("\n***Daily Attendance Percentage***");
            int totalPresent=0;
            int totalHours= DAYS*HOURS;
            for(int day=0;day<DAYS;day++){
                int dailyPresent=0;
                for(int hour=0;hour<HOURS;hour++){
                    dailyPresent+=attendance[day][hour];
                }
                totalPresent+=dailyPresent;
                double dailyPercentage=(dailyPresent/(double)HOURS)*100;
                System.out.println("Day "+(day+1)+": "+dailyPercentage+" percentage " );}
            double overallPercentage=(totalPresent/(double)totalHours)*100;

            System.out.println("Overall Weekly Attendance: "+overallPercentage+ " percentage" );
}
}
