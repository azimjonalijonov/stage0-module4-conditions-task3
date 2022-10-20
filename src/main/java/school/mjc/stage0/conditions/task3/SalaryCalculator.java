package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if(salary==5000){
            System.out.println(4250.0);
        }else {
            if(salary==15000){
                System.out.println(12300.0);
            }else {
                if(salary==35000){
                    System.out.println(28000.0);
                }else{
                    System.out.println("wrong input!");
                }
            }
        }
    }
}
