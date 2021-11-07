package AdvancedLevelTask;

class X {
    protected String name;

    public X(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "X { x: " + this.name + " }";
    }
}

class A {
    protected String a;
    protected X x = new X("xxx");

    public A(String a) {
        this.a = a;
    }
}

class B extends A { 
    protected String b;

    public B(String a, String b) {
        super(a);
        this.b = b;
    }
}

class C extends B { 
    protected String c;
    
    public C(String a, String b, String c) {
        super(a, b);
        this.c = c;
    }
}

class D extends C { 
    protected String d;
    protected X x = new X("blablabla");

    public D(String a, String b, String c, String d) {
        super(a, b, c);
        this.d = d;
    }
}

class E extends D { 
    protected String e; 

    public E(String a, String b, String c, String d, String e) {
        super(a, b, c, d);
        this.e = e;
    }
}

class F extends E { 
    protected String f;

    public F(String a, String b, String c, String d, String e, String f) {
        super(a, b, c, d, e);
        this.f = f;
    }
}

class G extends F { 
    protected String g;

    public G(String a, String b, String c, String d, String e, String f, String g) {
        super(a, b, c, d, e, f);
        this.g = g;
    }
}

class H extends G { 
    protected String h;
    private X x = new X("1234567");

    public H(String a, String b, String c, String d, String e, String f, String g, String h) {
        super(a, b, c, d, e, f, g);
        this.h = h;
    }
}

class I extends H { 
    protected String i;

    public I(String a, String b, String c, String d, String e, String f, String g, String h, String i) {
        super(a, b, c, d, e, f, g, h);
        this.i = i;
    }
}

class J extends I { 
    protected String j;

    public J(String a, String b, String c, String d, String e, String f, String g, String h, String i, String j) {
        super(a, b, c, d, e, f, g, h, i);
        this.j = j;
    }

    @Override 
    public String toString() {
        return "J { a=" + this.a + 
                 ", b=" + this.b + 
                 ", c=" + this.c + 
                 ", d=" + this.d +
                 ", e=" + this.e +
                 ", f=" + this.f + 
                 ", g=" + this.g + 
                 ", h=" + this.h + 
                 ", i=" + this.i + 
                 ", j=" + this.j + 
                //  ", x=" + this.x +
                 "}";
    }
}

public class AdvancedLevelTask {
    public static void main(String[] args) {   
        J j = new J("a", "b", "c", "d", "e", "f", "g", "h", "i", "j");
        
        System.out.println(j);
    }
}
