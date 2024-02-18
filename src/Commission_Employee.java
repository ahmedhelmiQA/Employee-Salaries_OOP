public class Commission_Employee extends Employee implements Displayable{

   int gross_sale;
    int commissionRate;

    public Commission_Employee() {
    }

    public Commission_Employee(String name, int SSN, String address,String gender, int gross_sale, int commissionRate) {
        super(name, SSN, address,gender);
       this.gross_sale = gross_sale;
      this.commissionRate = commissionRate;
    }

    @Override
    public String toString() {
        return "Commission_Employee{" + "gross_sale=" + gross_sale + ", commissionRate=" + commissionRate + '}';
    }

    @Override
    public void DisplayAllDetails() {
        System.out.println(super.toString());
        System.out.println(toString());
    }

    @Override
    public void DisplayEarnRings() {

    }

    @Override
    public int earning() {
        return gross_sale * commissionRate;
    }
}
