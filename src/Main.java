import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {


        // Условный оператор
        // Задание 1
        int adulthood = 18;

        int age = 17;
        if (age >= adulthood) {
            System.out.println("Человеку 18 лет");
        } else {
            System.out.println("Возраст совершенолетия не наступил, и нужно немного подождать");
        }


        // Задание 2
        int putHat = -5;
        int noHat = 5;

        int weather = 0;


        if (weather >= putHat) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            boolean b = weather <= noHat;
            System.out.println("Сегодня тепло, можно идти без шапки");
        }

        // Задание 3
        int speedExceeded = 60;
        int speedNotExceeded = 60;

        int violation = 60;

        if (violation > speedExceeded) {
            System.out.println("скорость превышена, если она больше 60 км/ч;");
        } else if (violation < speedNotExceeded){
           System.out.println("превышения скорости нет, если она меньше 60 км/ч.");
        }


        // Задание 4
        int schoolAge = 7;
        int universityAge = 18;
        int employeeAge = 24;


        if (age >= schoolAge) {
            System.out.println("Ребенок ходит в школу");
        } else if (age >= universityAge) {
           System.out.println("Человек уже закончил школу и может отправлятся в Угиверситет");
        } else if (age >= employeeAge) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }

        // Задание 5
        int childAge = 5;
        int childAverage = 14;
        int childAdult = 14;


        if (age < childAge) {
            System.out.println("Если ребенку меньше 5 лет, то он не может кататься на аттракционе.");
        } else if (age > childAverage) {
            System.out.println("Если ребенку больше 5, но меньше 14 лет, то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else if (age < childAdult ) {
            System.out.println("Если ребенок старше 14 лет, то он может кататься без сопровождения взрослого.");
        }

        // Задание 6
        int capacity = 102;
        int sittingPlace = 60;

        int place = 110;

        if (place <= sittingPlace) {
            System.out.println("Есть сидячее место");
        } else if (place <= capacity){
            System.out.println("Есть стоячее место");
        } else {
            System.out.println("Мест нет");
        }

        // Задание 7
        int one = 1;
        int two = 2;
        int three = 3;

        if (one > two && two > three) {
            System.out.println(one);
        } else if (two > one && two > three) {
            System.out.println(two);
        } else if (three > one && three > two) {
            System.out.println(three);
        }
    }
}