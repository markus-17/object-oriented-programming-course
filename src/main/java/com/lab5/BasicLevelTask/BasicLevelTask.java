package BasicLevelTask;

import java.lang.reflect.Field;

class A { public String a = "a"; }

class B extends A { public String b = "b"; }

class C extends B { public String c = "c"; }

class D extends C { public String d = "d"; }

class E extends D { public String e = "e"; }

class F extends E { public String f = "f"; }

class G extends F { public String g = "g"; }

class H extends G { public String h = "h"; }

class I extends H { public String i = "i"; }

class J extends I { public String j = "j"; }

public class BasicLevelTask {
    public static void main(String[] args) throws IllegalAccessException{
        A arr[] = { new A(), new B(), new C(), new D(), new E(), new F(), new G(), new H(), new I(), new J() };

        for(A obj : arr) {
            Class<?> cls = obj.getClass();
            for(Field field : cls.getFields()) {
                System.out.print(cls.getName() + '.' + field.getName() + " = " + field.get(obj) + ' ');
            }
            System.out.println();
        }
    }
}
