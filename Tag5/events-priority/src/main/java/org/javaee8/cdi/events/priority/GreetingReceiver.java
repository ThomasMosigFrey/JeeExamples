package org.javaee8.cdi.events.priority;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.event.Observes;

/**
 * @author Radim Hanus
 * @author Arun Gupta
 */
@SessionScoped
public class GreetingReceiver implements EventReceiver, Serializable {

    private static final long serialVersionUID = 1L;
    
    private String greet = "Willkommen";

    /**
     * Lower priority
     * @param greet 
     */
    void receive(@Observes String greet) {
        this.greet += greet + "2";
    }

    /**
     * Higher priority
     * @param greet 
     */
    void receive2(@Observes String greet) {
        this.greet = greet + "1";
    }

    @Override
    public String getGreet() {
        return greet;
    }
}
