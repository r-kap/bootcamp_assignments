import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Driver {
    public static void main(String[] args) {

        Employee e1 = new Employee("Rohit", 1, 01);
        Employee e2 = new Employee("Ishrat", 2, 01);
        e1.toString();
        e2.toString();
        BasicConfigurator.configure();
        Logger log = Logger.getLogger(Employee.class.getName());
        log.info(e1);
    }
}
