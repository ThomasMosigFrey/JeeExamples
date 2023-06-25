package org.jboss.as.quickstarts.loggingToolsQS.exceptions;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageBundleTranslator", date = "2023-06-25T14:38:03+0200")
public class DateExceptionsBundle_$bundle_de_DE extends DateExceptionsBundle_$bundle_de implements DateExceptionsBundle, Serializable {
    private static final long serialVersionUID = 1L;
    protected DateExceptionsBundle_$bundle_de_DE() {
        super();
    }
    public static final DateExceptionsBundle_$bundle_de_DE INSTANCE = new DateExceptionsBundle_$bundle_de_DE();
    @Override
    protected Object readResolve() {
        return INSTANCE;
    }
    private static final Locale LOCALE = Locale.GERMANY;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String targetDateStringDidntParse$str() {
        return "GRTDATES000007: Das Datum, das Sie mir geschickt ist nicht gültig, '%s'. Entschuldigung.";
    }
}
