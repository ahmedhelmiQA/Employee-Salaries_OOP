public class Salaried_Employee extends Employee implements Displayable{

    int salary;
    int bonus;
    int deducation;

    public Salaried_Employee() {
    }

       public Salaried_Employee(String name, int SSN, String address, String gender, int salary, int bonus, int deducation) {
        super(name, SSN, address, gender);
        this.salary = salary;
        this.bonus = bonus;
        this.deducation = deducation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getDeducation() {
        return deducation;
    }

    public void setDeducation(int deducation) {
        this.deducation = deducation;
    }
    @Override
    public int earning() {
        return (salary + bonus) - deducation;
    }

    @Override
    public String toString() {
        return "Salaried_Employee{" + "salary=" + salary + ", bonus=" + bonus + ", deducation=" + deducation + '}';
    }
    @Override
    public void DisplayAllDetails() {
        System.out.println(super.toString()+" "+toString());
       // System.out.println(toString());
           }
    @Override
    public void DisplayEarnRings() {
        System.out.println(earning());
    }


}
