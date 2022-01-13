import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

 class menuDemo{
    menuDemo(){
        JFrame f=new JFrame("menu sample");
        f.setLayout(new GridLayout(5,1));
        JMenuBar menubar=new JMenuBar();
        JMenu m1=new JMenu();
        m1.setText("File");
        menubar.add(m1);
        JMenu m2=new JMenu();
        m2.setText("Edit");
        menubar.add(m2);
        JMenu m3=new JMenu();
        m3.setText("View");
        menubar.add(m3);
        JMenu m4=new JMenu();
        m4.setText("Open");
        menubar.add(m4);
        JMenu i1= new JMenu();//menu for the text and folder
        i1.setText("New");
        m1.add(i1);
         JMenuItem si1=new JMenuItem();
         si1.setText("text");
          i1.add(si1);
         JMenuItem si2=new JMenuItem();
         si2.setText("Folder");
          i1.add(si2);
         JMenuItem i2= new JMenuItem();
        i2.setText("save");
        m1.add(i2);
        JMenuItem i3= new JMenuItem();
        i3.setText("Close");
        m1.add(i3);
       JMenuItem view1=new JMenuItem();
       view1.setText("Window");
       m3.add(view1);
       JMenuItem view2=new JMenuItem();
       view2.setText("Panel");

       f.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
       JPopupMenu pm= new JPopupMenu();
       JMenu file=new JMenu();
       file.setText("File");
       pm.add(file);
       JMenu edit=new JMenu();
      edit.setText("Edit");
       pm.add(edit);
       JMenu view=new JMenu();
       view.setText("View");
       pm.add(view);
       JMenu open=new JMenu();
       open.setText("Open");
       pm.add(open);
       JMenu new1=new JMenu();
       new1.setText("New");
       file.add(new1);
       JMenuItem save=new JMenuItem();
       save.setText("Save");
       file.add(save);
       JMenuItem close=new JMenuItem();
       close.setText("Close");
       file.add(close);
       JMenuItem text=new JMenuItem();
       text.setText("Text");
       new1.add(text);
       JMenuItem folder=new JMenuItem();
       folder.setText("Folder");
       new1.add(folder);
       JMenuItem window=new JMenuItem();
       window.setText("Window");
       view.add(window);
       JMenuItem panel=new JMenuItem();
       panel.setText("Panel");
       view.add(panel);
       if (SwingUtilities.isRightMouseButton(e)){
        pm.show(f, e.getX(), e.getY());
        pm.setVisible(true);

    }

    if (SwingUtilities.isLeftMouseButton(e)){
       pm.setVisible(false);
   }        
}   
});  
m4.addMouseListener(new MouseAdapter() {
    public void mouseClicked(MouseEvent e) {
JDialog d=new JDialog(f,"Dialog box",true);

    JOptionPane.showMessageDialog(menubar,"are you sure to open.");
    d.setVisible(true);
}
});  
     

       m3.add(view2);
       f.add(menubar);
       f.setVisible(true);
       f.setSize(200,200);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
    public static void main(String[] args) {
        new menuDemo();
    }
}