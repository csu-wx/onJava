package fun.suhe.innerclasses.controller;

import java.time.Duration;
import java.time.Instant;

/**
 * 控制框架：以时间控制行为
 */
public abstract class Event {
    private Instant eventTime;
    protected final Duration delayTime;

    /**
     * 希望运行Event随后调用start
     * @param millisecondDelay
     */
    public Event(long millisecondDelay){
        //捕获当前对象创建时间
        delayTime=Duration.ofMillis(millisecondDelay);
        start();
    }

    /**
     * 触发事件的时间=当前时间+延迟时间
     */
    public void start(){
        eventTime = Instant.now().plus(delayTime);
    }

    /**
     * 决定何时运行action方法
     * @return boolean
     */
    public boolean ready(){
        return Instant.now().isAfter(eventTime);
    }

    /**
     * 如果要重复事件，需要在action中调用start
     */
    public abstract void action();
}
