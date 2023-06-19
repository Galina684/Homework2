public class Main {
    public static void main(String[] args) {
        //задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //задача 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //задача 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //задача 4
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        //задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        //задача 6
        var boxerNumberOne = 78.2;
        var boxerNumberTwo = 82.7;
        var totalWeight = boxerNumberOne + boxerNumberTwo;
        System.out.println("Общий вес двух боксеров " + totalWeight + " кг");
        var weightDifference = boxerNumberTwo - boxerNumberOne;
        System.out.println("Разница в весе боксеров " + weightDifference + " кг");
        // задача 7
        var weightSubtraction = boxerNumberTwo - boxerNumberOne;
        System.out.println("Разница в весе с помощью вычитания " + weightSubtraction + " кг");
        var weightRemainder = boxerNumberTwo % boxerNumberOne;
        System.out.println("Разница в весе с помощью остатка " + weightRemainder + " кг");
        //задача 8
        var openinghHours = 640;
        var workers = openinghHours / 8;
        System.out.println("Всего работников в компании " + workers + " человек");
        workers =  workers + 94;
        openinghHours = workers * 8;
        System.out.println("Если в компании работает " + workers + " человек, то всего " + openinghHours +
                " часов работы может быть поделено между сотрудниками");

    }
}