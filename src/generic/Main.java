package generic;

public class Main {
    public static void main(String[] args) {
        TestGeneric<Integer,String> demo=new TestGeneric<>(1,"Tu");
        TestGeneric<Integer,Student> demo1=new TestGeneric<>(2,new Student("Thanh",20));
        TestGeneric<Integer,? super SubStudent> demo2=new TestGeneric<>(3,new Student());
        TestGeneric<Integer,? super SubStudent> demo3=new TestGeneric<>(4,new SubStudent());
        TestGeneric<Integer,? super SubStudent> demo4=new TestGeneric<>(5,new Object());
        TestGeneric<Integer,? super SubStudent> demo6=new TestGeneric<>(6,new Student());
//Chinh no - SubStudent + lop cha cua no - Student , Object
    }
}
