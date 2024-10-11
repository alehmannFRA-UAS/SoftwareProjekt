package edu.fra.uas.events.custom;

import java.util.ArrayList;

public class CustomEventSource {

    // Container for subscribed listeners
    ArrayList<CustomEventListener> listenerList = new ArrayList<>();    
        
    // add listeners
    public void addListener(CustomEventListener cle) {
        listenerList.add(cle);        
    }

    // remove listeners
    public void removeListener(CustomEventListener cle) {
        listenerList.remove(cle);
    }

    // Fire event notifications to CustomEventListeners.
    public void update() {
        CustomEvent customEvent = new CustomEvent(this, "event", System.currentTimeMillis());
        System.out.println(
            "Update " 
            + customEvent.getSource().getClass().getSimpleName() 
            + "!\n" 
            + customEvent.toString()
        );
        // Notify all listeners about the event
        // by calling the notify method of each listener                
        for(CustomEventListener obj : listenerList) {
                obj.notify(customEvent);
        }
    }

}
