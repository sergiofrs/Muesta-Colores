
package muestracolores;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MuestraColores  extends JFrame 
{
private JButton cambiaColor;
private Color color=Color.lightGray;
private Container c;
public MuestraColores()
{
    super("Utilizando JColorChooser"); 
    c=getContentPane();
    c.setLayout(new FlowLayout());
    cambiaColor=new JButton("Cambia de Color ");
    cambiaColor.addActionListener(
            new ActionListener() 
            {
                public void actionPerformed (ActionEvent e)
                {
                    color=JColorChooser.showDialog(MuestraColores.this,"Elige color",color);
                    if (color==null)
                        color=Color.lightGray;
                        c.setBackground(color);
                        c.repaint();
                        }
            }
    );
c.add(cambiaColor);
setSize(400,130);
show();
}
    public static void main(String args[]) 
    {
        MuestraColores app=new MuestraColores();
        app.addWindowListener(
                new WindowAdapter()
                {
                    public void windowClosing(WindowEvent e)
                    {
                        System.exit(0);
                    }
                }
                );
    }
    
}
