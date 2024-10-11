package edu.fra.uas.events.custom;

import java.util.EventObject;

public class CustomEvent extends EventObject {

    private String actionCommand;
    private long when; 

    public CustomEvent(Object source, String actionCommand, long when) {
        super(source);
        this.actionCommand = actionCommand;
        this.when = when;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() 
               + " [actionCommand=" + actionCommand + ", when=" + when + "] on " 
               + getSource().getClass().getSimpleName();
    }

}
