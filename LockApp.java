// Import required packages

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LockApp extends JFrame 
{
   JButton[] btn;  
   JButton btncl, btnen;
   JTextField tf;
   JPanel pd,pb;

   String nums=" ",msg=" ",pin="12345";
 

   public LockApp( ) 
  {
	// Create it
      pd = new JPanel(new FlowLayout());
      tf = new JTextField();
      //tf.setHorizontalAlignment(JTextField.RIGHT);
      pd.add(tf);
       pb = new JPanel(new GridLayout(4, 3));
       btn = new JButton[10];  

    for(int i=0;i<=9;i++)
   {
      btn[i] = new JButton(Integer.toString(i));  // Construct JButton "1"
      pb.add(btn[i]);  // The Panel adds this JButton
   }
      btncl = new JButton("Clear");
      pb.add(btncl);
     
      pb.add(btn[0]);
      
    btnen = new JButton("Enter");
      pb.add(btnen);

  for(int n=0;n<=9;n++)
  {
      btn[n].addActionListener(new BtnListener1());
  }
   
      btncl.addActionListener(new BtnListener2());
      btnen.addActionListener(new BtnListener2());

      setLayout(new BorderLayout());  
      add(pd, BorderLayout.NORTH);
      add(pb, BorderLayout.CENTER);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setTitle("BorderLayout Demo"); 
      setSize(450, 400);            
      setVisible(true);            
   }
 
     public static void main(String[] args) 
{
      new LockApp();  
 }

private class BtnListener1 implements ActionListener 
{
  public void actionPerformed(ActionEvent evt) 
    {
         nums += evt.getActionCommand();
         msg+="*";
         tf.setText(msg);
     }
   }

private class BtnListener2 implements ActionListener 
{
      public void actionPerformed(ActionEvent evt) 
    {
         if(evt.getSource()==btncl)
         {
            tf.setText("CLOSE");
            nums="";
            msg="";
         }
        else if(evt.getSource()==btnen)
         {
             if(checkPIN(nums))
                    unlock();
               else
                    lock();
         }
     }

public boolean checkPIN(String p)
    {
           if (p.equals(pin))
                    return true;
           else 
                   return false;
    }

   public void unlock( )
 {
        tf.setText("OPEN");
 }

   public void lock( )
 {
        tf.setText("WRONG PIN");
 }

   }

}
  	
