import java.util.*;

public class gradeMath {
	int snum; 					//�༶����
	static int classnum;		//�༶����
	private String cnum;		//���
	int grade[];				//ȫ��ɼ�
	int maxg;					//��߷�
	int ming;					//��ͷ�
	float avggra;				//ƽ����
	int i;
	
								//���췽��,�޲�
	gradeMath(){
	classnum=classnum+1;        //�༶����1
	cnum="";	                //��ų�ʼ��Ϊ���� 
	snum=0;	                    //ѧ������ʼ��Ϊ0              
	}

    //���췽��,��ʼ����ź�����
	gradeMath(String clanum,int snum){
	classnum=classnum+1;        //�༶����1
	clanum=cnum;	            //��ð��
	snum=this.snum;	            //��ð༶����              
	}
	
	//��̬���������Ŀǰ�İ༶����
	static void outclassnum(){
		System.out.println("��ǰ�༶����"+classnum);
	}
	
	//����༶�ɼ�
	void inputg(){
		int grade[]=new int[snum];//ͨ���༶�����õ����鳤�ȣ��Ӷ���������grade
        for(i=0;i<snum;i++)
        	grade[i]=Integer.parseInt(KB.scan());					  
	}							  //ͨ��KB������ɼ�
	
	void maxgrade(){              //��ȫ����߷ֵķ����������߷�
		maxg=grade[0];
		for(i=0;i<snum;i++){
			if (maxg<grade[i])
				maxg=grade[i];
		}
	}
	
	void mingrade(){              //��ȫ����ͷ֣������ͷ�
		ming=grade[0];
		for(i=0;i<snum;i++){
			if (ming>grade[i])
				ming=grade[i];
		}
	}
	
	void avggrade(){              //��ȫ��ƽ���֣����ƽ����
		int total=0;
		for(i=0;i<snum;i++)
			total=total+grade[i];
		avggra=(float)total/snum;
	}
	
	//���������༶�����ж���λѧ��
	void search(){
				
	}
	
	//ͨ��get_cnum������ȡ���
	String get_cnum(){
	    return cnum;	
	}
	
									
	void run(){						//ͨ��run()�������û����в˵�ѡ��1����߷�  2����ͷ�  3��ƽ���ɼ�  4��ѯ  5�˳� ��Ȼ�������Ӧ����
		System.out.println("******��ӭʹ�óɼ�����ϵͳ*******");
		System.out.println("1.����߷�");
		System.out.println("2.����ͷ�");
		System.out.println("3.��ƽ���ɼ�");
		System.out.println("4.��ѯ");
		System.out.println("5.�˳�");
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

	