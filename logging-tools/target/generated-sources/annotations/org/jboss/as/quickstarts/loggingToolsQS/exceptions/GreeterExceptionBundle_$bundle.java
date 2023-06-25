package org.jboss.as.quickstarts.loggingToolsQS.exceptions;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import java.lang.Throwable;
import java.lang.String;
import java.util.Arrays;
import org.jboss.as.quickstarts.loggingToolsQS.exceptions.LocaleInvalidException;
import java.lang.Exception;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageBundleImplementor", date = "2023-06-25T14:38:03+0200")
public class GreeterExceptionBundle_$bundle implements GreeterExceptionBundle, Serializable {
    private static final long serialVersionUID = 1L;
    protected GreeterExceptionBundle_$bundle() {}
    public static final GreeterExceptionBundle_$bundle INSTANCE = new GreeterExceptionBundle_$bundle();
    protected Object readResolve() {
        return INSTANCE;
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    protected String localeNotValid$str() {
        return "GREETER000005: Requested locale not valid: %s";
    }
    @Override
    public final org.jboss.as.quickstarts.loggingToolsQS.exceptions.LocaleInvalidException localeNotValid(final String locale) {
        final org.jboss.as.quickstarts.loggingToolsQS.exceptions.LocaleInvalidException result = new org.jboss.as.quickstarts.loggingToolsQS.exceptions.LocaleInvalidException(String.format(getLoggingLocale(), localeNotValid$str(), locale));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String thrownOnPurpose$str() {
        return "GREETER000006: This exception thrown on purpose.";
    }
    @Override
    public final Exception thrownOnPurpose(final Throwable ex) {
        final Exception result = new Exception(String.format(getLoggingLocale(), thrownOnPurpose$str()), ex);
        _copyStackTraceMinusOne(result);
        return result;
    }
}
