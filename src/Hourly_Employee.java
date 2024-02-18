public class Hourly_Employee extends Employee implements Displayable{
    int houre_rate;
    int number_of_hour;

    public int getHoure_rate() {
        return houre_rate;
    }

    public void setHoure_rate(int houre_rate) {
        this.houre_rate = houre_rate;
    }

    public int getNumber_of_hour() {
        return number_of_hour;
    }

    public void setNumber_of_hour(int number_of_hour) {
        this.number_of_hour = number_of_hour;
    }

    public Hourly_Employee() {
    }

    public Hourly_Employee(String name, int SSN, String address, String gender, int houre_rate, int number_of_hour) {
        super(name, SSN, address,gender);
        this.houre_rate = houre_rate;
        this.number_of_hour = number_of_hour;
    }

    @Override
    public String toString() {
        return "Hourly_Employee{" + "houre_rate=" + houre_rate + ", number_of_hour=" + number_of_hour + '}';
    }
    @Override
    public void DisplayAllDetails() {
        System.out.println(super.toString());
        System.out.println(toString());
    }

    @Override
    public void DisplayEarnRings() {
        System.out.println();
    }

    @Override
    public int earning() {
        return houre_rate * number_of_hour;
    }
}
