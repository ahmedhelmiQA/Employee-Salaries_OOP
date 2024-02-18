import java.util.ArrayList;

public class Department {
    int depNo;
    String depName;
    ArrayList<Employee> emplist ;

    public Department() {
    }
    public Department(int depNo, String depName) {
        this.depNo = depNo;
        this.depName = depName;
     this.emplist = new ArrayList<Employee>();
    }

    public int getDep_no() {
        return depNo;
    }

    public void setDep_no(int dep_no) {
        this.depNo = depNo;
    }

    public String getDep_name() {
        return depName;
    }

    public void setDep_name(String dep_name) {
        this.depName = dep_name;
    }

    public ArrayList<Employee> getEmplist() {
        return emplist;
    }

    public void setEmplist(ArrayList<Employee> emplist) {
        this.emplist = emplist;
    }

    public void add_employee(Employee e){
        emplist.add(e);
    }
    public void remove_employee(Employee index){
        emplist.remove(index);

    }
       public double print_basic_data(){
        for (int i=0 ; i< emplist.size();i++){
            System.out.println(emplist.get(i).getSSN() + "" + emplist.get(i).getName() + " " + emplist.get(i).getAddress() + " " + emplist.get(i).getGender() );
        }
           return 0;
       }
    public double print_All_details(){
        for (int i=0 ; i<emplist.size() ; i++){
            if (emplist.get(i) instanceof Salaried_Employee)
                ((Salaried_Employee)emplist.get(i)).DisplayAllDetails();

            if (emplist.get(i) instanceof Hourly_Employee)
                ((Hourly_Employee) emplist.get(i)).DisplayAllDetails();

            if (emplist.get(i) instanceof Commission_Employee)
               ((Commission_Employee) emplist.get(i)).DisplayAllDetails();

            if (emplist.get(i) instanceof BasePlus_Commission)
              ((BasePlus_Commission) emplist.get(i)).DisplayAllDetails();

        }
        return 0;
    }

    }
