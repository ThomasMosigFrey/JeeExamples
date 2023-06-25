package org.jboss.as.quickstarts.loggingToolsQS.loggers;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2023-06-25T14:38:03+0200")
public class GreeterLogger_$logger_sv extends GreeterLogger_$logger implements GreeterLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public GreeterLogger_$logger_sv(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("sv");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
}
