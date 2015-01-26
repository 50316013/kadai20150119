package framesystem;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import lib.MM1_lib;
import lib.MMS_lib;

public class FrameSystemView extends Frame implements ActionListener,WindowListener{

	       private TextField text1 = new TextField("",10);
	       private TextField text2 = new TextField("",10);
	       private TextField text3 = new TextField("",10);
	       private Button button1 =new Button("足し算");
	       //M/M/1用
	       private TextField m1= new TextField("",10);
	       private TextField m2= new TextField("",10);
	       private TextField m3= new TextField("",10);
	       private Button bm=new Button("M/M/1");
	       //M/M/S用
	       private TextField s1= new TextField("",10);
	       private TextField s2= new TextField("",10);
	       private TextField s3= new TextField("",10);
	       private TextField s4= new TextField("",10);
	       private Button sm=new Button("M/M/S");
	       
	
	public FrameSystemView(FrameSystemController controller) {
		// TODO Auto-generated constructor stub

		addWindowListener(this);
		setTitle("FrameSystem");
		setLayout(new FlowLayout(FlowLayout.CENTER));
		add(text1);
		add(text2);
		add(button1);
		add(new Label("答え"));
		add(text3);
		add(new Label("λ"));
		add(m1);
		add(new Label("μ"));
		add(m2);
		add(bm);
		add(new Label("平均系内人数"));
		add(m3);		
		button1.addActionListener(this);
		bm.addActionListener(this);
		//以下M/M/Sについて
		add (new Label("λ"));
		add(s1);
		add(new Label("μ"));
		add(s2);
		add(new Label("窓口"));
		add(s3);
		add(sm);
		add(new Label("平均系内人数"));
		add(s4);
		button1.addActionListener(this);
		sm.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button1){					
		int val1 = Integer.parseInt(text1.getText());
		int val2 = Integer.parseInt(text2.getText());
		text3.setText(String.valueOf(val1 + val2));
		//Calculation_lib clib = Calculation_lib(val1,val2);//Calculation_libをFrameSystemのsrcにコピー
		//text3.setText(String.valueOf(clib.getPlus()));
		}
		else if(e.getSource() == bm ){
		 double lamda = Double.parseDouble(m1.getText());
		 double mu = Double.parseDouble(m1.getText());
		 MM1_lib mlib =new MM1_lib(lamda,mu);
		 m3.setText(String.valueOf(mlib.getLength()));
		}
		//M/M/S
		else if(e.getSource() == sm){
			 double lamda= Double.parseDouble(s1.getText());
			 double mu = Double.parseDouble(s2.getText());
			 int s=(int) Double.parseDouble(s3.getText());
			 MMS_lib mlib = new MMS_lib(lamda,mu,s,s);
			 s4.setText(String.valueOf(mlib.getL()));
		}			 
			 
			 
		}
	

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
