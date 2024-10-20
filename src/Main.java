public class Main {
    public static void main(String[] args) {

        var  workTime = 640 ;
        var tymePerDay = 8 ;

        var employeeCount = workTime / tymePerDay;
        System.out.println("Count all employees: "+ employeeCount);
        employeeCount += 20;
        var newTimePerDay = workTime * 1. / employeeCount ;
        System.out.println("New time per day: "+newTimePerDay);
    }}
