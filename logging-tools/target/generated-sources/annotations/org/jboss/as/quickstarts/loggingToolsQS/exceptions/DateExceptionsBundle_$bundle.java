package org.jboss.as.quickstarts.loggingToolsQS.exceptions;

import java.util.Locale;
import java.time.format.DateTimeParseException;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import java.lang.String;
import java.util.Arrays;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageBundleImplementor", date = "2023-06-25T14:38:03+0200")
public class DateExceptionsBundle_$bundle implements DateExceptionsBundle, Serializable {
    private static final long serialVersionUID = 1L;
    protected DateExceptionsBundle_$bundle() {}
    public static final DateExceptionsBundle_$bundle INSTANCE = new DateExceptionsBundle_$bundle();
    protected Object readResolve() {
        return INSTANCE;
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    protected String targetDateStringDidntParse$str() {
        return "GRTDATES000007: The date you sent me isn't valid, '%s'.  Sorry.";
    }
    @Override
    public final DateTimeParseException targetDateStringDidntParse(final String dateString, final String parsedData, final int errorOffset) {
        final DateTimeParseException result = new DateTimeParseException(String.format(getLoggingLocale(), targetDateStringDidntParse$str(), dateString), parsedData, errorOffset);
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
}
