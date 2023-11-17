package fun.suhe.innerclasses.controller;

import java.util.ArrayList;
import java.util.List;

/**
 * 管理并触发事件的实际控制框架
 */
public class Controller {
    private List<Event> eventList = new ArrayList<>();
    public void addEvent(Event c) {
        eventList.add(c);
    }

    public void run(){
        while (eventList.size() > 0){
            for (Event e :
                    new ArrayList<>(eventList)) {
                if (e.ready()){
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }
            }
        }
    }

}
