package fun.suhe.innerclasses;


public class Parcel5 {
    /**
     * 方法中创建内部类
     * @param s String
     * @return Destination
     */
    public Destination destination(String s){
        /**
         * PDestination是方法的一部分
         */
        final class PDestination implements Destination{
            private String label;
            private PDestination(String whereTo){
                label = whereTo;
            }

            @Override
            public String readLabel() {
                return label;
            }
        }
        return new PDestination(s);
    }

    public static void main(String[] args) {
        Parcel5 p = new Parcel5();
        Destination d = p.destination("Tasmania");
    }
}
