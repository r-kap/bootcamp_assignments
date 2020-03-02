import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Demo {
    public static void main(String[] args) {

        BasicConfigurator.configure();
        Logger log = Logger.getLogger(Demo.class.getName());
        log.info("\nHello World!\nProject without Maven sucks.");

    }
}
