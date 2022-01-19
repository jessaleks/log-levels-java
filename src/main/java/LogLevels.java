
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;

public class LogLevels {
    /**
     * All possible log severity levels
     * */
    public final List<String> severityLevels = Arrays.asList("INFO", "WARNING", "ERROR");

    public final String lastCharacter = ":";

    // LogLevels.message("[ERROR]: Invalid operation")
    //// => "Invalid operation"
    public static String message(@NotNull String logLine) {

        // Since we know what is always going to be just before the message, we can use it
        // to return what's immediately after the last character of one of the [severityLevels]
        String logMessage = logLine.substring(logLine.indexOf(":") + 1);

        return logMessage.strip();
    }

    public static String logLevel(String logLine) {
        throw new UnsupportedOperationException("Please implement the (static) LogLine.logLevel() method");
    }

    public static String reformat(String logLine) {
        throw new UnsupportedOperationException("Please implement the (static) LogLine.reformat() method");
    }
}
