

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;




public class calculator implements ActionListener {

    boolean isOperatorClicked=false;
    String oldValue;
    String newValue;


    int flag=0;
    float result;


   public JFrame jf;
   public JLabel displaylabel;

    JButton equalButton;

    JButton sevenButton;
    JButton eightButton;
    JButton nineButton;

    JButton fourButton;
    JButton fiveButton;
    JButton sixButton;

    JButton oneButton;
    JButton twoButton;
    JButton threeButton;

    JButton zeroButton;
    JButton dotButton;
    JButton clearButton;

    JButton addButton;
    JButton minusButton;
    JButton multiButton;
    JButton divButton;
    

    
    public calculator()
    {
        jf=new JFrame();/*created jframe to create the frame */
        jf.setLayout(null);
        jf.setSize(400,500);
        jf.setLocation(600, 200);

        displaylabel=new JLabel();/*to create the display screen */
        displaylabel.setText("");/*to write text on the display */
        displaylabel.setBounds(8,10,370,100);/*to set the offset and dimension */
        jf.add(displaylabel);/*to add the display to the frame */
        displaylabel.setOpaque(true);/*it is initially false so we need to change the boolean */
        displaylabel.setBackground(Color.gray);/*to change the background color of display */
        displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);/*to align the text on the display to rightS */
        displaylabel.setForeground(Color.white);/*to change the font color */


        /*first row */

        sevenButton=new JButton("7");/*to create the button 7 */
        jf.add(sevenButton);/*to add button to the frame */
        sevenButton.setBounds(20,120,60,60);/*size and offset of the button */
        sevenButton.addActionListener(this);/*to get access to the button */

        eightButton=new JButton("8");
        jf.add(eightButton);
        eightButton.setBounds(100,120,60,60);
        eightButton.addActionListener(this);

        nineButton=new JButton("9");
        jf.add(nineButton);
        nineButton.setBounds(180,120,60,60);
        nineButton.addActionListener(this);

        /*second row */

        fourButton=new JButton("4");
        jf.add(fourButton);
        fourButton.setBounds(20, 200, 60, 60);
        fourButton.addActionListener(this);

        fiveButton=new JButton("5");
        jf.add(fiveButton);
        fiveButton.setBounds(100, 200, 60, 60);
        fiveButton.addActionListener(this);

        sixButton=new JButton("6");
        jf.add(sixButton);
        sixButton.setBounds(180, 200, 60, 60);
        sixButton.addActionListener(this);


        /*third row */

        oneButton=new JButton("1");
        jf.add(oneButton);
        oneButton.setBounds(20, 280, 60, 60);
        oneButton.addActionListener(this);

        twoButton=new JButton("2");
        jf.add(twoButton);
        twoButton.setBounds(100, 280, 60, 60);
        twoButton.addActionListener(this);

        threeButton=new JButton("3");
        jf.add(threeButton);
        threeButton.setBounds(180, 280, 60, 60);
        threeButton.addActionListener(this);



        /*fourth row */


        zeroButton=new JButton("0");
        jf.add(zeroButton);
        zeroButton.setBounds(20, 360, 60, 60);
        zeroButton.addActionListener(this);

        dotButton=new JButton(".");
        jf.add(dotButton);
        dotButton.setBounds(100, 360, 60, 60);
        dotButton.addActionListener(this);

        clearButton=new JButton("clr");
        jf.add(clearButton);
        clearButton.setBounds(180, 360, 60, 60);
        clearButton.addActionListener(this);

        /*operator column */

        addButton=new JButton("+");
        jf.add(addButton);
        addButton.setBounds(280,120,80,60);
        addButton.addActionListener(this);

        minusButton=new JButton("-");
        jf.add(minusButton);
        minusButton.setBounds(280,200,80,60);
        minusButton.addActionListener(this);

        multiButton=new JButton("*");
        jf.add(multiButton);
        multiButton.setBounds(280,280,80,60);
        multiButton.addActionListener(this);

        divButton=new JButton("/");
        jf.add(divButton);
        divButton.setBounds(280,360,80,60);
        divButton.addActionListener(this);


        equalButton= new JButton("=");
        jf.add(equalButton);
        equalButton.setBounds(80,425,200,30);
        equalButton.addActionListener(this);



        jf.setVisible(true);/*to make it visible */
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);/*to exit the program when the application is closed */

    }


    public static void main (String [] args)
    {
        new calculator();

        
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==sevenButton)
        {
            if(isOperatorClicked)
            {
                displaylabel.setText("7");
                isOperatorClicked=false;
            }
            else
            {
                displaylabel.setText(displaylabel.getText()+"7");     
            }
        }



         if(e.getSource()==eightButton)
        {
            if(isOperatorClicked)
            {
                displaylabel.setText("8");
                isOperatorClicked=false;
            }
            else
            {
                displaylabel.setText(displaylabel.getText()+"8");
            }
        }
        
        
        if(e.getSource()==nineButton)
        {
            if(isOperatorClicked)
            {
                displaylabel.setText("9");
                isOperatorClicked=false;
            }
            else
            {
                displaylabel.setText(displaylabel.getText()+"9");
            }
        }
            
        
        
        
        if(e.getSource()==fourButton)
        {
            if(isOperatorClicked)
            {
                displaylabel.setText("4");
                isOperatorClicked=false;
            }
            else
            {
                displaylabel.setText(displaylabel.getText()+"4");
            }
        }



        if(e.getSource()==fiveButton)
        {
            if(isOperatorClicked)
            {
                displaylabel.setText("5");
                isOperatorClicked=false;
            }
            else
            {
                displaylabel.setText(displaylabel.getText()+"5");
            }
        }



        if(e.getSource()==sixButton)
        {
            if(isOperatorClicked)
            {
                displaylabel.setText("6");
                isOperatorClicked=false;
            }
            else
            {
                displaylabel.setText(displaylabel.getText()+"6");
            }
        }



        if(e.getSource()==oneButton)
        {
            if(isOperatorClicked)
            {
                displaylabel.setText("1");
                isOperatorClicked=false;
            }
            else
            {
                displaylabel.setText(displaylabel.getText()+"1");
            }
        }



        if(e.getSource()==twoButton)
        {
            if(isOperatorClicked)
            {
                displaylabel.setText("2");
                isOperatorClicked=false;
            }
            else
            {
                displaylabel.setText(displaylabel.getText()+"2");
            }
        }



        if(e.getSource()==threeButton)
        {
            if(isOperatorClicked)
            {
                displaylabel.setText("3");
                isOperatorClicked=false;
            }
            else
            {
                displaylabel.setText(displaylabel.getText()+"3");
            }
        }



        if(e.getSource()==zeroButton)
        {
            if(isOperatorClicked)
            {
                displaylabel.setText("0");
                isOperatorClicked=false;
            }
            else
            {
                displaylabel.setText(displaylabel.getText()+"0");
            }
        }




        if(e.getSource()==dotButton)
        {
            if(isOperatorClicked)
            {
                displaylabel.setText(".");
                isOperatorClicked=false;
            }
            else
            {
            displaylabel.setText(displaylabel.getText()+".");
        }
        }



        else if(e.getSource()==clearButton)
        {
            displaylabel.setText("");
        }else if(e.getSource()==addButton)
        {
            
            oldValue=displaylabel.getText();
              displaylabel.setText("");
             isOperatorClicked=true;
             flag=1;
        }
        else if(e.getSource()==equalButton)
        {
            
            newValue=displaylabel.getText();
            float oldValuef=Float.parseFloat(oldValue); /*to convert the string into float type,to conver float to string just write it and the add "+" and open a brace */
            float newValuef=Float.parseFloat(newValue);
            isOperatorClicked=true;
            if(flag==1)
            {
                 result=oldValuef+newValuef;
                 
            }
            else if(flag==2)
            {
                 result=oldValuef-newValuef;
            }
            else if(flag==3)
            {
                 result=oldValuef*newValuef;
            }
            else if(flag==4)
            {
                 result=oldValuef/newValuef;
            }
        

            displaylabel.setText(result+"");
        }
        else if(e.getSource()==minusButton)
        {
            oldValue=displaylabel.getText();
              displaylabel.setText("");
             isOperatorClicked=true;
             flag=2;
        }

        else if(e.getSource()==multiButton)
        {
            oldValue=displaylabel.getText();
              displaylabel.setText("");
             isOperatorClicked=true;
             flag=3;
        }
        else if(e.getSource()==divButton)
        {
            oldValue=displaylabel.getText();
              displaylabel.setText("");
             isOperatorClicked=true;
             flag=4;
        }
       
    

       

    }
}
