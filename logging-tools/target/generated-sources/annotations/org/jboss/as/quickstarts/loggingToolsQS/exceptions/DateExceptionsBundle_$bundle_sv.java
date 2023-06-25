package org.jboss.as.quickstarts.loggingToolsQS.exceptions;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageBundleTranslator", date = "2023-06-25T14:38:03+0200")
public class DateExceptionsBundle_$bundle_sv extends DateExceptionsBundle_$bundle implements DateExceptionsBundle, Serializable {
    private static final long serialVersionUID = 1L;
    protected DateExceptionsBundle_$bundle_sv() {
        super();
    }
    public static final DateExceptionsBundle_$bundle_sv INSTANCE = new DateExceptionsBundle_$bundle_sv();
    @Override
    protected Object readResolve() {
        return INSTANCE;
    }
    private static final Locale LOCALE = new Locale("sv");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
}
