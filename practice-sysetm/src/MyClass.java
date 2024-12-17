public class MyClass implements Cloneable {
    public MyClass() {
        System.out.println("Object created using clone");

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

