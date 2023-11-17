package fun.suhe.innerclasses;
/**
 * 取得一个指向基类或者接口的引用时
 * 无法找出它确切的类型
 */
interface Destination{
    String readLabel();
}
interface Contents{
    int value();
}
class Parcel4 {
    //仅Parcel4可以访问
    private class PContents implements Contents {
        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }
    protected final class PDestination implements Destination {
        private String label;
        private PDestination(String whereTo){
            label = whereTo;
        }

        @Override
        public String readLabel() {
            return label;
        }
    }
    public Destination destination(String s){
        return new PDestination(s);
    }
    public Contents contents(){
        return new PContents();
    }
}
public class TestParcel {
    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        Contents c = p.contents();
        Destination d = p.destination("Tasmania");
    }
}
