import java.util.Scanner;
class DAYs {
    int getDays(int year, int month) {
        int days = 0;
        boolean isLeapYear = false;
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            isLeapYear = true;
        } else {
            isLeapYear = false;
        }
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 2:
                if (isLeapYear) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            default:
                System.out.println("请重新输入!");
                break;
        }
        return days;
    }
}
public class Days_Of_Month{
    public static void main(String[] args){
        int days;

        System.out.println("请输入年份");
        int year;//接收输入的年份
        Scanner scanner1 = new Scanner(System.in);
        year = scanner1.nextInt();

        System.out.println("请输入月份");
        int month;//接收输入的月份
        Scanner scanner2 = new Scanner(System.in);
        month = scanner2.nextInt();

        DAYs USERINPUT=new DAYs();
        days=USERINPUT.getDays(year,month);

        System.out.println(year+"年"+month+"月有"+days+"天");
    }
}
