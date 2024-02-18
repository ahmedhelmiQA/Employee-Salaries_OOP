public class Main {

    public static void main(String[] args) {
        Department d1 =new Department(1,"Information Systems");
        Salaried_Employee se = new Salaried_Employee("ahmed",1234,"cairo","male",5000,500,300);
        d1.add_employee(se);
        Hourly_Employee he = new Hourly_Employee("mohamed",4455,"giza", "male",200,300);
        d1.add_employee(he);
        Commission_Employee ce = new Commission_Employee("ali",6666,"banha","male",3000,400);
        d1.add_employee(ce);
       BasePlus_Commission bc = new BasePlus_Commission("hamada",33,"sheben","male",400,1,1);
       d1.add_employee(bc);
       //d1.print_All_details();
        System.out.println(d1.print_All_details());
    }
}