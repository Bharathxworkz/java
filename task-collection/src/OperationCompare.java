public class OperationCompare {

    interface CompareOperation {
        void compare(String[] array);
    }

    public static void main(String[] args) {
        String[] a = {"Sui", "yoo", "loo", "nkn", "ioo"};

        CompareOperation operationCompare = array -> {
            for (String value : array) {
                if (value=="Sui") {
                    System.out.println(value);
                }
            }
        };

        operationCompare.compare(a);
    }
}
