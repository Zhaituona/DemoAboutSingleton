package nestedclass;

import com.sun.org.apache.bcel.internal.classfile.InnerClass;

public class OuterClass { // the reason for use innerClass is for data hiding , implement hiding .

    public String className ;

    public void outerClassMethodA(){
        System.out.println("This is outer class method A");
        InnerClassA innerA = new InnerClassA();
        innerA.innerClassAMethodA();
        InnerClassA.innerClassAMethodA();
        InnerClassA.InnerClassB  innerB = new InnerClassA.InnerClassB();
        innerB.innerClassBMethodB();

    }

    public static class InnerClassA {

        public static void innerClassAMethodA(){// inside the inner class we cannot

            System.out.println("This is inner ClassA method A");
           // Public InnerClassB B = new InnerClassB();  THIS IS NOT ALLOWED
        }

        public static class InnerClassB{

            public  void innerClassBMethodA(){

                System.out.println("This is inner classB method A");
            }

            private void innerClassBMethodB(){

                System.out.println("This is Inner class B method B");
            }

            public  class InnerClassC {

                public  void innerClassCMethodA(){

                    System.out.println("This is Inner class C method A");
                }
            }
        }
    }
}
