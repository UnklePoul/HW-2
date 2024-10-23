public class Main {
    public static void main(String[] args) {

        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog -= 3.5 ;
        cat -=  1.6;
        paper -=  7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /=7 ;
        System.out.println(friend);

        var frog = 3.5;


        System.out.println("Значение пременной frog:" + frog);

        frog *= 10;


        System.out.println("Значение пременной frog:" + frog);

        frog /= 3.5 ;


        System.out.println("Значение пременной frog:" + frog);

        frog +=4 ;


        System.out.println("Значение пременной frog:" + frog);

        var boxer1Weight = 78.2 ;
        var boxer2Weight = 82.7;

        var totalWeight = boxer1Weight + boxer2Weight ;
        var weightDifference = boxer2Weight - boxer1Weight ;
        System.out.println("Обща масса бойцов " + totalWeight );
        System.out.println("Разница между массами бойцов " + weightDifference );

        var reminder = boxer2Weight % boxer1Weight  ;
        System.out.println("Остаток от деления "+reminder);




        var  workTime = 640 ;
        var tymePerDay = 8 ;

        var employeeCount = workTime / tymePerDay;
        System.out.println("Count all employees: "+ employeeCount);
        employeeCount += 20;
        var newTimePerDay = workTime * 1. / employeeCount ;
        System.out.println("New time per day: "+newTimePerDay);
    }}
