public class FindMaxMin {
    public static void main(String args[]){
        int num[] = {7,1,2,3,4,9,6};
        int max=num[0];
        int min=num[0];
        for (int i=0;i< num.length;i++){

            //System.out.print(num[i]);
            if(num[i]>max){
                max=num[i];
            }
            if (num[i]<min){
                min=num[i];
            }
        }
        System.out.println("Maximum number is " + max);
        System.out.println("Minimum number is " + min);
    }
}
