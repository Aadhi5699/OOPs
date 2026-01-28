public class Logger {
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}

public class Printer extends Logger {  
    public void print(String text) {
        log("Printing: " + text);
        System.out.println(text);
    }
}
