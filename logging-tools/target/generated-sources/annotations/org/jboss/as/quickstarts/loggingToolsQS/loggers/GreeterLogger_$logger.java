package org.jboss.as.quickstarts.loggingToolsQS.loggers;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import java.lang.String;
import org.jboss.logging.Logger;


import static org.jboss.logging.Logger.Level.INFO;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2023-06-25T14:38:03+0200")
public class GreeterLogger_$logger extends DelegatingBasicLogger implements GreeterLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = GreeterLogger_$logger.class.getName();
    public GreeterLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void logHelloMessageSent() {
        super.log.logf(FQCN, INFO, null, logHelloMessageSent$str());
    }
    protected String logHelloMessageSent$str() {
        return "GREETER000001: Hello message sent.";
    }
    @Override
    public final void logHelloMessageSentForLocale(final String locale) {
        super.log.logf(FQCN, INFO, null, logHelloMessageSentForLocale$str(), locale);
    }
    protected String logHelloMessageSentForLocale$str() {
        return "GREETER000002: Hello message sent for locale: %s.";
    }
}
