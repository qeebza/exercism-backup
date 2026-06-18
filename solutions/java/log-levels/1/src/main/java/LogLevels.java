public class LogLevels {
    
    public static String message(String logLine) {
        return logLine.substring(logLine.indexOf(":")+2).trim();
    }

    public static String logLevel(String logLine) {
        int endBracket = logLine.indexOf("]");
        return logLine.substring(1, endBracket).toLowerCase();
    }

    public static String reformat(String logLine) {
        String wrapLevel = "(" + logLevel(logLine) + ")";
        return message(logLine) + " " + wrapLevel;
    }
}