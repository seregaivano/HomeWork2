public class Main {
    public static void main(String[] args) {
        var dog = 0.8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog * 4;
        System.out.println(dog);
        cat = cat * 4;
        System.out.println(cat);
        paper = paper * 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend =  friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var fighter1 = 78.2;
        System.out.println(fighter1);
        var fighter2 = 82.7;
        System.out.println(fighter2);
        var M3 = fighter2 + fighter1;
        System.out.println("Общая масса " + M3 + " кг");
        var difference = fighter2 - fighter1;
        System.out.println("Разница двух бойцов " + difference + " кг");
        var differenceFighter = (fighter2 % fighter1);
        System.out.println(differenceFighter);

        var sharedByemployees = 640;
        System.out.println(sharedByemployees);
        var employee = 8;
        System.out.println(employee);
        var TotalEmployees = sharedByemployees / employee;
        System.out.println("Всего работников в компании " + TotalEmployees + " человек");
        var newTotalEmployees = TotalEmployees + 94;
        System.out.println(newTotalEmployees);

        var theCompanyWorks = 174;
        System.out.println(theCompanyWorks);
        var dividedBetweenEmployees = theCompanyWorks * employee;
        System.out.println("Если в компании работает " + theCompanyWorks + " человек то всего " + dividedBetweenEmployees + " часов работы может быть поделено между сотрудниками");




    }
}