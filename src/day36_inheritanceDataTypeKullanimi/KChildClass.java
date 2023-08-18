package day36_inheritanceDataTypeKullanimi;

public class KChildClass extends JParentClass {

    public void method1(){
        System.out.println("child class method1");
    }


    @Override
    public void method2() {
        super.method2();
    }
}
