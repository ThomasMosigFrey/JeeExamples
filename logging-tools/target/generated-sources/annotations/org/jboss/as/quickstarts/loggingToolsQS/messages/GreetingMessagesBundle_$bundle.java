package org.jboss.as.quickstarts.loggingToolsQS.messages;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import java.lang.String;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageBundleImplementor", date = "2023-06-25T14:38:03+0200")
public class GreetingMessagesBundle_$bundle implements GreetingMessagesBundle, Serializable {
    private static final long serialVersionUID = 1L;
    protected GreetingMessagesBundle_$bundle() {}
    public static final GreetingMessagesBundle_$bundle INSTANCE = new GreetingMessagesBundle_$bundle();
    protected Object readResolve() {
        return INSTANCE;
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    protected String helloToYou$str() {
        return "Hello %s.";
    }
    @Override
    public final String helloToYou(final String name) {
        return String.format(getLoggingLocale(), helloToYou$str(), name);
    }
}
