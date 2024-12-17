public class Mainn {
    public static void main(String[] args) throws CloneNotSupportedException {
        MyClass original = new MyClass();
        MyClass cloned = (MyClass) original.clone();
    }
}