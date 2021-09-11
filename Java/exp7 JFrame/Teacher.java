package exp7;
public class Teacher {
	   int numberOne,numberTwo;
	   String operator="";
	   boolean right;
	   public int giveNumberOne(int n){
		   numberOne= (int) Math.round(Math.random()*(n-0)+0);//随机生成n以内的整数
		   return numberOne;
	   }
	   public int giveNumberTwo(int n){
		   numberTwo= (int) Math.round(Math.random()*(n-0)+0);//随机生成n以内的整数
		   return numberTwo;
	   }
	   public String giveOperator(){
		   double d=Math.round(Math.random()*(1-0)+0); //生成随机数
		   if (d>0.5)
			   operator="+";
		   else
			   operator="-"; 
		   return operator;
	   }
	   public boolean getRight(int answer){
		   if ( operator=="+"){ //判断operator是否是"+"号
			   if (answer==(numberOne+numberTwo))//判断answer是否是两数之和
				   right=true;
			   else
				   right=false;		   
		   }
		   if (operator=="-"){ //判断operator是否是"-"号
			   if (answer==(numberOne-numberTwo))//判断answer是否是两数之差
				   right=true;
			   else
				   right=false;		   
		   }
		   return right;
	   }
}
