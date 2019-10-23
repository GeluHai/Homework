package com.example.helloworld;

public class GeluHaiducWeek4Homework {
    public static void main(String[] args) {
        Employee e1 = new Employee("pop", 30, "male", "QA", "Tester", "detali inutile");

        e1.displayInformation();

        System.out.println();

        System.out.println("the name is: " + e1.getName());
        System.out.println("the age is: " + e1.getAge());
        System.out.println("the sex is: " + e1.getSex());
        System.out.println("the department is: " + e1.getDepartment());
        System.out.println("the job title is: " + e1.getJobTitle());
        System.out.println("the etc is: " + e1.getEtc());

        System.out.println();

        e1.updateName("vasile");
        e1.updateAge(50);
        e1.updateSex("MASCUL");
        e1.updateJobTitle("tester 2");
        e1.updateDepartment("QA+");
        e1.updateEtc("si mai multe detali inutile");
        e1.displayInformation();

        System.out.println();

        e1.deleteName();
        e1.deleteAge();
        e1.deleteSex();
        e1.deleteJobTitle();
        e1.deleteDepartment();
        e1.deleteEtc();

        System.out.println();

        e1.displayInformation();

        System.out.println();

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

class Organization {
    int id;
    Employee[] organization;

    public Organization() {
        this.organization = new Employee[10];
        this.id = 0;
    }

    public void addEmployee(String name, int age, String sex, String department, String jobTitle, String etc) {
        this.organization[id] = new Employee(name, age, sex, department, jobTitle, etc);
        this.id++;
    }

    public void organizationDetails() {
        System.out.println("Total number of employees: " + this.id);
    }

    public void employeeDetails() {
        for (int i = 0; i < this.id; i++) {
            System.out.print(i + " ");
            this.organization[i].displayInformation();
        }
    }

    public void searchEmployeeName(String nameSearch) {
        for (int i = 0; i < this.id; i++) {
            if (this.organization[i].getName().equals(nameSearch)) {
                this.organization[i].displayInformation();
            } else continue;
        }
    }

    public void searchEmployeeAge(int ageSearch) {
        for (int i = 0; i < this.id; i++) {
            if (this.organization[i].getAge() == ageSearch) {
                this.organization[i].displayInformation();
            } else continue;
        }
    }

    public void searchEmployeeSex(String sexSearch) {
        for (int i = 0; i < this.id; i++) {
            if (this.organization[i].getSex().equals(sexSearch)) {
                this.organization[i].displayInformation();
            } else continue;
        }
    }

    public void searchEmployeeDepartment(String departmentSearch) {
        for (int i = 0; i < this.id; i++) {
            if (this.organization[i].getDepartment().equals(departmentSearch)) {
                this.organization[i].displayInformation();
            } else continue;
        }
    }

    public void searchEmployeeJobTitle(String jobTitleSearch) {
        for (int i = 0; i < this.id; i++) {
            if (this.organization[i].getJobTitle().equals(jobTitleSearch)) {
                this.organization[i].displayInformation();
            } else continue;
        }
    }


    public void updateAll(int i, String a, int b, String c, String d, String e, String f) {
        this.organization[i].updateName(a);
        this.organization[i].updateAge(b);
        this.organization[i].updateSex(c);
        this.organization[i].updateDepartment(d);
        this.organization[i].updateJobTitle(e);
        this.organization[i].updateEtc(f);
        this.organization[i].displayInformation();
    }

    public void removeAll(int i) {
        this.organization[i].deleteName();
        this.organization[i].deleteAge();
        this.organization[i].deleteSex();
        this.organization[i].deleteDepartment();
        this.organization[i].deleteJobTitle();
        this.organization[i].deleteEtc();
        this.organization[i].displayInformation();
    }


}

class Employee {
    String name;
    int age;
    String sex;
    String department;
    String jobTitle;
    String etc;

    public Employee(String name, int age, String sex, String department, String jobTitle, String etc) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.department = department;
        this.jobTitle = jobTitle;
        this.etc = etc;
    }

    public void displayInformation() {
        System.out.println(this.name + " " + this.age + " " + this.sex + " " + this.department + " " + this.jobTitle + " " + this.etc);
    }

    public String getName() {
        return this.name;
    }

    public void updateName(String newName) {
        this.name = newName;
    }

    public void deleteName() {
        this.name = "deleted";
    }

    public int getAge() {
        return this.age;
    }

    public void updateAge(int newAge) {
        this.age = newAge;
    }

    public void deleteAge() {
        this.age = 0;
    }

    public String getSex() {
        return this.sex;
    }

    public void updateSex(String newSex) {
        this.sex = newSex;
    }

    public void deleteSex() {
        this.sex = "deleted";
    }

    public String getDepartment() {
        return this.department;
    }

    public void updateDepartment(String newDepartment) {
        this.department = newDepartment;
    }

    public void deleteDepartment() {
        this.department = "deleted";
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    public void updateJobTitle(String newJobTitle) {
        this.jobTitle = newJobTitle;
    }

    public void deleteJobTitle() {
        this.jobTitle = "deleted";
    }

    public String getEtc() {
        return this.etc;
    }

    public void updateEtc(String newEtc) {
        this.etc = newEtc;
    }

    public void deleteEtc() {
        this.etc = "deleted";
    }
}