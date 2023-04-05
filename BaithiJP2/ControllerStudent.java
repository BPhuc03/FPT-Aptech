import java.util.Scanner;

public class ControllerStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Add student record");
        System.out.println("2. Display student records");
        System.out.println("3. Save");
        System.out.println("4. Exit");

        student ctt = new student();
        while (true){
            System.out.printf("Nhập lựa chọn: ");
            int a = sc.nextInt();
            sc.nextLine();
            switch (a){
                case 1:
                    ctt.add();
                    break;
                case 2:
                    ctt.display();
                    break;
                case 3:
                    ctt.save();
                    break;
                case 4:
                   return;
            }
        }
    }
}