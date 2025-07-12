package supermarket;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public abstract class Pag_Princ  extends JFrame implements ActionListener{
   private JMenuBar mb;
    private JMenu menu1;
    private JMenuItem mi1, mi2, mi3, mi4, mi5, mi6;
    
    public Pag_Princ(){
    setLayout (null);
    mb= new JMenuBar();
    setJMenuBar(mb);
    menu1= new JMenu ("Opciones");
    mb.add(menu1);
    
    mi1= new JMenuItem ("Menú");
    mb.add(mi1);
    mi1.addActionListener(this);
    
    mi2= new JMenuItem ("Clientes");
    mb.add(mi2);
    mi2.addActionListener(this);
    
    mi3= new JMenuItem ("Productos");
    menu1.add(mi3);
    mi3.addActionListener(this);
    
    mi4= new JMenuItem ("Clientes Premium");
    menu1.add(mi4);
    mi4.addActionListener(this);
    
    mi5= new JMenuItem ("Facturación");
    menu1.add(mi5);
    mi5.addActionListener(this);
    
    mi6= new JMenuItem ("Configuraciones");
    menu1.add(mi6);
    mi6.addActionListener(this);
    }

public static void main(String[] args) {
       Formulario2 formulario2 = new Formulario2 ();
        formulario2.setVisible(true); 
    }
   
 public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==mi1){
           setSize (640,480);
           }
           if (ae.getSource()==mi3){
               getContentPane().setBackground(new Color (255,0,0));
           }
           if (ae.getSource()==mi4){
               getContentPane().setBackground(new Color (0,255,0));
           }
 }

   
         
}