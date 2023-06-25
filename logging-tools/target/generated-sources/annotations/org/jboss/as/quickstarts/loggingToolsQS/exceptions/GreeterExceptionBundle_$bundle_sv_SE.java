package org.jboss.as.quickstarts.loggingToolsQS.exceptions;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageBundleTranslator", date = "2023-06-25T14:38:03+0200")
public class GreeterExceptionBundle_$bundle_sv_SE extends GreeterExceptionBundle_$bundle_sv implements GreeterExceptionBundle, Serializable {
    private static final long serialVersionUID = 1L;
    protected GreeterExceptionBundle_$bundle_sv_SE() {
        super();
    }
    public static final GreeterExceptionBundle_$bundle_sv_SE INSTANCE = new GreeterExceptionBundle_$bundle_sv_SE();
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
    protected String localeNotValid$str() {
        return "GREETER000005: Begärd språk inte giltigt: %s.";
    }
    @Override
    protected String thrownOnPurpose$str() {
        return "GREETER000006: Detta undantag kastas med flit.";
    }
}
