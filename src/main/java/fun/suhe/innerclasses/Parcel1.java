package fun.suhe.innerclasses;

/**
 * 创建局部内部类
 *
 */
public class Parcel1 {
    class Contents {
        private int i = 11;
        public int value() {return i;}
    }
    class Destination {
        private String label;
        Destination(String whereTo){
            label = whereTo;
        }
        String readLabel() {return label;}
    }

    /**
     * 在方法的作用域内
     * @param dest d
     */
    public void ship(String dest){
        Contents c = new Contents();
        Destination d = new Destination(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        Parcel1 p = new Parcel1();
        p.ship("Tasmania");
    }
}
