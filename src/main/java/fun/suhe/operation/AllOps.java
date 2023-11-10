package fun.suhe.operation;

/**
 * 所有基本类型运算符操作
 */
public class AllOps {
    public static void main(String[] args) {
        AllOps allOps = new AllOps();
//        boolean x = true,y = true;
//        allOps.boolTest(x,y);
//        char x = 'a',y = 'b';
//        allOps.charTest(x,y);
//          byte x = 1,y = 2;
//          allOps.byteTest(x,y);
          short x = 10,y = 11;
          allOps.shortTest(x,y);

    }
    void f(boolean b){

    }
    /**
     * boolean值的接收测试
     * @param x
     * @param y
     */
    void boolTest(boolean x,boolean y) {
        //关系运算符和逻辑运算符
        f(x == y);
        f(x != y);
        f(!y);
        x = x && y;
        x = x || y;
        //按位运算符
        x = x & y;
        x = x | y;
        x = x ^ y;
        x &= y;
        x |= y;
        x ^= y;
    }

    /**
     * char的接收测试
     * @param x
     * @param y
     */
    void charTest(char x,char y){
        //算数运算符
        x = (char) (x * y);
        x = (char) (x / y);
        x = (char) (x % y);
        x = (char) (x + y);
        x = (char) (x - y);
        x++;
        x--;
        x = (char) +y;
        x = (char) -y;
        //关系和逻辑运算符
        f(x > y);
        f(x >= y);
        f(x < y);
        f(x <= y);
        f(x == y);
        f(x != y);

        //按位运算符
        x = (char) ~y;
        x = (char) (x & y);
        x = (char) (x | y);
        x = (char) (x ^ y);
        x = (char) (x << 1);
        x = (char) (x >> 1);
        x = (char) (x >>> 1);

        //联合赋值
        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;
        x <<= 1;
        x >>= 1;
        x >>>= 1;
        x &= y;
        x ^= y;
        x |= y;
        //类型转换
        byte b = (byte) x;
        short s = (short) x;
        int i = (int) x;
        long l = (long) x;
        float f = (float) x;
        double d = (double) x;

    }

    /**
     * byte的接收测试
     * @param x
     * @param y
     */
    void byteTest(byte x,byte y){
        //算数运算符
        x =(byte) (x * y);
        x = (byte) (x / y);
        x = (byte) (x % y);
        x = (byte) (x + y);
        x = (byte) (x - y);
        x++;
        x--;
        x = (byte) +y;
        x = (byte) -y;
        //关系和逻辑运算符
        f(x > y);
        f(x >= y);
        f(x < y);
        f(x <= y);
        f(x == y);
        f(x != y);
        //按位运算符
        x = (byte) ~y; // y = -(y+1)
        x = (byte) (x & y);
        x = (byte) (x | y);
        x = (byte) (x ^ y);
        x = (byte) (x << 1);
        x = (byte) (x >> 1);
        x = (byte) (x >>> 1);
        //联合赋值
        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;
        x <<= 1;
        x >>= 1;
        x >>>= 1;
        x &= y;
        x |= y;
        x ^= y;
        //类型转换
        char c = (char) x;
        short s = (short) x;
        int i = (int) x;
        long l = (long) x;
        float f = (float) x;
        double d = (double) x;

    }

    /**
     * short的接收测试
     * @param x
     * @param y
     */
    void shortTest(short x, short y) {
        //算数运算符
        x = (short) (x * y);
        x =(short) (x * y);
        x = (short) (x / y);
        x = (short) (x % y);
        x = (short) (x + y);
        x = (short) (x - y);
        x++;
        x--;
        x = (short) +y;
        x = (short) -y;
        //关系和逻辑运算符
        f(x > y);
        f(x >= y);
        f(x < y);
        f(x <= y);
        f(x == y);
        f(x != y);
        //按位运算符
        x = (short) ~y;
        x = (short) (x & y);
        x = (short) (x | y);
        x = (short) (x ^ y);
        x = (short) (x << 1);
        x = (short) (x >> 1);
        x = (short) (x >>> 1);
        //联合赋值
        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;
        x <<= 1;
        x >>= 1;
        x >>>= 1;
        x &= y;
        x |= y;
        x ^= y;
        //类型转换
        char c = (char) x;
        byte b = (byte) x;
        int i = (int) x;
        long l = (long) x;
        float f = (float) x;
        double d = (double) x;
    }

    /**
     * int的接收测试
     * @param x
     * @param y
     */
    void intTest(int x,int y) {
        x = x * y;
          //两个大的 int 型整数相乘时，结果有可能超出 int 型的范围，这种情况下结果会发生溢出
        x = x / y;
        x = x % y;
        x = x + y;
        x = x - y;
        x++;
        x--;
        x += y;
        x -= y;
        //关系和逻辑运算符
        f(x > y);
        f(x < y);
        f(x >= y);
        f(x <= y);
        f(x == y);
        f(x != y);
        x = ~y;
        x = x & y;
        x = x | y;
        x = x ^ y;
        x = x << 1;
        x = x >> 1;
        x = x >>> 1;
        //联合赋值
        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;
        x <<= 1;
        x >>= 1;
        x >>>= 1;
        x &= y;
        x |= y;
        x ^= y;
        //类型转换
        char c = (char)  x;
        byte b = (byte) x;
        short s = (short) x;
        long l = (long) x;
        float f = (float) x;
        double d = (double) x;
    }

    /**
     * long 的接收测试
     * @param x
     * @param y
     */
    void longTest(long x,long y) {
        // 算数运算符：
        x = x * y;
        x = x / y;
        x = x % y;
        x = x + y;
        x = x - y;
        x++;
        x--;
        x = +y;
        x = -y;
        // 关系和逻辑运算符：
        f(x > y);
        f(x < y);
        f(x >= y);
        f(x <= y);
        f(x == y);
        f(x != y);
        //按位运算符
        x = ~y;
        x = x & y;
        x = x | y;
        x = x ^ y;
        x = x << 1;
        x = x >> 1;
        x = x >>> 1;
        //联合赋值
        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;
        x <<= 1;
        x >>= 1;
        x >>>= 1;
        x &= y;
        x |= y;
        x ^= y;
        //类型转换
        char c = (char)  x;
        byte b = (byte) x;
        short s = (short) x;
        int i = (int) x;
        float f = (float) x;
        double d = (double) x;

    }

    /**
     * float 的接收测试
     * @param x
     * @param y
     */
    void floatTest(float x,float y){
        // 算数运算符：
        x = x * y;
        x = x / y;
        x = x % y;
        x = x + y;
        x = x - y;
        x++;
        x--;
        x = +y;
        x = -y;
        // 关系和逻辑运算符：
        f(x > y);
        f(x < y);
        f(x >= y);
        f(x <= y);
        f(x == y);
        f(x != y);
        //联合赋值
        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;
        //类型转换
        char c = (char)  x;
        byte b = (byte) x;
        short s = (short) x;
        int i = (int) x;
        long l = (long) x;
        double d = (double) x;
    }

    /**
     * double 的接收测试
     * @param x
     * @param y
     */
    void doubleTest(double x,double y) {
        // 算数运算符：
        x = x * y;
        x = x / y;
        x = x % y;
        x = x + y;
        x = x - y;
        x++;
        x--;
        x = +y;
        x = -y;
        // 关系和逻辑运算符：
        f(x > y);
        f(x < y);
        f(x >= y);
        f(x <= y);
        f(x == y);
        f(x != y);
        //联合赋值
        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;
        //类型转换
        char c = (char)  x;
        byte b = (byte) x;
        short s = (short) x;
        int i = (int) x;
        long l = (long) x;
        float f = (float) x;
    }
}
