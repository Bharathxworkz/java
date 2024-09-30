public class ArrayExceotion {

    static int arr[]= new int[3];

    public static void main(String[] args) {
        InputMissMatch scanner = new InputMissMatch();
      try {


          arr[0] = 1;
          arr[1] = 2;
          arr[2] = 3;
          arr[4] = 4;
      }catch (ArrayIndexOutOfBoundsException e ){
          System.out.println("Array out of index");
      }
    }
}
