public class OperationaddRunner {
    public static void main(String[] args) {
        int a[]={4,5,6,7,8};
     OperationAdd operationAdd   = array ->{
            for (int value:array){
                if (value%2 != 0){
                    System.out.println(value);
                }
            }
        };
     operationAdd.add(a);
    }
}
