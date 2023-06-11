import java.util.Scanner;

public class RectangleClient {
    public static void main(String[] args) {
        //присвоение значений скрытых переменных
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);
        //вызов метода создания прямоугольника
        RectangleClient choiceMenu = new RectangleClient();
        //вызов меню
        int choice = choiceMenu.getMenuSelection();
        int choice2 = choiceMenu.getMenuSelection2();

        if (choice == 1) {

            System.out.println("Прямоугольник 1:");

            if (choice2 == 1) {
                System.out.println("Ширина: " + rectangle1.getWidth());
            }
            if (choice2 == 2) {
                System.out.println("Высота: " + rectangle1.getHeight());
            }
            if (choice2 == 3) {
                System.out.println("Площадь: " + rectangle1.getArea());
            }
            if (choice2 == 4) {
                System.out.println("Периметр: " + rectangle1.getPerimeter());
            }

        } else if (choice == 2) {

            System.out.println("Прямоугольник 2:");

            if (choice2 == 1) {
                System.out.println("Ширина: " + rectangle2.getWidth());
            }
            if (choice2 == 2) {
                System.out.println("Высота: " + rectangle2.getHeight());
            }
            if (choice2 == 3) {
                System.out.println("Площадь: " + rectangle2.getArea());
            }
            if (choice2 == 4) {
                System.out.println("Периметр: " + rectangle2.getPerimeter());
            }
        }

    }

    //меню выбора прямоугольников
    public int getMenuSelection() {
        int choice;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите прямоугольник");
            System.out.println("1: Прямоугольник 1: ");
            System.out.println("2: Прямоугольник 2: ");


            System.out.println("Ввод пункта меню: ");


            choice = input.nextInt();
            if (choice < 1 || choice > 2) {
                System.out.println("Некорректный пункт меню: ");
            } else {
                break;
            }

        }
        return choice;
    }

    //меню выбора характеристики
    public int getMenuSelection2() {
        int choice2;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите характеристику:");
            System.out.println("1: Ширина: ");
            System.out.println("2: Высота: ");
            System.out.println("3: Площадь: ");
            System.out.println("4: Периметр: ");


            System.out.println("Ввод пункта меню: ");


            choice2 = input.nextInt();
            if (choice2 < 1 || choice2 > 4) {
                System.out.println("Некорректный пункт меню: ");
            } else {
                break;
            }

        }
        return choice2;
    }
}