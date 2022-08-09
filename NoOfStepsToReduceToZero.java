public class NoOfStepsToReduceToZero {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(123));
    }
    public static int res = 0;
    public static int numberOfSteps(int num){

        if (num == 0){
          return res;
        }
        if (num==1){
            res++;
            return res;
        }

            if (num%2 == 0){
                res++;
                numberOfSteps(num/2);
            } else {
                res++;
                return numberOfSteps(num-1);
            }


       return res;
    }
}
