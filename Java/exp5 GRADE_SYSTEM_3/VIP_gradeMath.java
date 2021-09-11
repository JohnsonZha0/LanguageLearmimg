package GRADE_SYSTEM;

public class VIP_gradeMath extends gradeMath{
    int i,j;
    int Id[];
    VIP_gradeMath(String clanum, int snum) {
        super(clanum, snum);
    }

    void inputId() {
        Id = new int[snum];//通过班级人数得到数组长度，从而建立数组grade//
        for (i = 0; i < snum; i++) {
            System.out.println("请输入" + (i + 1) + "号同学学号:");
            Id[i]= Integer.parseInt(KB.scan());
            for(j=0;j<snum;j++){
                if(Id[i]==Id[j]&&i!=j){
                    System.out.println("此学号已经存在，请重新输入新学号。");
                    i=i-1;
                    continue;
                }
            }
        }
    }
    void run(){
        inputId();

        //--------------------------------------
        System.out.print("最高分：");
        maxgrade();
        System.out.println("");
        //--------------------------------------
        System.out.print("最低分：");
        mingrade();
        System.out.println("");
        //--------------------------------------
        System.out.print("平均分：");
        avggrade();
        System.out.println("");
    }
}
