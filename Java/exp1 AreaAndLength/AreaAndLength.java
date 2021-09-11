import java.util.Scanner;
class Triangle{
    int a,b,c;
    boolean boo;
    void initTriangle(int a1,int b1,int c1){
        a=a1;
        b=b1;
        c=c1;
    }
    boolean isTriangle(int a,int b, int c){
        boolean flag = false;
        if((a+b>c)&&(b+c>a)&&(a+c>b))
            flag=true;
        return flag;
    }
    int getTriangleLength(int a,int b,int c){
        int Tlen;
        Tlen=a+b+c;
        return Tlen;
    }
    double getTriangleArea(int a,int b,int c){
        double Tarea,p;
        p=0.5*(a+b+c);
        Tarea=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return Tarea;
    }
}
public class AreaAndLength {
        public static void main(String[] args){
            int x,y,z,Tlength;
            double T_area;

            Scanner sc= new Scanner(System.in);
            System.out.println("请输入第一个整数：");
            x=sc.nextInt();
            System.out.println("请输入第二个整数：");
            y=sc.nextInt();
            System.out.println("请输入第三个整数：");
            z=sc.nextInt();

            Triangle MyTriangle=new Triangle();

            MyTriangle.initTriangle(x,y,z);
            if(MyTriangle.isTriangle(x,y,z)==true) {
                Tlength=MyTriangle.getTriangleLength(x,y,z);
                T_area=MyTriangle.getTriangleArea(x,y,z);
                System.out.println("三角形的周长为："+Tlength);
                System.out.println("三角形的面积为："+T_area);}
            else
            {System.out.println("三角形构建不成功！");}

    }
}
