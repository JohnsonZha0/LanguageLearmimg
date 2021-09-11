package exp7;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ComputerFrame extends JFrame implements ActionListener{
   static JTextField textOne,textTwo,textResult;
   static JButton getProblem,giveAnswer;
   static JLabel operatorLabel,message;
   static Teacher teacher= new Teacher();
   static ComputerFrame mainJFrame=new ComputerFrame();//������ܶ���mainJFrame
   public static void main(String[] args) {
	   mainJFrame.setTitle("��������"); //���ÿ�ܵı���Ϊ"��������"
	   Container container = mainJFrame.getContentPane();
	   container.setLayout(new FlowLayout());
	   textOne=new JTextField(10);//����textOne����ɼ��ַ�����10
	   textTwo=new JTextField(10);//����textTwo����ɼ��ַ�����10
	   textResult=new JTextField(10);//����textResult����ɼ��ַ�����10
	   operatorLabel=new JLabel("+");
	   
	   message=new JLabel("�㻹û�лش���");
	   getProblem=new JButton("��ȡ��Ŀ");//����"��ȡ��Ŀ"��ť
	   giveAnswer=new JButton("ȷ�ϴ�");;//����"ȷ�ϴ�"��ť
	   container.add(getProblem);//��Ӱ�ťgetProblem�������
	   container.add(textOne);
	   container.add(operatorLabel);
	   container.add(textTwo);
	   container.add(new JLabel("="));
	   container.add(textResult);
	   container.add(giveAnswer);
	   container.add(message); //��ӱ�ǩmessage�������
	   textResult.requestFocus();
	   
	   textOne.setEditable(false); //����textOne�ı���Ϊ���ɱ༭
	   textTwo.setEditable(false); //����textTwo�ı���Ϊ���ɱ༭
	   //����ǰ����ע��ΪgetProblem��ActionEvent�¼�������
	   getProblem.addActionListener(mainJFrame);//
	 //����ǰ����ע��ΪgiveAnswer��ActionEvent�¼�������
	   giveAnswer.addActionListener(mainJFrame);//
	 //����ǰ����ע��ΪtextResult��ActionEvent�¼�������
	   textResult.addActionListener(mainJFrame);//
	   mainJFrame.setBounds(100,100,450,100);
	   mainJFrame.setVisible(true); //���ÿ�ܿɼ���   
	   mainJFrame.validate();
	   mainJFrame.addWindowListener(new WindowAdapter()
       {public void windowClosing(WindowEvent e)
          {  System.exit(0);}//
       });
   }
   public void actionPerformed(ActionEvent e){
	   JButton bt=(JButton)e.getSource();         //��ȡ�������İ�ť
	   if (e.getSource()==getProblem){//�ж��¼�Դ�Ƿ���getProblem
		   int number1=teacher.giveNumberOne(100); //��õ�һ��������(100����)
		   int number2=teacher.giveNumberTwo(100);//��õڶ���������(100����)
		   String operator=teacher.giveOperator();//��ò�����+��-
		   textOne.setText(""+number1);
		   textTwo.setText(""+number2);
		   operatorLabel.setText(operator);
		   message.setText("��ش�");
		   textResult.setText(null);		   
	   }
	   if (e.getSource()==giveAnswer){//�ж��¼�Դ�Ƿ���giveAnswer
		   String answer=textResult.getText();
		   try{
			   int result=Integer.parseInt(answer);
			   if (teacher.getRight(result)==true){
				   message.setText("��ش���ȷ");
			   }
			   else{
				   message.setText("��ش����");
			   }
		   }
		   catch(NumberFormatException ex){
			   message.setText("�����������ַ�");
		   }
	   }
	   textResult.requestFocus();
	   mainJFrame.validate();
   }  
}

