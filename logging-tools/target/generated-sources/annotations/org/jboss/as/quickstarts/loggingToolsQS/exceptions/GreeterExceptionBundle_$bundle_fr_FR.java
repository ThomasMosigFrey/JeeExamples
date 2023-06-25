package org.jboss.as.quickstarts.loggingToolsQS.exceptions;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageBundleTranslator", date = "2023-06-25T14:38:03+0200")
public class GreeterExceptionBundle_$bundle_fr_FR extends GreeterExceptionBundle_$bundle_fr implements GreeterExceptionBundle, Serializable {
    private static final long serialVersionUID = 1L;
    protected GreeterExceptionBundle_$bundle_fr_FR() {
        super();
    }
    public static final GreeterExceptionBundle_$bundle_fr_FR INSTANCE = new GreeterExceptionBundle_$bundle_fr_FR();
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
    protected String localeNotValid$str() {
        return "GREETER000005: La locale demandée n'est pas valide: %s";
    }
    @Override
    protected String thrownOnPurpose$str() {
        return "GREETER000006: Cette Exception est levée volotairement.";
    }
}
