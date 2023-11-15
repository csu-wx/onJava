package fun.suhe.interfaces.music;

/**
 * 无论Instrument是基类，抽象类，还是接口，其行为都是相同的
 */
public interface Instrument {
    //compile-time constant：
    int VALUE = 5; //static && final

    default void play(Note note){//Automatically public
        System.out.println(this + ".play()" + note);
    }
    default void adjust(){
        System.out.println("Adjusting" + this);
    }
    class Wind implements Instrument{
        @Override
        public String toString() {
            return "Wind";
        }
    }
    class Percussion implements Instrument {
        @Override
        public String toString() {
            return "Percussion";
        }
    }
    class Stringed implements Instrument{
        @Override
        public String toString() {
            return "Stringed";
        }
    }
    class Brass extends Wind{
        @Override
        public String toString() {
            return "Brass";
        }
    }
    class WoodWind extends Wind{
        @Override
        public String toString() {
            return "WoodWind";
        }
    }
    class Music5 {
        /**
         * 由参数i 并不能看出Instrument是基类、抽象类还是接口
         * @param i
         */
        static void tune(Instrument i){
            i.play(Note.MIDDLE_C);
        }
        static void tuneAll(Instrument[] e){
            for (Instrument i : e){
                tune(i);
            }
        }

        public static void main(String[] args) {
            Instrument[] orchestra = {
                    new Wind(),
                    new Percussion(),
                    new Stringed(),
                    new Brass(),
                    new WoodWind()
            };
            tuneAll(orchestra);
        }
    }
}
