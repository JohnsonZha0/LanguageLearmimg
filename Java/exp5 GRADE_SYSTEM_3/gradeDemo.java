package GRADE_SYSTEM;
public class gradeDemo {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //对象数组g,信息一班、二班是gradeMath类的，信息三班、四班是VIP_gradeMath类（向上转型），请将类型填空
        gradeMath g[]= new gradeMath[4];                    ;
        g[0]=new gradeMath("信息一班",3);
        g[1]=new gradeMath("信息二班",2);
        g[2]=new VIP_gradeMath("信息三班",2);
        g[3]=new VIP_gradeMath("信息四班",2);

        System.out.println("学校共有" + gradeMath.classnum + "个班级,成绩状况如下:");        //输出班级数

        int i;
        for (i = 0; i < gradeMath.classnum; i++) {                     //输入各班的成绩，请填写相应程序
            g[i].inputg();
        }

        gradeMath.outclassnum();//学院共有"+classnum+"个班级，成绩情况如下
        String id;
        int j = 0;
        boolean flag = false;
        while (true){
            System.out.println("请输入班号");
            //如果输入的班号存在，则调用相应的run方法

            String s = KB.scan();
            for (i = 0; i < gradeMath.classnum; i++) {
                if (s.equals(g[i].get_cnum())) {
                    flag = true;
                    j = i;
                }
            }
            if (flag) {
                g[j].run();}
            else {
                System.out.println("班号不正确，请重新输入");
                continue;
            }

            System.out.println("是否还有用户，N:退出系统");
            String str=KB.scan();
            if (str.equals("N")||str.equals("n")){
                break;
            }
        }
    }
}
