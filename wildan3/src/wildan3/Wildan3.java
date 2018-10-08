package wildan;

import javax.swing.JOptionPane;

public class Wildan3 
{
     public static void main(String[] args) 
     {
int a;
int b;
int c;
int rata;

a= Integer.parseInt(JOptionPane.showInputDialog("data1"));
b= Integer.parseInt(JOptionPane.showInputDialog("data2"));
c= Integer.parseInt(JOptionPane.showInputDialog("data3"));

rata=(a+b+c)/3;

String msg="data1="+a+"\n"
        +"data2="+b+"\n"+"data3="+c+"\n"+"rata rata="+rata;

JOptionPane.showMessageDialog(null, msg);
     
    }
}