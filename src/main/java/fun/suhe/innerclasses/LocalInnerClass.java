package fun.suhe.innerclasses;

import java.util.Arrays;

interface Counter{
    int next();
}

/**
 * 局部内部类
 */
public class LocalInnerClass {
    private int count = 0;
    Counter getCounter(final String name){
        class LocalCounter implements Counter{
            LocalCounter(){
                System.out.println("LocalCounter");
            }

            @Override
            public int next() {
                System.out.println(name);
                return count++;
            }
        }
        return new LocalCounter();
    }

    /**
     * 匿名内部类
     * @param name
     * @return
     */
    Counter getCounter2(final String name){
        {
            System.out.println("Counter()" );
        }
        return new Counter() {
            @Override
            public int next() {
                System.out.println(name);
                return count++;
            }
        };
    }

    public static void main(String[] args) {
        LocalInnerClass lic = new LocalInnerClass();
        Counter c1 = lic.getCounter("Local inner"),
                c2 = lic.getCounter2("Anonymous inner");
        for (int i = 0; i < 5; i++) {
            System.out.println(c1.next());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(c2.next());
        }
    }
}
