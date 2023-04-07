import java.awt.*;

public class main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763_789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        var friends = 19;
        friends = friends +2;
        System.out.println(friends / 2);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var totalWeightBoxers = weightBoxer1 + weightBoxer2;
        System.out.println(totalWeightBoxers);
        var weightDifference1 = weightBoxer2 - weightBoxer1;
        System.out.println("разница в вессе" + weightDifference1 + " кг");
        var weightDifference2 = weightBoxer2 % weightBoxer1;
        System.out.println("разница в вессе" + weightDifference2 + " кг!!!!!!!!");

        var hour1 = 640;
        var employee1 = hour1 / 8;
        System.out.println("количество сотрудников" + employee1);
        var newEmployee = employee1 + 94;
        var newHours = newEmployee * 8;
        System.out.println("если в компании работает " + newEmployee +" сотрудника, то всего " + newHours + " часа может быть поделено между сотрудниками");
    }
}
