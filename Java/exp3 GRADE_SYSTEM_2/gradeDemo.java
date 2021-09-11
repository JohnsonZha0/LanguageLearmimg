package GRADE_SYSTEM;

public class gradeDemo {
    public static void main(String[] args) {
        int i, j = 0;
        gradeMath g[] = new gradeMath[3];         //建立对象数组g存放3各班的信息：("信息一班",3) ("信息二班",2) ("信息三班",1)
        g[0] = new gradeMath("信息一班", 3);
        g[1] = new gradeMath("信息二班", 2);
        g[2] = new gradeMath("信息三班", 1);

        System.out.println("学校共有" + gradeMath.classnum + "个班级,成绩状况如下:");        //输出班级数

        for (i = 0; i < gradeMath.classnum; i++) {                     //输入各班的成绩，请填写相应程序
            System.out.println("请输入班级" + g[i].get_cnum() + "的成绩:");
            g[i].inputg();
        }

        boolean flag = false;                                //输入班号，判断班号是否存在。若存在，则进行相应操作；否则提示“班号不正确，请重新输入”。结束后提示“是否有新的用户”，若有则进行，若无则程序结束。请填写相应程序。
        while (true) {
            System.out.println("请输入您的班号:");
            String s = KB.scan();
            for (i = 0; i < gradeMath.classnum; i++) {
                if (s.equals(g[i].get_cnum())) {
                    flag = true;
                    j = i;
                }
            }
            if (flag) {
                g[j].run();
            } else {
                System.out.println("班号不正确，请重新输入");
                continue;
            }
            System.out.println("是否有新的用户,若无请按N");
            String judge = KB.scan();
            if (judge.equals("N")) {
                break;
            }
        }
    }
}

