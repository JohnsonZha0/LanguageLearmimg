package exp7;
public class Teacher {
	   int numberOne,numberTwo;
	   String operator="";
	   boolean right;
	   public int giveNumberOne(int n){
		   numberOne= (int) Math.round(Math.random()*(n-0)+0);//�������n���ڵ�����
		   return numberOne;
	   }
	   public int giveNumberTwo(int n){
		   numberTwo= (int) Math.round(Math.random()*(n-0)+0);//�������n���ڵ�����
		   return numberTwo;
	   }
	   public String giveOperator(){
		   double d=Math.round(Math.random()*(1-0)+0); //���������
		   if (d>0.5)
			   operator="+";
		   else
			   operator="-"; 
		   return operator;
	   }
	   public boolean getRight(int answer){
		   if ( operator=="+"){ //�ж�operator�Ƿ���"+"��
			   if (answer==(numberOne+numberTwo))//�ж�answer�Ƿ�������֮��
				   right=true;
			   else
				   right=false;		   
		   }
		   if (operator=="-"){ //�ж�operator�Ƿ���"-"��
			   if (answer==(numberOne-numberTwo))//�ж�answer�Ƿ�������֮��
				   right=true;
			   else
				   right=false;		   
		   }
		   return right;
	   }
}
