package org.jboss.as.quickstarts.loggingToolsQS.exceptions;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageBundleTranslator", date = "2023-06-25T14:38:03+0200")
public class GreeterExceptionBundle_$bundle_de_DE extends GreeterExceptionBundle_$bundle_de implements GreeterExceptionBundle, Serializable {
    private static final long serialVersionUID = 1L;
    protected GreeterExceptionBundle_$bundle_de_DE() {
        super();
    }
    public static final GreeterExceptionBundle_$bundle_de_DE INSTANCE = new GreeterExceptionBundle_$bundle_de_DE();
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
    protected String localeNotValid$str() {
        return "GREETER000005: Angeforderte Gebietsschema nicht gültig: %s";
    }
    @Override
    protected String thrownOnPurpose$str() {
        return "GREETER000006: Diese Ausnahme absichtlich geworfen.";
    }
}
