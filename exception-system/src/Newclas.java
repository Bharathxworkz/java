public class Newclas {


    public static void main(String[] args) {

        try {


            Class<InputMissMatch> InputMissMatch = (Class<InputMissMatch>) Class.forName("exception-system.src.InputMissMatch");
        }catch (ClassNotFoundException e)
        {
            System.out.println("No class not found");
        }
    }
}
