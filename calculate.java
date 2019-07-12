//Importing nesessary packages used in project.
import java.io.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
//Implementing requiDARK_GRAY listeners for event handling.

class calculate implements ActionListener//,ItemListener
{
	//Creating referance variables of readymade awt classes.
	Frame f;
	Panel p;
	Label l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18;
	TextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10,tf11,tf12,tf13,tf14,tf15,tf16,tf17,tf18,tf19,tf20,tf21,tf22,tf23,tf24;
	Button b1,b2,b3,b4,b5,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30,b31,b32,b33,b34,b35,b36,b37,b38;    
    Font ff=new Font("Arial",1,15);
	

	 public calculate()      //Default constructor to initalise different components
	{
		f= new Frame("Calculator");
		p=new Panel();
		f.add(p);
		f.setVisible(true);
		f.setSize(1000,1000);
		p.setBackground(Color.WHITE);
		p.setLayout(null);
		Font ff1=new Font ("Sans_serif",1,20);
		
         //****************ADDING COMPONENTS FOR BASIC ARITHMATIC OPEARTIONS***************
         
        l=new Label("BASIC ARITHEMATIC OPERATIONS");
		l.setBounds(20,10,350,30);
		l.setForeground(Color.DARK_GRAY);
		l.setFont(ff1);
		p.add(l);
		
		l1=new Label("Input 1");
		l1.setBounds(20,40,80,30);
		l1.setForeground(Color.GRAY);
		l1.setFont(ff1);
		p.add(l1);
		
		
		l2=new Label("Input 2");
		l2.setBounds(20,80,80,30);
		l2.setForeground(Color.GRAY);
		l2.setFont(ff1);
		p.add(l2);
         
        l3=new Label("Output");
		l3.setBounds(20,170,90,30);
		l3.setForeground(Color.GRAY);
		l3.setFont(ff1);
		p.add(l3);
         
        tf1=new TextField(15);
		tf1.setBounds(120,40,200,30);
		tf1.setBackground(Color.LIGHT_GRAY);
		tf1.setForeground(Color.GRAY);
		tf1.setFont(ff);	
		p.add(tf1);	

		tf2=new TextField(15);
		tf2.setBounds(120,80,200,30);
		tf2.setBackground(Color.LIGHT_GRAY);
		tf2.setForeground(Color.GRAY);
		tf2.setFont(ff);	
		p.add(tf2);	

		tf3=new TextField(15);
		tf3.setBounds(120,170,200,30);
		tf3.setBackground(Color.LIGHT_GRAY);
		tf3.setForeground(Color.GRAY);
		tf3.setFont(ff);	
		p.add(tf3);
         
        b1=new Button("+");
		b1.setBounds(10,120,60,30);
		b1.setBackground(Color.LIGHT_GRAY);
		b1.setForeground(Color.DARK_GRAY);
		b1.setFont(ff);
		p.add(b1);	

		b2=new Button("-");
		b2.setBounds(70,120,60,30);
		b2.setBackground(Color.LIGHT_GRAY);
		b2.setForeground(Color.DARK_GRAY);
		b2.setFont(ff);
		p.add(b2);
	
		b3=new Button("*");
		b3.setBounds(130,120,60,30);
		b3.setBackground(Color.LIGHT_GRAY);
		b3.setForeground(Color.DARK_GRAY);
		b3.setFont(ff);
		p.add(b3);
         
         
		b4=new Button("/");
		b4.setBounds(190,120,60,30);
		b4.setBackground(Color.LIGHT_GRAY);
		b4.setForeground(Color.DARK_GRAY);
		b4.setFont(ff);
		p.add(b4);
         
        b5=new Button("%");
		b5.setBounds(250,120,60,30);
		b5.setBackground(Color.LIGHT_GRAY);
		b5.setForeground(Color.DARK_GRAY);
		b5.setFont(ff);
		p.add(b5);
         
        b1.addActionListener(this);
	    b2.addActionListener(this);
	    b3.addActionListener(this);
	    b4.addActionListener(this);
	    b5.addActionListener(this);
         
        b31=new Button("clear");
		b31.setBounds(120,210,50,30);
		b31.setBackground(Color.LIGHT_GRAY);
		b31.setForeground(Color.DARK_GRAY);
		b31.setFont(ff);
		p.add(b31);
        b31.addActionListener(this);
       
        //********ADDING COMPONENTS  FOR GST CALCULATOR*******
         
        l4=new Label("GST CALCULATOR");
		l4.setBounds(500,10,340,30);
		l4.setForeground(Color.DARK_GRAY);
		l4.setFont(ff1);
		p.add(l4);
		
        l5=new Label("Enter amount");
		l5.setBounds(410,40,150,30);
		l5.setForeground(Color.GRAY);
		l5.setFont(ff1);
		p.add(l5);
        
        l6=new Label("Applicable GST");
		l6.setBounds(410,100,160,30);
		l6.setForeground(Color.GRAY);
		l6.setFont(ff1);
		p.add(l6);
                  
        l7=new Label(" GST is");
		l7.setBounds(410,170,120,30);
		l7.setForeground(Color.GRAY);
		l7.setFont(ff1);
		p.add(l7);
        
        tf4=new TextField(15);
		tf4.setBounds(580,40,200,30);
		tf4.setBackground(Color.LIGHT_GRAY);
		tf4.setForeground(Color.GRAY);
		tf4.setFont(ff);	
		p.add(tf4);	
         
        tf5=new TextField(15);
		tf5.setBounds(580,170,200,30);
		tf5.setBackground(Color.LIGHT_GRAY);
		tf5.setForeground(Color.GRAY);
		tf5.setFont(ff);	
		p.add(tf5);	
         
        b7=new Button("5%");
		b7.setBounds(580,100,40,30);
		b7.setBackground(Color.LIGHT_GRAY);
		b7.setForeground(Color.DARK_GRAY);
		b7.setFont(ff);
		p.add(b7);
         
        b8=new Button("8%");
		b8.setBounds(620,100,40,30);
		b8.setBackground(Color.LIGHT_GRAY);
		b8.setForeground(Color.DARK_GRAY);
		b8.setFont(ff);
		p.add(b8);
        
        b9=new Button("12%");
		b9.setBounds(660,100,40,30);
		b9.setBackground(Color.LIGHT_GRAY);
		b9.setForeground(Color.DARK_GRAY);
		b9.setFont(ff);
		p.add(b9);
        
        b10=new Button("18%");
		b10.setBounds(700,100,40,30);
		b10.setBackground(Color.LIGHT_GRAY);
		b10.setForeground(Color.DARK_GRAY);
		b10.setFont(ff);
		p.add(b10);
         
        b11=new Button("28%");
		b11.setBounds(740,100,40,30);
		b11.setBackground(Color.LIGHT_GRAY);
		b11.setForeground(Color.DARK_GRAY);
		b11.setFont(ff);
		p.add(b11);
         
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
         
        b29=new Button("clear");
		b29.setBounds(580,210,50,30);
		b29.setBackground(Color.LIGHT_GRAY);
		b29.setForeground(Color.DARK_GRAY);
		b29.setFont(ff);
		p.add(b29);
        b29.addActionListener(this);
         //**********ADDING COMPONENTS FOR SIMPLE INTEREST CALCULATOR*************
         
        l4=new Label("SIMPLE INTEREST");
		l4.setBounds(950,10,340,30);
		l4.setForeground(Color.DARK_GRAY);
		l4.setFont(ff1);
		p.add(l4);
         
        l9=new Label("Enter amount");
		l9.setBounds(900,40,150,30);
		l9.setForeground(Color.GRAY);
		l9.setFont(ff1);
		p.add(l9);
         
        l10=new Label("Enter time(yrs)");
		l10.setBounds(900,100,150,30);
		l10.setForeground(Color.GRAY);
		l10.setFont(ff1);
		p.add(l10);
         
        tf6=new TextField(15);
		tf6.setBounds(1070,40,200,30);
		tf6.setBackground(Color.LIGHT_GRAY);
		tf6.setForeground(Color.GRAY);
		tf6.setFont(ff);
		p.add(tf6);
         
         
		tf8=new TextField(15);
		tf8.setBounds(1070,170,200,30);
		tf8.setBackground(Color.LIGHT_GRAY);
		tf8.setForeground(Color.GRAY);
		tf8.setFont(ff);	
		p.add(tf8);
         
         
        tf7=new TextField(15);
		tf7.setBounds(1070,100,200,30);
		tf7.setBackground(Color.LIGHT_GRAY);
		tf7.setForeground(Color.GRAY);
		tf7.setFont(ff);
		p.add(tf7);
         
        b12=new Button("Compute Interest");
		b12.setBounds(880,170,170,30);
		b12.setBackground(Color.LIGHT_GRAY);
		b12.setForeground(Color.DARK_GRAY);
		b12.setFont(ff);
		p.add(b12);
         
        b12.addActionListener(this);
        
        b30=new Button("clear");
		b30.setBounds(1070,210,50,30);
		b30.setBackground(Color.LIGHT_GRAY);
		b30.setForeground(Color.DARK_GRAY);
		b30.setFont(ff);
		p.add(b30);
        b30.addActionListener(this);
        
         
        //************ADDING COMPONENTS FOR CURRENCY CONVERTOR**************
         
        l11=new Label("CURRENCY CONVERTER(foreign currency to rupees)");
		l11.setBounds(400,250,700,30);
		l11.setForeground(Color.DARK_GRAY);
		l11.setFont(ff1);
		p.add(l11); 
         
        l12=new Label("The amount");
		l12.setBounds(250,300,120,30);
		l12.setForeground(Color.GRAY);
		l12.setFont(ff1);
		p.add(l12); 
         
        l13=new Label("in rupess is");
		l13.setBounds(250,350,120,30);
		l13.setForeground(Color.GRAY);
		l13.setFont(ff1);
		p.add(l13);
        
        tf9=new TextField(15);
		tf9.setBounds(370,300,100,30);
		tf9.setBackground(Color.LIGHT_GRAY);
		tf9.setForeground(Color.GRAY);
		tf9.setFont(ff);	
		p.add(tf9);	
		
        tf10=new TextField(15);
		tf10.setBounds(370,350,100,30);
		tf10.setBackground(Color.LIGHT_GRAY);
		tf10.setForeground(Color.GRAY);
		tf10.setFont(ff);	
		p.add(tf10);
         
        b13=new Button("Aus Dollars");
		b13.setBounds(520,300,100,30);
		b13.setBackground(Color.LIGHT_GRAY);
		b13.setForeground(Color.DARK_GRAY);
		b13.setFont(ff);
		p.add(b13);
         
        b14=new Button("British Pound");
		b14.setBounds(645,300,100,30);
		b14.setBackground(Color.LIGHT_GRAY);
		b14.setForeground(Color.DARK_GRAY);
		b14.setFont(ff);
		p.add(b14);
         
        b15=new Button("Canadian dollar");
		b15.setBounds(770,300,110,30);
		b15.setBackground(Color.LIGHT_GRAY);
		b15.setForeground(Color.DARK_GRAY);
		b15.setFont(ff);
		p.add(b15);
         
        b16=new Button("Chinese Yuan");
		b16.setBounds(900,300,110,30);
		b16.setBackground(Color.LIGHT_GRAY);
		b16.setForeground(Color.DARK_GRAY);
		b16.setFont(ff);
		p.add(b16);
         
        b17=new Button("Euro");
		b17.setBounds(520,350,100,30);
		b17.setBackground(Color.LIGHT_GRAY);
		b17.setForeground(Color.DARK_GRAY);
		b17.setFont(ff);
		p.add(b17);
         
         b18=new Button("Japanese Yen");
		b18.setBounds(645,350,100,30);
		b18.setBackground(Color.LIGHT_GRAY);
		b18.setForeground(Color.DARK_GRAY);
		b18.setFont(ff);
		p.add(b18);
        
        b19=new Button("Kuwaiti Dinar");
		b19.setBounds(770,350,110,30);
		b19.setBackground(Color.LIGHT_GRAY);
		b19.setForeground(Color.DARK_GRAY);
		b19.setFont(ff);
		p.add(b19);
          
        b20=new Button("US Dollar");
		b20.setBounds(900,350,110,30);
		b20.setBackground(Color.LIGHT_GRAY);
		b20.setForeground(Color.DARK_GRAY);
		b20.setFont(ff);
		p.add(b20);
        
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);
         
        b28=new Button("clear");
		b28.setBounds(370,390,100,30);
		b28.setBackground(Color.LIGHT_GRAY);
		b28.setForeground(Color.DARK_GRAY);
		b28.setFont(ff);
		p.add(b28);
        
        b28.addActionListener(this);
         
        //**************ADDING COMPONENTS FOR TRIGONOMETRIC FUNCTIONS****************
         
        l14=new Label("TRIGONOMETRIC FUNCTIONS");
		l14.setBounds(100,450,300,30);
		l14.setForeground(Color.DARK_GRAY);
		l14.setFont(ff1);
		p.add(l14);
         
        l15=new Label("Angle(in degrees)");
		l15.setBounds(70,480,200,30);
		l15.setForeground(Color.GRAY);
		l15.setFont(ff1);
		p.add(l15);
         
        tf11=new TextField(15);
		tf11.setBounds(290,480,200,30);
		tf11.setBackground(Color.LIGHT_GRAY);
		tf11.setForeground(Color.GRAY);
		tf11.setFont(ff);
		p.add(tf11);
        
        b21=new Button("sin");
		b21.setBounds(40,530,40,30);
		b21.setBackground(Color.LIGHT_GRAY);
		b21.setForeground(Color.DARK_GRAY);
		b21.setFont(ff);
		p.add(b21);
         
        tf12=new TextField(15);
		tf12.setBounds(100,530,200,30);
		tf12.setBackground(Color.LIGHT_GRAY);
		tf12.setForeground(Color.GRAY);
		tf12.setFont(ff);
		p.add(tf12);
         
        b22=new Button("cosec");
		b22.setBounds(320,530,50,30);
		b22.setBackground(Color.LIGHT_GRAY);
		b22.setForeground(Color.DARK_GRAY);
		b22.setFont(ff);
		p.add(b22);
         
        tf13=new TextField(15);
		tf13.setBounds(390,530,200,30);
		tf13.setBackground(Color.LIGHT_GRAY);
		tf13.setForeground(Color.GRAY);
		tf13.setFont(ff);
		p.add(tf13);
         
        b23=new Button("cos");
		b23.setBounds(40,580,40,30);
		b23.setBackground(Color.LIGHT_GRAY);
		b23.setForeground(Color.DARK_GRAY);
		b23.setFont(ff);
		p.add(b23);
         
        tf14=new TextField(15);
		tf14.setBounds(100,580,200,30);
		tf14.setBackground(Color.LIGHT_GRAY);
		tf14.setForeground(Color.GRAY);
		tf14.setFont(ff);
		p.add(tf14);
         
        b24=new Button("sec");
		b24.setBounds(320,580,50,30);
		b24.setBackground(Color.LIGHT_GRAY);
		b24.setForeground(Color.DARK_GRAY);
		b24.setFont(ff);
		p.add(b24);
         
        tf15=new TextField(15);
		tf15.setBounds(390,580,200,30);
		tf15.setBackground(Color.LIGHT_GRAY);
		tf15.setForeground(Color.GRAY);
		tf15.setFont(ff);
		p.add(tf15);
         
        b25=new Button("tan");
		b25.setBounds(40,630,40,30);
		b25.setBackground(Color.LIGHT_GRAY);
		b25.setForeground(Color.DARK_GRAY);
		b25.setFont(ff);
		p.add(b25);
         
        tf16=new TextField(15);
		tf16.setBounds(100,630,200,30);
		tf16.setBackground(Color.LIGHT_GRAY);
		tf16.setForeground(Color.GRAY);
		tf16.setFont(ff);
		p.add(tf16);
         
        b26=new Button("cot");
		b26.setBounds(320,630,50,30);
		b26.setBackground(Color.LIGHT_GRAY);
		b26.setForeground(Color.DARK_GRAY);
		b26.setFont(ff);
		p.add(b26);
         
        tf17=new TextField(15);
		tf17.setBounds(390,630,200,30);
		tf17.setBackground(Color.LIGHT_GRAY);
		tf17.setForeground(Color.GRAY);
		tf17.setFont(ff);
		p.add(tf17);
        
        //b20.addActionListener(this);
        b21.addActionListener(this);
        b22.addActionListener(this);
        b23.addActionListener(this);
        b24.addActionListener(this);
        b25.addActionListener(this);
         b26.addActionListener(this);
         
         
        b27=new Button("clear");
		b27.setBounds(530,480,50,30);
		b27.setBackground(Color.LIGHT_GRAY);
		b27.setForeground(Color.DARK_GRAY);
		b27.setFont(ff);
		p.add(b27);
        b27.addActionListener(this);
         //**********ADDING CODE FOR OTHER MATHS AND CS FUNCTIONS*************
         
        l17=new Label("OTHER MATHS AND COMP SCI FUNCTIONS");
		l17.setBounds(700,400,500,30);
		l17.setForeground(Color.DARK_GRAY);
		l17.setFont(ff1);
		p.add(l17);
         
        l18=new Label("Input");
		l18.setBounds(800,450,60,30);
		l18.setForeground(Color.GRAY);
		l18.setFont(ff1);
		p.add(l18);
         
        tf18=new TextField(15);
		tf18.setBounds(900,450,200,30);
		tf18.setBackground(Color.LIGHT_GRAY);
		tf18.setForeground(Color.GRAY);
		tf18.setFont(ff);
		p.add(tf18);
         
        b32=new Button("log");
		b32.setBounds(750,500,40,30);
		b32.setBackground(Color.LIGHT_GRAY);
		b32.setForeground(Color.DARK_GRAY);
		b32.setFont(ff);
		p.add(b32);
        b32.addActionListener(this);
         
        tf19=new TextField(15);
		tf19.setBounds(800,500,200,30);
		tf19.setBackground(Color.LIGHT_GRAY);
		tf19.setForeground(Color.GRAY);
		tf19.setFont(ff);
		p.add(tf19);
         
        b33=new Button("exp");
		b33.setBounds(1050,500,40,30);
		b33.setBackground(Color.LIGHT_GRAY);
		b33.setForeground(Color.DARK_GRAY);
		b33.setFont(ff);
		p.add(b33);
        b33.addActionListener(this);
         
         tf20=new TextField(15);
		tf20.setBounds(1100,500,200,30);
		tf20.setBackground(Color.LIGHT_GRAY);
		tf20.setForeground(Color.GRAY);
		tf20.setFont(ff);
		p.add(tf20);
         
        b34=new Button("ceil");
		b34.setBounds(750,550,40,30);
		b34.setBackground(Color.LIGHT_GRAY);
		b34.setForeground(Color.DARK_GRAY);
		b34.setFont(ff);
		p.add(b34);
        b34.addActionListener(this);
         
        tf21=new TextField(15);
		tf21.setBounds(800,550,200,30);
		tf21.setBackground(Color.LIGHT_GRAY);
		tf21.setForeground(Color.GRAY);
		tf21.setFont(ff);
		p.add(tf21);
         
        b35=new Button("floor");
		b35.setBounds(1050,550,40,30);
		b35.setBackground(Color.LIGHT_GRAY);
		b35.setForeground(Color.DARK_GRAY);
		b35.setFont(ff);
		p.add(b35);
        b35.addActionListener(this);
         
        tf22=new TextField(15);
		tf22.setBounds(1100,550,200,30);
		tf22.setBackground(Color.LIGHT_GRAY);
		tf22.setForeground(Color.GRAY);
		tf22.setFont(ff);
		p.add(tf22);
         
         b36=new Button("sqrt");
		b36.setBounds(750,600,40,30);
		b36.setBackground(Color.LIGHT_GRAY);
		b36.setForeground(Color.DARK_GRAY);
		b36.setFont(ff);
		p.add(b36);
        b36.addActionListener(this);
         
        tf23=new TextField(15);
		tf23.setBounds(800,600,200,30);
		tf23.setBackground(Color.LIGHT_GRAY);
		tf23.setForeground(Color.GRAY);
		tf23.setFont(ff);
		p.add(tf23);
         
        b37=new Button("cbrt");
		b37.setBounds(1050,600,40,30);
		b37.setBackground(Color.LIGHT_GRAY);
		b37.setForeground(Color.DARK_GRAY);
		b37.setFont(ff);
		p.add(b37);
        b37.addActionListener(this);
         
        tf24=new TextField(15);
		tf24.setBounds(1100,600,200,30);
		tf24.setBackground(Color.LIGHT_GRAY);
		tf24.setForeground(Color.GRAY);
		tf24.setFont(ff);
		p.add(tf24);
         
        b38=new Button("clear");
		b38.setBounds(1000,650,50,30);
		b38.setBackground(Color.LIGHT_GRAY);
		b38.setForeground(Color.DARK_GRAY);
		b38.setFont(ff);
		p.add(b38);
        b38.addActionListener(this);
         }
    public void actionPerformed(ActionEvent ae) // Function defined to implement ActionListener
{
        //**********CODE FOR ARITHMATIC OPEARTIONS******************
        
		if(ae.getSource()==b1)
		{
			String data1=tf1.getText();
			int d=Integer.parseInt(data1);
			
			String data2=tf2.getText();
			int d1=Integer.parseInt(data2);

			int sum=d+d1;

			String k=Integer.toString(sum);
			tf3.setText(k);
		}

		if(ae.getSource()==b2)
		{
			String data1=tf1.getText();
			int d=Integer.parseInt(data1);
			
			String data2=tf2.getText();
			int d1=Integer.parseInt(data2);

			int sub=d-d1;

			String k=Integer.toString(sub);
			tf3.setText(k);
		}
		if(ae.getSource()==b3)
		{
			String data1=tf1.getText();
			int d=Integer.parseInt(data1);
			
			String data2=tf2.getText();
			int d1=Integer.parseInt(data2);

			int mul=d*d1;

			String k=Integer.toString(mul);
			tf3.setText(k);
		}

		if(ae.getSource()==b4)
		{
			String data1=tf1.getText();
			int d=Integer.parseInt(data1);
			
			String data2=tf2.getText();
			int d1=Integer.parseInt(data2);

			int div=d/d1;

			String k=Integer.toString(div);
			tf3.setText(k);
		}
		
		if(ae.getSource()==b5)
		{
			String data1=tf1.getText();
			int d=Integer.parseInt(data1);
			
			String data2=tf2.getText();
			int d1=Integer.parseInt(data2);

			int mod=d%d1;

			String k=Integer.toString(mod);
			tf3.setText(k);
		}
        //***********CODE FOR GST CALCULATOR********
        
         if(ae.getSource()==b7)
		{
            
			String data1=tf4.getText();
			float d=Float.parseFloat(data1);
			

			float gst=((float)0.05*d);
			String tstr=Float.toString(gst);
           
			tf5.setText(tstr); 
		}
         if(ae.getSource()==b8)
		{
            
			String data1=tf4.getText();
			float d=Float.parseFloat(data1);
			

			float gst=((float)0.08*d);
			String tstr=Float.toString(gst);
           
			tf5.setText(tstr); 
		}
           if(ae.getSource()==b9)
		{
            
			String data1=tf4.getText();
			float d=Float.parseFloat(data1);
			

			float gst=((float)0.12*d);
			String tstr=Float.toString(gst);
           
			tf5.setText(tstr); 
		}
           if(ae.getSource()==b10)
		{
            
			String data1=tf4.getText();
			float d=Float.parseFloat(data1);
			

			float gst=((float)0.18*d);
			String tstr=Float.toString(gst);
           
			tf5.setText(tstr); 
		}
           if(ae.getSource()==b11)
		{
            
			String data1=tf4.getText();
			float d=Float.parseFloat(data1);
			

			float gst=((float)0.28*d);
			String tstr=Float.toString(gst);
           
			tf5.setText(tstr); 
		}
        
        //***************CODE FOR CURRENCCY CONVERTOR*********************
            
        if(ae.getSource()==b12)
		{
		String data1=tf6.getText();
		int d=Integer.parseInt(data1);

		String data2=tf7.getText();
		int d1=Integer.parseInt(data2);
	
		int interest=(d*8*d1)/100;

		String a=Integer.toString(interest);
		tf8.setText(a);
		}
        if(ae.getSource()==b13)
		{
			String data1=tf9.getText();
			double d=Double.parseDouble(data1);
	
			double ans=d*49.87;
			String a=Double.toString(ans);
	
			tf10.setText(a);
		}
         if(ae.getSource()==b14)
		{
			String data1=tf9.getText();
			double d=Double.parseDouble(data1);   
	
			double ans=d*90.73;
			String a=Double.toString(ans);
	
			tf10.setText(a);
		}
          if(ae.getSource()==b15)
		{
			String data1=tf9.getText();
			double d=Double.parseDouble(data1);
	
			double ans=d*52.06;
			String a=Double.toString(ans);
	
			tf10.setText(a);
		}
         if(ae.getSource()==b16)
		{
			String data1=tf9.getText();
			double d=Double.parseDouble(data1);
	
			double ans=d*10.36;
			String a=Double.toString(ans);
	
			tf10.setText(a);
		}
         if(ae.getSource()==b17)
		{
			String data1=tf9.getText();
			double d=Double.parseDouble(data1);
	
			double ans=d*78.45;
			String a=Double.toString(ans);
	
			tf10.setText(a);
		}
         if(ae.getSource()==b18)
		{
			String data1=tf9.getText();
			double d=Double.parseDouble(data1);
	
			double ans=d*0.62;
			String a=Double.toString(ans);
	
			tf10.setText(a);
		}
         if(ae.getSource()==b19)
		{
			String data1=tf9.getText();
			double d=Double.parseDouble(data1);
	
			double ans=d*228.57;
			String a=Double.toString(ans);
	
			tf10.setText(a);
		}
         if(ae.getSource()==b20)
		{
			String data1=tf9.getText();
			double d=Double.parseDouble(data1);
	
			double ans=d*69.355;
			String a=Double.toString(ans);
	
			tf10.setText(a);
         }
        
        //***************CODE FOR TRIGONOMETRIC FUNCTIONS******************
        if(ae.getSource()==b21)
		{
			String degrees=tf11.getText();
			double d=Integer.parseInt(degrees);
            
            double radians=Math.toRadians(d);
			
			double sinValue=Math.sin(radians);

			String k=Double.toString(sinValue);
			tf12.setText(k);
		}
        if(ae.getSource()==b22)
		{
			String degrees=tf11.getText();
			double d=Integer.parseInt(degrees);
            
            double radians=Math.toRadians(d);
			
			double sinValue=Math.sin(radians);
            double cosecValue=1/sinValue;

			String k=Double.toString(cosecValue);
			tf13.setText(k);
		}
        if(ae.getSource()==b23)
		{
			String degrees=tf11.getText();
			double d=Integer.parseInt(degrees);
            
            double radians=Math.toRadians(d);
			
			double cosValue=Math.cos(radians);

			String k=Double.toString(cosValue);
			tf14.setText(k);
		}
        if(ae.getSource()==b24)
		{
			String degrees=tf11.getText();
			double d=Integer.parseInt(degrees);
            
            double radians=Math.toRadians(d);
			
			double cosValue=Math.cos(radians);
             double secValue=1/cosValue;
            
			String k=Double.toString(secValue);
			tf15.setText(k);
		}
        if(ae.getSource()==b25)
		{
			String degrees=tf11.getText();
			double d=Integer.parseInt(degrees);
            
            double radians=Math.toRadians(d);
			
			double tanValue=Math.tan(radians);

			String k=Double.toString(tanValue);
			tf16.setText(k);
		}
        if(ae.getSource()==b26)
		{
			String degrees=tf11.getText();
			double d=Integer.parseInt(degrees);
            
            double radians=Math.toRadians(d);
			
			double tanValue=Math.tan(radians);
            double cotValue=1/tanValue;

			String k=Double.toString(cotValue);
			tf17.setText(k);
		}
        //**************CODE FOR OTHER MATHS AND CS FUNCTIONS*****************
              
		if(ae.getSource()==b32)
		{
			String data1=tf18.getText();
			double d=Double.parseDouble(data1);
			Double logval=Math.log(d);
            String k=Double.toString(logval);
			tf19.setText(k);
		}
        if(ae.getSource()==b33)
		{
			String data1=tf18.getText();
			double d=Double.parseDouble(data1);
			Double expval=Math.exp(d);
            String k=Double.toString(expval);
			tf20.setText(k);
		}
        if(ae.getSource()==b34)
		{
			String data1=tf18.getText();
			double d=Double.parseDouble(data1);
			Double ceilval=Math.ceil(d);
            String k=Double.toString(ceilval);
			tf21.setText(k);
		}
        if(ae.getSource()==b35)
		{
			String data1=tf18.getText();
			double d=Double.parseDouble(data1);
			Double floorval=Math.floor(d);
            String k=Double.toString(floorval);
			tf22.setText(k);
		}
        if(ae.getSource()==b36)
		{
			String data1=tf18.getText();
			double d=Double.parseDouble(data1);
			Double sqrtval=Math.sqrt(d);
            String k=Double.toString(sqrtval);
			tf23.setText(k);
		}
        if(ae.getSource()==b37)
		{
			String data1=tf18.getText();
			double d=Double.parseDouble(data1);
			Double cbrtval=Math.cbrt(d);
            String k=Double.toString(cbrtval);
			tf24.setText(k);
		}
        
        
        //**************CODE TO CLEAR TEXTFILEDS***************
           if(ae.getSource()==b27)
		{
               tf11.setText("");
			   tf12.setText("");
               tf13.setText("");
               tf14.setText("");
               tf15.setText("");
               tf16.setText("");
               tf17.setText("");
		}
        if(ae.getSource()==b28)
        {
            tf9.setText("");
            tf10.setText("");
        }
        if(ae.getSource()==b29)
        {
            tf5.setText("");
            tf4.setText("");
        }
        if(ae.getSource()==b30)
        {
            tf6.setText("");
            tf7.setText("");
            tf8.setText("");
        }
         if(ae.getSource()==b31)
        {
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
        }
        if(ae.getSource()==b38)
        {
            tf18.setText("");
            tf19.setText("");
            tf20.setText("");
            tf21.setText("");
            tf22.setText("");
            tf23.setText("");
            tf24.setText("");
        }
 }
        
public static void main(String a[]) // Object created in main
{
	calculate c=new calculate();
}

}

		