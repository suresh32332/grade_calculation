import java.util.Scanner;

public class Grade {
    public static void main(String [] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Your Name : ");
            String userName= sc.nextLine();
            if(userName.isEmpty()){
                System.out.println("Invalid Name");
            }
            else{
            System.out.println("Number of Subject : ");
            int numberOfSubject=sc.nextInt();
             int  total = 0;
            if(numberOfSubject>0)
            {
            for(int i=1; i<=numberOfSubject; i++){
                 System.out.println("Enter you Subject Marks : " + i);
                 int mark = sc.nextInt();
                 total += mark;
            }
         Double totalPercetage =(double) (total /( numberOfSubject*100.0)) * 100; 
         String grade;
         if(totalPercetage > 90){
            grade ="A";
         }
         else if (totalPercetage > 80){
            grade ="B";
         }
         else if(totalPercetage > 70){
            grade ="C";
         }
         else if(totalPercetage > 60){
            grade ="D";
         }
          else if(totalPercetage > 50){
            grade ="P";
         }
          else {
            grade ="F";
         }
         //all details print 
         System.out.println("Name : " + userName );
         System.out.println("Total Marks : " + total );
         System.out.println("Percetage: " + totalPercetage+"%" );
         System.out.println("grade: " + grade );
        }
         else{
                System.out.println("Invalid try again!");
            }
        }
        sc.close();
    }

}
