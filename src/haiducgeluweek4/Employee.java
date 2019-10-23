package haiducgeluweek4;

/***
 * Represents an Employee. This manages an Employees attributes.
 *
 * @author Gelu Stefan Haiduc - haiduc.gelu@yahoo.com
 * @version 1.000 (current version number of the program)
 */
public class Employee {
    String name;
    int age;
    String sex;
    String department;
    String jobTitle;
    String etc;

    Employee(String name, int age, String sex, String department, String jobTitle, String etc) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.department = department;
        this.jobTitle = jobTitle;
        this.etc = etc;
    }

    /***
     * Prints the employee details.
     * It returns nothing. It only prints.
     */
    void displayInformation() {
        System.out.println(this.name + " " + this.age + " " + this.sex + " " + this.department + " " + this.jobTitle + " " + this.etc);
    }

    /***
     * It gets the name of an employee.
     *
     * @return The name of the employee.
     */
    String getName() {
        return this.name;
    }

    /***
     * Updates the name of an employee.
     * It returns nothing. It updates the name.
     *
     * @param newName The new updated name.
     */
    void updateName(String newName) {
        this.name = newName;
    }

    /***
     * Deletes the name of an employee.
     * It returns nothing. It deletes the name.
     */
    void deleteName() {
        this.name = "deleted";
    }

    /***
     * It gets the age of an employee.
     *
     * @return The age of the employee.
     */
    int getAge() {
        return this.age;
    }

    /***
     * Updates the age of an employee.
     * It returns nothing. It updates the age.
     *
     * @param newAge The new updated age.
     */
    void updateAge(int newAge) {
        this.age = newAge;
    }

    /***
     * Deletes the age of an employee.
     * It returns nothing. It deletes the age.
     */
    void deleteAge() {
        this.age = 0;
    }

    /***
     * It gets the sex of an employee.
     *
     * @return The sex of the employee.
     */
    String getSex() {
        return this.sex;
    }

    /***
     * Updates the sex of an employee.
     * It returns nothing. It updates the sex.
     *
     * @param newSex The new updated sex.
     */
    void updateSex(String newSex) {
        this.sex = newSex;
    }

    /***
     * Deletes the sex of an employee.
     * It returns nothing. It deletes the sex.
     */
    void deleteSex() {
        this.sex = "deleted";
    }

    /***
     * It gets the department of an employee.
     *
     * @return The department of the employee.
     */
    String getDepartment() {
        return this.department;
    }

    /***
     * Updates the department of an employee.
     * It returns nothing. It updates the department.
     *
     * @param newDepartment The new updated department.
     */
    void updateDepartment(String newDepartment) {
        this.department = newDepartment;
    }

    /***
     * Deletes the department of an employee.
     * It returns nothing. It deletes the department.
     */
    void deleteDepartment() {
        this.department = "deleted";
    }

    /***
     * It gets the job title of an employee.
     *
     * @return The job title of the employee.
     */
    String getJobTitle() {
        return this.jobTitle;
    }

    /***
     * Updates the job title of an employee.
     * It returns nothing. It updates the job title.
     *
     * @param newJobTitle The new updated job title.
     */
    void updateJobTitle(String newJobTitle) {
        this.jobTitle = newJobTitle;
    }

    /***
     * Deletes the job title of an employee.
     * It returns nothing. It deletes the job title.
     */
    void deleteJobTitle() {
        this.jobTitle = "deleted";
    }

    /***
     * It gets the other information of an employee.
     *
     * @return The other information of the employee.
     */
    String getEtc() {
        return this.etc;
    }

    /***
     * Updates the other information of an employee.
     * It returns nothing. It updates the other information.
     *
     * @param newEtc The new updated information.
     */
    void updateEtc(String newEtc) {
        this.etc = newEtc;
    }

    /***
     * Deletes the other information of an employee.
     * It returns nothing. It deletes the other information.
     */
    void deleteEtc() {
        this.etc = "deleted";
    }
}
