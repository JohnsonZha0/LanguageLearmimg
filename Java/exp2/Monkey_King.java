public class Monkey_King {
    public static void main(String[] args) {
        int n=10;
        int number=3;
        int[]a = new int[n];
        for(int i = 0; i < a.length; i++)
        { a[i] = 1; }

        int leftCount = n;		//剩余猴子的数量
        int countNum = 0; 		//数到了第几个
        int index = 0;    		//定义当前的位置从0开始。

        //如果当前点的左边数量不为1的话
        //把踢出的猴子标记改为0，未踢出依然为1
        while(leftCount != 1){
            if(a[index] == 1)
            {//如果当前剩余猴子的数量大于1，然后标记还为1，那么就在计数器中加1
                countNum++;
                //计数器的数和设定被踢出的猴子的数目相同的时候，踢出猴子，把标记改为0
                if(countNum == number){
                    countNum = 0;           //刷新计数器，初始化为0
                    a[index] = 0;           //改变当前的标记为0
                    leftCount--; 			//在剩余的猴子里面减一
                    System.out.println("第"+(index+1)+"只猴子：’我被选到了。‘");
                }
            }

            index ++;       //改变当前的位置
            //改变现有猴子的长度
            //当走到了末尾，转到第一个位置
            if(index == a.length){
                index = 0;
            }
        }
        //从第一个到最后一个查找哪个的标记是0,如果是0的话说明被踢出，如果是1的话，则为剩余的猴王
        for(int i = 0; i < a.length; i++){
            if(a[i] == 1){
                System.out.println("第" + (i+1)+ "只猴子：’我是大王!‘");
            }
        }
    }
}