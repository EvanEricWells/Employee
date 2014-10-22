package employee;

/**
 *
 * @author evan5090
 */
import TerminalIO.*;

public class PayrollInterface {

    public static void main(String[] args) {
        KeyboardReader r = new KeyboardReader();
        Employee emp = new Employee(); //employee
        String name;    //name
        int type;       //type
        double rate;    //hourly pay rate
        int hours;      //hours worked
        String Prompt;  //user prompt
        while (true) {
            //get the name and break if blank
            System.out.println("Enter Employee Data");
            name = r.readLine(" Name (or <enter> to quit): ");
            if (!(emp.setName(name))) {
                break;
            }
            //get the type until valid
            while (true) {
                Prompt = " type (" + emp.getTypeRules() + "): ";
                type = r.readInt(Prompt);
                if (emp.setType(type)) {
                    break;
                }
            }
            //get the hourly pay until valid
            while (true) {
                Prompt = " Hourly Rate (" + emp.getRateRules() + "): ";
                rate = r.readDouble(Prompt);
                if (emp.setRate(rate)) {
                    break;
                }
            }
            //get the hours worked until valid
            while (true) {
                Prompt = " Hours(" + emp.getHourRules() + "): ";
                hours = r.readInt(Prompt);
                if (emp.setHours(hours)) {
                    break;
                }
            }
            //print the name and pay
            System.out.print(" The weekly pay for ");
            System.out.print(emp.getName());
            System.out.println(" is $" + emp.getPay());
        }
    }
}
