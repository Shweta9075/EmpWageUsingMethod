package com.bridgelabz;

public class EmpWageUsingMethod {
   public static final int is_Full_Time = 1;    //Instance variables
    public static final int is_Part_Time = 2;
    int empWagePerHrs = 20;
    int empHrs;
    int empWage;
    int partTimeWage;
    int num_Of_Working_Days = 5;
    int totalEmpWage = 0;
    int max_Hrs_In_Month = 10;
    int totalEmpHrs = 0;
    int totalWorkingDays = 0;
    int empcheck =(int) Math.floor(Math.random() * 10) % 2;
    void empPresent() {
        if (empcheck == is_Full_Time)
            System.out.println("Employee is present.");
        if (empcheck == is_Part_Time)
            System.out.println("Employee is absent.");
        }
        void empWadge() {
            if (empcheck == is_Full_Time)
                empHrs = 8;
            empWage = empHrs * empWagePerHrs;
            System.out.println("Daily Employee wage = " + empWage);
        }
        void empPartTime(){
        if(empcheck == is_Full_Time) {
            empHrs = 8;
            empWage = empHrs * empWagePerHrs;
            System.out.println("Daily Employee wage = " + empWage);
        }else if(empcheck == is_Part_Time) {
                empHrs = 4;
                partTimeWage = empHrs * empWagePerHrs;
                System.out.println("Part Time employee wage = " + partTimeWage);
            } else
                empHrs = 0;
                partTimeWage = empHrs * empWagePerHrs;
                System.out.println("Part Time employee wage = " + partTimeWage);
        }
        void totalEmpWage() {
            for (int i = 0; i <= num_Of_Working_Days; i++) {
                switch (empcheck) {
                    case is_Full_Time:
                        empHrs = 8;
                        break;
                    case is_Part_Time:
                        empHrs = 4;
                        break;
                    default:
                        empHrs = 0;
                }
                empWage = empHrs * empWagePerHrs;
                totalEmpWage = totalEmpWage + empWage;
                System.out.println("Employee wage : " + empWage);
            }
            System.out.println("Total Employee Wage : " + totalEmpWage);
        }
        void maxMonthEmpWage(){
        while (totalEmpHrs <= max_Hrs_In_Month && totalWorkingDays < num_Of_Working_Days){
            totalWorkingDays++;
            int empcheck = (int) Math.floor(Math.random() *10) %3;
            switch (empcheck){
                case is_Part_Time:
                    empHrs = 4;
                    break;
                case is_Full_Time:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs = totalEmpHrs + empHrs;
            System.out.println("Day#:" +totalWorkingDays + "Emp Hrs: "+empHrs);
        }
        int totalEmpWage = totalEmpHrs * empWagePerHrs;
            System.out.println("Total employee Wage :"+ totalEmpWage);
        }

        public static void main (String[]args){
        EmpWageUsingMethod emp = new EmpWageUsingMethod();
          emp.empPresent();
          emp.empWadge();
          emp.empPartTime();
          emp.totalEmpWage();
        }
    }

