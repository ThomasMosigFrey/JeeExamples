package org.jboss.as.quickstarts.loggingToolsQS.exceptions;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageBundleTranslator", date = "2023-06-25T14:38:03+0200")
public class DateExceptionsBundle_$bundle_fr_FR extends DateExceptionsBundle_$bundle_fr implements DateExceptionsBundle, Serializable {
    private static final long serialVersionUID = 1L;
    protected DateExceptionsBundle_$bundle_fr_FR() {
        super();
    }
    public static final DateExceptionsBundle_$bundle_fr_FR INSTANCE = new DateExceptionsBundle_$bundle_fr_FR();
    @Override
    protected Object readResolve() {
        return INSTANCE;
    }
    private static final Locale LOCALE = Locale.FRANCE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String targetDateStringDidntParse$str() {
        return "GRTDATES000007: La date que vous m'avez envoyée n'est pas valide, '%s'. désolé.";
    }
}
