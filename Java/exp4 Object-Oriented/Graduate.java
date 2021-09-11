package project4;

public class Graduate implements IGraduate{
    char name;
    char sex;
    int age;
    int fee=0;
    int pay=0;

    @Override
    public void setFee() {
        System.out.println("请输入新的学费:");
        fee=Integer.parseInt(KB.scan());
    }

    @Override
    public int getFee() {
        //System.out.println("getFee:"+fee);
        return fee;
    }

    @Override
    public void setPay() {
        System.out.println("请输入新的月工资:");
        pay=Integer.parseInt(KB.scan());
    }

    @Override
    public int getPay() {
        //System.out.println("getPay:"+pay);
        return pay;
    }
}
