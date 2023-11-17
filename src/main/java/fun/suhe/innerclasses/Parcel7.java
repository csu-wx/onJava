package fun.suhe.innerclasses;

public class Parcel7 {
    /**
     * 将返回值的生成和返回值类的定义集合
     * @return
     */
    public Contents contents(){
        return new Contents() { //匿名内部类，没有名字
            //内部类定义开始
            private int i = 11;
            @Override
            public int value() {
                return i;
            }
        };
    }

    public static void main(String[] args) {
        Parcel7 p = new Parcel7();
        Contents c = p.contents();
    }
}
