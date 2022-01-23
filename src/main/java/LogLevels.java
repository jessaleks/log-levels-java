
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

    public static @NotNull String logLevel(@NotNull String logLine) {
        String logL = logLine.substring(0, logLine.indexOf("]"));

        return logL
                .replace("[", "")
                .toLowerCase();
    }

    public static @NotNull String reformat(@NotNull String logLine) {
        return String.format("%s (%s)", message(logLine), logLevel(logLine));
    }
}
