package haiducgeluweek4;

/***
 * Represents the main class that contains the main method.
 *
 * @author Gelu Stefan Haiduc - haiduc.gelu@yahoo.com
 * @version 1.000 (current version number of the program)
 */
public class GeluHWeek4Homework {

    /***
     * Main method.
     * It returns nothing. It only displays information.
     *
     * @param args yes
     */
    public static void main(String[] args) {
        Employee e1 = new Employee("pop", 30, "male", "QA", "Tester", "detali inutile");

        e1.displayInformation();

        System.out.println("\n");
        System.out.println("the name is: " + e1.getName());
        System.out.println("the age is: " + e1.getAge());
        System.out.println("the sex is: " + e1.getSex());
        System.out.println("the department is: " + e1.getDepartment());
        System.out.println("the job title is: " + e1.getJobTitle());
        System.out.println("the etc is: " + e1.getEtc());

        System.out.println("\n");
        e1.updateName("vasile");
        e1.updateAge(50);
        e1.updateSex("MASCUL");
        e1.updateJobTitle("tester 2");
        e1.updateDepartment("QA+");
        e1.updateEtc("si mai multe detali inutile");
        e1.displayInformation();

        System.out.println("\n");
        e1.deleteName();
        e1.deleteAge();
        e1.deleteSex();
        e1.deleteJobTitle();
        e1.deleteDepartment();
        e1.deleteEtc();

        System.out.println("\n");
        e1.displayInformation();

        System.out.println("\n");
        Organization o1 = new Organization();

        o1.addEmployee("mihai", 20, "male", "QA", "Tester", "detali inutile");
        o1.addEmployee("alex", 22, "male", "Dev", "dev", "detali inutile");
        o1.addEmployee("alexandra", 23, "female", "Dev", "dev", "detali inutile");

        o1.organizationDetails();
        o1.employeeDetails();

        System.out.println("\n\nnames");
        o1.searchEmployeeName("mihai");

        System.out.println("\n\nages");
        o1.searchEmployeeAge(22);

        System.out.println("\n\nsexs");
        o1.searchEmployeeSex("female");

        System.out.println("\n\ndeps");
        o1.searchEmployeeDepartment("QA");

        System.out.println("\n\njobs");
        o1.searchEmployeeJobTitle("dev");

        System.out.println("\n\n\n");
        o1.updateAll(0, "vasile", 50, "MASCUL", "tester 2", "QA+", "si mai multe detali inutile");

        System.out.println("\n\n\n");
        o1.removeAll(0);
        o1.organizationDetails();
        o1.employeeDetails();
    }
}

