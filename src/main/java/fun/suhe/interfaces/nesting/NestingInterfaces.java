package fun.suhe.interfaces.nesting;

/**
 * 类嵌套接口（私有）
 * 接口嵌套接口（默认public）
 */
public class NestingInterfaces {
    public class BImp implements A.B {
        @Override
        public void f() {

        }
    }

    class CImp implements A.C {
        @Override
        public void f() {
        }
    }
    //嵌套接口D是private的
    class EImp implements E {
        @Override
        public void g() {
        }
    }

    class EGImp implements E.G {
        @Override
        public void f() {
        }
    }

    class EImp2 implements E {
        @Override
        public void g() {

        }
    }
    public static void main(String[] args) {
        A a = new A();
        A a2 = new A();
        a2.receiveD(a.getD());
    }

}
