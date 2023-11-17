package fun.suhe.innerclasses;

import java.util.Arrays;

/**
 * 内部类对外围类所有元素有访问权
 * (迭代器模式)
 */
interface Selector {
    /**
     * 检查序列是否到末尾
     * @return boolean
     */
    boolean end();

    /**
     * 访问当前对象
     * @return 当前对象的引用
     */
    Object current();

    /**
     * 移动到当前序列的下一个对象
     */
    void next();
}

public class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length)
            items[next++] = x;
    }

    /**
     * 按自己的方式实现Selector
     */
    private class SequenceSelector implements Selector {
        private int i = 0;

        @Override
        public boolean end() {
            //items --外围类Sequence的字段
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i < items.length)
                i++;
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.selector();
        /**
         * 使用selector在序列中移动和选择元素
         */
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();

        }
    }
}
