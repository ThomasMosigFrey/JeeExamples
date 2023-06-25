package org.jboss.as.quickstarts.loggingToolsQS.loggers;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2023-06-25T14:38:03+0200")
public class GreeterLogger_$logger_de_DE extends GreeterLogger_$logger_de implements GreeterLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public GreeterLogger_$logger_de_DE(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMANY;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String logHelloMessageSent$str() {
        return "GREETER000001: Hallo Nachricht gesendet.";
    }
    @Override
    protected String logHelloMessageSentForLocale$str() {
        return "GREETER000002: Hallo gesendete Nachricht für locale: %s.";
    }
}
