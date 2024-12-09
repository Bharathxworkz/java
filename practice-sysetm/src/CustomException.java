public class CustomException {

    public class PayAmountException extends RuntimeException{
        public PayAmountException(String erorMessage){

            System.out.println(erorMessage);

        }
    }
    public static void main(String[] args) {
        try {


            int a = 100;
            if (a == 10) {
                System.out.println("Customer payed bill");
            }

        }  catch (PayAmountException e){
            e.printStackTrace();
        }

    }
}
