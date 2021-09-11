package GRADE_SYSTEM;
import java.util.*;

public class gradeMath {
    int snum; //班级人数
    static int classnum;//班级个数
    String cnum;//班号
    int grade[];//全班成绩
    int maxg;//最高分
    int ming;//最低分
    float avggra;//平均分

    //构造方法,初始化班号和人数
    gradeMath(String clanum,int snum){
        classnum++; //班级数加1
        cnum=clanum;
        this.snum=snum;//通过数组长度得到学生数
    }

    //静态方法，输出目前的班级数
    static void outclassnum(){
        System.out.println("学院共有"+classnum+"个班级，成绩情况如下：");

    }

    //输入班级成绩
    void inputg(){
        grade=new int[snum];
        Scanner s=new Scanner(System.in);
        System.out.println("请输入班级"+cnum+"的成绩：");
        int i;
        for (i=0;i<snum;i++){
            System.out.println("请输入"+(i+1)+"号学生成绩：");
            grade[i]=s.nextInt();
        }
    }
    //求全班最高分的方法
    void maxgrade(){
        maxg=grade[0];
        for (int i=1;i<grade.length;i++){
            if (grade[i]>maxg){
                maxg=grade[i];
            }
        }
        System.out.print(maxg);
    }
    //求全班最低分
    void mingrade(){
        ming=grade[0];
        for (int i=1;i<grade.length;i++){
            if (grade[i]<ming){
                ming=grade[i];
            }
        }
        System.out.print(ming);
    }
    //求全班平均分
    void avggrade(){
        float sum=0;
        for (int i=0;i<grade.length;i++){
            sum=sum+grade[i];
        }
        avggra=sum/grade.length;
        System.out.print(avggra);
    }

    //输出成绩处理的结果
    void search(){
        System.out.println("班级"+cnum+"共有"+snum+"位学生");
        System.out.println("其中"+"最高分:"+maxg+", 最低分:"+ming+", 平均分:"+avggra);
    }

    //通过get_cnum方法获取班号
    String get_cnum() {
        return cnum;
    }

    void exchangestu(){
    }

    //运行各方法，依次为：inputg、maxgrade、mingrade、avggrade、search
    void run(){
            System.out.print("其中最高分：");
            maxgrade();
            System.out.print("，最低分：");
            mingrade();
            System.out.print("，平均分：");
            avggrade();
    }
}
