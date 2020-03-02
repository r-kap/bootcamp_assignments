import org.apache.log4j.Logger;

public class Greetings {
    public static void main(String[] args) {
        Logger log = Logger.getLogger(Greetings.class.getName());
        log.info("Module inside");
    }
}
