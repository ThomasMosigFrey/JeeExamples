package org.jboss.as.quickstarts.loggingToolsQS.messages;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageBundleTranslator", date = "2023-06-25T14:38:03+0200")
public class GreetingMessagesBundle_$bundle_sv_SE extends GreetingMessagesBundle_$bundle_sv implements GreetingMessagesBundle, Serializable {
    private static final long serialVersionUID = 1L;
    protected GreetingMessagesBundle_$bundle_sv_SE() {
        super();
    }
    public static final GreetingMessagesBundle_$bundle_sv_SE INSTANCE = new GreetingMessagesBundle_$bundle_sv_SE();
    @Override
    protected Object readResolve() {
        return INSTANCE;
    }
    private static final Locale LOCALE = new Locale("sv", "SE");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String helloToYou$str() {
        return "Hej %s.";
    }
}
