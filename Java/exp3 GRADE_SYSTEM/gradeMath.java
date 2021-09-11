import java.util.*;

public class gradeMath {
	int snum; 					//班级人数
	static int classnum;		//班级个数
	private String cnum;		//班号
	int grade[];				//全班成绩
	int maxg;					//最高分
	int ming;					//最低分
	float avggra;				//平均分
	int i;
	
								//构造方法,无参
	gradeMath(){
	classnum=classnum+1;        //班级数加1
	cnum="";	                //班号初始化为”” 
	snum=0;	                    //学生数初始化为0              
	}

    //构造方法,初始化班号和人数
	gradeMath(String clanum,int snum){
	classnum=classnum+1;        //班级数加1
	clanum=cnum;	            //获得班号
	snum=this.snum;	            //获得班级人数              
	}
	
	//静态方法，输出目前的班级总数
	static void outclassnum(){
		System.out.println("当前班级总数"+classnum);
	}
	
	//输入班级成绩
	void inputg(){
		int grade[]=new int[snum];//通过班级人数得到数组长度，从而建立数组grade
        for(i=0;i<snum;i++)
        	grade[i]=Integer.parseInt(KB.scan());					  
	}							  //通过KB类输入成绩
	
	void maxgrade(){              //求全班最高分的方法，输出最高分
		maxg=grade[0];
		for(i=0;i<snum;i++){
			if (maxg<grade[i])
				maxg=grade[i];
		}
	}
	
	void mingrade(){              //求全班最低分，输出最低分
		ming=grade[0];
		for(i=0;i<snum;i++){
			if (ming>grade[i])
				ming=grade[i];
		}
	}
	
	void avggrade(){              //求全班平均分，输出平均分
		int total=0;
		for(i=0;i<snum;i++)
			total=total+grade[i];
		avggra=(float)total/snum;
	}
	
	//输出结果：班级几班有多少位学生
	void search(){
				
	}
	
	//通过get_cnum方法获取班号
	String get_cnum(){
	    return cnum;	
	}
	
									
	void run(){						//通过run()方法让用户进行菜单选择1求最高分  2求最低分  3求平均成绩  4查询  5退出 ，然后进行相应操作
		System.out.println("******欢迎使用成绩管理系统*******");
		System.out.println("1.求最高分");
		System.out.println("2.求最低分");
		System.out.println("3.求平均成绩");
		System.out.println("4.查询");
		System.out.println("5.退出");
		System.out.println("***************************");
		int n= Integer.parseInt(KB.scan());
		
		switch (n) {
		case 1:
			this.maxgrade();break;
		case 2:
			this.mingrade();break;
		case 3:
			this.avggrade();break;
		case 4:
			this.search();break;
		case 5:
			System.exit(1);
		}
	}
}

	