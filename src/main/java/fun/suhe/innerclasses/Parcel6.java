package fun.suhe.innerclasses;

/**
 * 作用域嵌套内部类
 */
public class Parcel6 {
    private void internalTracking(boolean b){
        if (b){
            class TrackingSlip {
                private String id;
                TrackingSlip(String s) {
                    id = s;
                }
                String getSlip(){
                    return id;
                }
            }
            TrackingSlip ts = new TrackingSlip("slip");
            String s = ts.getSlip();
            System.out.println("s = " + s);
        }
        //在{}作用域外将不可访问该内部类
        //-TrackingSlip ts = new TrackingSlip("x");
    }
    public void track(){
        internalTracking(true);
    }

    public static void main(String[] args) {
        Parcel6 p = new Parcel6();
        p.track();
    }
}
