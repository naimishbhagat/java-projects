sealed class A permits B,C, D{

}

non-sealed class B extends A{

}
non-sealed class C extends A{

}
non-sealed class D extends A{

}
public class SealedClass {
    public static void main(String args[]){

    }
}
