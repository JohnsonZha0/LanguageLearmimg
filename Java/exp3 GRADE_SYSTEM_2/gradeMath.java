package GRADE_SYSTEM;

public class gradeMath {
    int snum;                    //班级人数
    static int classnum = 0;        //班级个数
    private String cnum;        //班号
    int grade[];                //全班成绩
    int maxg;                    //最高分
    int ming;                    //最低分
    float avggra;                //平均分
    int i, j, temp;

    //构造方法,无参
    gradeMath() {
        classnum = classnum + 1;        //班级数加1
        cnum = "";                    //班号初始化为””
        snum = 0;                        //学生数初始化为0
    }

    //构造方法,初始化班号和人数
    gradeMath(String clanum, int snum) {
        classnum = classnum + 1;        //班级数加1
        cnum = clanum;                //获得班号
        this.snum = snum;                //获得班级人数
    }

    //静态方法，输出目前的班级总数
    static void outclassnum() {
        System.out.println("当前班级总数" + classnum);
    }

    //输入班级成绩
    void inputg() {
        grade = new int[snum];//通过班级人数得到数组长度，从而建立数组grade//
        for (i = 0; i < snum; i++) {
            System.out.println("请输入" + (i + 1) + "号同学成绩:");
            grade[i] = Integer.parseInt(KB.scan());
            if (grade[i] < 0 || grade[i] > 100) {
                System.out.println("当前输入成绩有误，请重新输入。");
                i = i - 1;
                continue;
            }
        }
    }                              //通过KB类输入成绩

    void maxgrade() {              //求全班最高分的方法，输出最高分
        maxg = grade[0];
        for (i = 0; i < snum; i++) {
            if (maxg < grade[i])
                maxg = grade[i];
        }
        System.out.println(maxg);
    }

    void mingrade() {              //求全班最低分，输出最低分
        ming = grade[0];
        for (i = 0; i < snum; i++) {
            if (ming > grade[i])
                ming = grade[i];
        }
        System.out.println(ming);
    }

    void avggrade() {              //求全班平均分，输出平均分
        float total = 0;
        for (i = 0; i < snum; i++)
            total = total + grade[i];
        avggra = (float) total / snum;
        System.out.println(avggra);
    }

    //将班级学生成绩按照从高到低排序并输出
    void gradeorder() {
        for (i = 0; i < snum; i++)
            for (j = 0; j < snum; j++) {
                if (grade[i] > grade[j]) {
                    temp = grade[j];
                    grade[j] = grade[i];
                    grade[i] = temp;
                }
            }
        for (i = 0; i < snum; i++)
            System.out.println(grade[i] + "		");
    }


    //输出结果：班级几班有多少位学生
    void search() {
        System.out.println(cnum + "有" + snum + "位学生。");
    }

    //通过get_cnum方法获取班号
    String get_cnum() {
        return cnum;
    }

    void run() {
        while (true) {
            //通过run()方法让用户进行菜单选择1求最高分  2求最低分  3求平均成绩  4查询  5退出 ，然后进行相应操作
            System.out.println("******欢迎使用成绩管理系统*******");
            System.out.print("\t1.求最高分");
            System.out.print("\t2.求最低分");
            System.out.print("\t3.求平均成绩");
            System.out.print("\t4.查询");
            System.out.print("\t5.排序");
            System.out.println("\t6.退出");
            System.out.print("***************************");
            int n = Integer.parseInt(KB.scan());

            switch (n) {
                case 1:
                    maxgrade();
                    break;
                case 2:
                    mingrade();
                    break;
                case 3:
                    avggrade();
                    break;
                case 4:
                    search();
                    break;
                case 5:
                    gradeorder();
                    break;
                case 6:
                    System.exit(1);
            }
        }
    }
}