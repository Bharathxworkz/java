public class AdditionRunnner {
    public static void main(String[] args) {
        Addition addition = (a,b) ->{
            System.out.println(a+b);
        };
        addition.add(4,6);
    }
}
