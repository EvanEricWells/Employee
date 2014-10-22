package employee;

/**
 *
 * @author evan5090
 */
public class Employee {

    private String name;
    private int type;
    private double rate;
    private int hours;

    public Employee() {
        name = "";
        type = 0;
        rate = 0;
        hours = 0;
    }

    public String getTypeRules() {
        return "1 or 2";
    }

    public String getNameRules() {
        return "nonBlank";
    }

    public String getRateRules() {
        return "between 6.75 and 30.50, inclusive";
    }

    public String getHourRules() {
        return "between 1 and 60, inclusive";
    }

    public boolean setName(String nm) {
        boolean blank = (nm.equals(""));
        if (blank) {
            return false;
        } else {
            name = nm;
            return true;
        }
    }

    public boolean setType(int tp) {
        boolean oneortwo = (tp == 1 || tp == 2);
        if (oneortwo) {
            type = tp;
            return true;
        } else {
            return false;
        }
    }

    public boolean setRate(double rt) {
        boolean rateok = (rt >= 6.75 && rt <= 30.50);
        if (rateok) {
            rate = rt;
            return true;
        } else {
            return false;
        }
    }
    public boolean setHours(int hrs){
        boolean hoursok = (hrs>=1 && hrs<=60);
        if(hoursok){
            hours=hrs;
            return true;
        }
        else return false;
    }
    public String getName(){
        return name;
    }
    public double getPay(){
        double pay;
        boolean noovertime = (hours<=40 || type==2);
        if(noovertime)pay=rate*hours;
        else pay=(hours-40)*(rate*2)+ rate*40;
        return pay;
    }
    
}