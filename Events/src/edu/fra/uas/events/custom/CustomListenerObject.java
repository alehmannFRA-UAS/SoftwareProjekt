package edu.fra.uas.events.custom;

public class CustomListenerObject implements CustomEventListener {

    @Override
    public void notify(CustomEvent event) {
        System.out.println(this.toString() + " notifies event: " + event);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

}
