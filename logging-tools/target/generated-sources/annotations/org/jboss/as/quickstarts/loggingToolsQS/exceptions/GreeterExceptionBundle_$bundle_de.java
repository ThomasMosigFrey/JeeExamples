package org.jboss.as.quickstarts.loggingToolsQS.exceptions;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageBundleTranslator", date = "2023-06-25T14:38:03+0200")
public class GreeterExceptionBundle_$bundle_de extends GreeterExceptionBundle_$bundle implements GreeterExceptionBundle, Serializable {
    private static final long serialVersionUID = 1L;
    protected GreeterExceptionBundle_$bundle_de() {
        super();
    }
    public static final GreeterExceptionBundle_$bundle_de INSTANCE = new GreeterExceptionBundle_$bundle_de();
    @Override
    protected Object readResolve() {
        return INSTANCE;
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
}
