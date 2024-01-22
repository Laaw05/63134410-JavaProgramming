/**
 * 
 */
package hlam;

/**
 * 
 */
import java.util.Scanner;

public class Lab2Bai04 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int choice;

do {
    menu();
    System.out.print("Chọn chức năng: ");
    choice = scanner.nextInt();

    switch (choice) {
        case 1:
            Lab2Bai01.main(args);
            break;
        case 2:
        	Lab2Bai02.main(args);
            break;
        case 3:
        	Lab2Bai03.main(args);
            break;
        case 4:
            System.out.println("Kết thúc chương trình.");
            break;
        default:
            System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại.");
            break;
    }
} while (choice != 4);
}

public static void menu() {
System.out.println("+---------------------------------------------------+");
System.out.println("1. Giải phương trình bậc nhất");
System.out.println("2. Giải phương trình bậc 2");
System.out.println("3. Tính tiền điện");
System.out.println("4. Kết thúc");
System.out.println("+---------------------------------------------------+");
}
}