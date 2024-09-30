package exception;

public class PatientIdNotFoundException extends RuntimeException{

    public PatientIdNotFoundException(String erorMessage){
        System.out.println(erorMessage);

    }
}
