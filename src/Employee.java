
enum gender {male,fmale};
public abstract class Employee {
    String name;
    int SSN;
    String address;
    String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Employee() {
    }

    public Employee(String name, int SSN, String address, String gender) {
        this.name = name;
        this.SSN = SSN;
        this.address = address;
        this.gender= gender;
    }

    public abstract int earning();

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", SSN=" + SSN + ", address='" + address + '\'' + ", gender='" + gender + '\'' + '}';
    }
}
