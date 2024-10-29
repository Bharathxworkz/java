public class OperationRunner {

    public static void main(String[] args) {
        int a[] = {4,6,7,9,5,8};
        Operation operation  = array ->{
            for (int value: array){
                if(value %2==0)
                    System.out.println(value);
            }
        };
operation.even(a);
    }


}
