package edu.fra.uas.events.custom;

import java.util.EventListener;

public interface CustomEventListener  extends EventListener {
    
    void notify(CustomEvent evt);

}
