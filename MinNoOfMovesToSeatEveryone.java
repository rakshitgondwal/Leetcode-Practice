import java.util.Arrays;

public class MinNoOfMovesToSeatEveryone {
    public static void main(String[] args) {
       int[] seats = {3,1,5};
        int[] students = {2,7,4};
        System.out.println(minMovesToSeat(seats,students));
    }
    public static int minMovesToSeat(int[]seats, int[]students){
        Arrays.sort(seats);
        Arrays.sort(students);
        int sum = 0;


        for (int i = 0; i <= seats.length-1; i++) {
            if (seats[i] > students[i]){
                int differnce = seats[i] - students[i];
                sum += differnce;
            }
            if (students[i] > seats[i]){
                int differnce = students[i] - seats[i];
                sum += differnce;
            }

        }
        return sum;
    }
}
