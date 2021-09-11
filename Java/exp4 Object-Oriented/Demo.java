package project4;

public class Demo {
    public static void main(String[] args){
        Graduate zhangsan=new Graduate();
        int zpay;
        int zfee;
        int i;
        zpay=zhangsan.getPay();
        zfee=zhangsan.getFee();
        zpay=1500;
        zfee=5000;
        System.out.println("zhangsan 学费：" + zfee + "\t月工资：" + zpay);
        if (zpay * 12 - zfee < 2000)
            System.out.println("provide a loan");
        else
            System.out.println("mustn't be provided a loan");
        for(i=0;i<2;i++) {
            zhangsan.setFee();
            zhangsan.setPay();
            zpay = zhangsan.getPay();
            zfee = zhangsan.getFee();

            System.out.println("zhangsan 学费：" + zfee + "\t月工资：" + zpay);
            if (zpay * 12 - zfee < 2000)
                System.out.println("provide a loan");
            else
                System.out.println("mustn't be provided a loan");
        }
    }
}
