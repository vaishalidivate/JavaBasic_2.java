package com.company;

/** Create a class with PUBLIC fields and methods.
 Access the public methods and fields from any class in the same package or different
 package */
class PubMethod {
       public static int a=5;
        public static int b=6;

        public static int meth(int d){
           int c=a+d;
            return c;
        }
    }

//    static class Access {
//         PubMethod pm=new PubMethod();
//      pm.meth(5);
//    }
public class AccessModifiers_4 {
    public static void main(String[] args) {
        PubMethod pm=new PubMethod();
        System.out.println(pm.meth(6));
    }
}
