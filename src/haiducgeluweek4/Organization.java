package haiducgeluweek4;

/***
 * Represents an Organization.
 * This Organization manages an Employee. (creating, updating, removing and searching)
 *
 * @author Gelu Stefan Haiduc - haiduc.gelu@yahoo.com
 * @version 1.000 (current version number of the program)
 */
public class Organization {
    int id;

    Employee[] organization;

    Organization() {
        this.organization = new Employee[10];
        this.id = 0;
    }

    /***
     * Adds an employee to the organization.
     * It returns nothing. It adds an Employee.
     *
     * @param name The employee’s name.
     * @param age The employee’s age.
     * @param sex The employee’s sex.
     * @param department The employee’s department.
     * @param jobTitle The employee’s job title.
     * @param etc The employee’s other information.
     */
    void addEmployee(String name, int age, String sex, String department, String jobTitle, String etc) {
        this.organization[id] = new Employee(name, age, sex, department, jobTitle, etc);
        this.id++;
    }

    /***
     * Prints the organization details.
     * It returns nothing. It only prints.
     */
    void organizationDetails() {
        System.out.println("Total number of employees: " + this.id);
    }

    /***
     * Prints the employee details.
     * It returns nothing. It only prints.
     */
    void employeeDetails() {
        for (int i = 0; i < this.id; i++) {
            System.out.print(i + " ");
            this.organization[i].displayInformation();
        }
    }

    /***
     * It searches an employee by name.
     * It returns nothing. It only prints.
     *
     * @param nameSearch The name by witch to search.
     */
    void searchEmployeeName(String nameSearch) {
        for (int i = 0; i < this.id; i++) {
            if (this.organization[i].getName().equals(nameSearch)) {
                this.organization[i].displayInformation();
            } else continue;
        }
    }

    /***
     * It searches an employee by age.
     * It returns nothing. It only prints.
     *
     * @param ageSearch The age by witch to search.
     */
    void searchEmployeeAge(int ageSearch) {
        for (int i = 0; i < this.id; i++) {
            if (this.organization[i].getAge() == ageSearch) {
                this.organization[i].displayInformation();
            } else continue;
        }
    }

    /***
     * It searches an employee by sex.
     * It returns nothing. It only prints.
     *
     * @param sexSearch The sex by witch to search.
     */
    void searchEmployeeSex(String sexSearch) {
        for (int i = 0; i < this.id; i++) {
            if (this.organization[i].getSex().equals(sexSearch)) {
                this.organization[i].displayInformation();
            } else continue;
        }
    }

    /***
     * It searches an employee by department.
     * It returns nothing. It only prints.
     *
     * @param departmentSearch The department by witch to search.
     */
    void searchEmployeeDepartment(String departmentSearch) {
        for (int i = 0; i < this.id; i++) {
            if (this.organization[i].getDepartment().equals(departmentSearch)) {
                this.organization[i].displayInformation();
            } else continue;
        }
    }

    /***
     * It searches an employee by job title.
     * It returns nothing. It only prints.
     *
     * @param jobTitleSearch The job title by witch to search.
     */
    void searchEmployeeJobTitle(String jobTitleSearch) {
        for (int i = 0; i < this.id; i++) {
            if (this.organization[i].getJobTitle().equals(jobTitleSearch)) {
                this.organization[i].displayInformation();
            } else continue;
        }
    }

    /***
     * Updates all the attributes of an employee.
     * It returns nothing. It only updates.
     *
     * @param i The id of an employee.
     * @param nameUpdate The employee’s name to update.
     * @param ageUpdate The employee’s age to update.
     * @param sexUpdate The employee’s sex to update.
     * @param departmentUpdate The employee’s department to update.
     * @param jobUpdate The employee’s job title to update.
     * @param etcUpdate The employee’s other information to update.
     */
    void updateAll(int i, String nameUpdate, int ageUpdate, String sexUpdate, String departmentUpdate, String jobUpdate, String etcUpdate) {
        this.organization[i].updateName(nameUpdate);
        this.organization[i].updateAge(ageUpdate);
        this.organization[i].updateSex(sexUpdate);
        this.organization[i].updateDepartment(departmentUpdate);
        this.organization[i].updateJobTitle(jobUpdate);
        this.organization[i].updateEtc(etcUpdate);
        this.organization[i].displayInformation();
    }

    /***
     * Deletes all the attributes of an employee.
     * It returns nothing. It only deletes.
     *
     * @param i The id of an employee.
     */
    void removeAll(int i) {
        this.organization[i].deleteName();
        this.organization[i].deleteAge();
        this.organization[i].deleteSex();
        this.organization[i].deleteDepartment();
        this.organization[i].deleteJobTitle();
        this.organization[i].deleteEtc();
        this.organization[i].displayInformation();
    }
}