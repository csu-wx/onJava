package fun.suhe.innerclasses;

/**
 * 多层嵌套内部类访问外围类
 */
class MNA{
    private void f(){}
    class A {
        private void g(){}
        public class B{
            void h() {
                /**
                 * 有访问f（）和g（）的权限
                 */
                g();
                f();
            }
        }
    }
}
public class MultiNestingAccess {
    public static void main(String[] args) {
        MNA mna = new MNA();
        MNA.A mnaa = mna.new A();
        MNA.A.B mnaab = mnaa.new B();
        mnaab.h();
    }
}
