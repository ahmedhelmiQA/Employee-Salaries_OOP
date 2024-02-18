public class BasePlus_Commission extends Commission_Employee{
    int base;

    public double getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public BasePlus_Commission() {
    }

    public BasePlus_Commission(String name, int SSN, String address, String gender, int gross_sale, int commissionRate, int base) {
        super(name, SSN, address, gender, gross_sale, commissionRate);
        this.base = base;
    }

    @Override
    public void DisplayAllDetails() {
        System.out.println(super.toString());
       DisplayEarnRings();
    }
    @Override
    public void DisplayEarnRings() {
        System.out.println("Earning = " + earning());
     }

    @Override
    public int earning() {
        return base + super.earning();
    }
}
