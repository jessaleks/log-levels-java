public class LogLevels {
    public enum ErrorLevels {
        ERROR("[ERROR]"),
        WARNING("[WARNING]"),
        INFO("[INFO]");

        private final String label;

        ErrorLevels(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }
    }
    public static String message(String logLine) {
        // first, remove the unnecessary whitespaces
        String strippedString = logLine.strip();

        String[] splitLogLine = logLine.split(": ");

        return splitLogLine[1];
    }

    public static String logLevel(String logLine) {
        throw new UnsupportedOperationException("Please implement the (static) LogLine.logLevel() method");
    }

    public static String reformat(String logLine) {
        throw new UnsupportedOperationException("Please implement the (static) LogLine.reformat() method");
    }
}
