package fun.suhe.innerclasses;

public class Parcel7b {
    class MyContents implements Contents {
        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }
    public Contents contents(){
        //匿名内部类的展开写法
        return new MyContents();
    }

    public static void main(String[] args) {
        Parcel7b p  = new Parcel7b();
        Contents c = p.contents();
    }
}
