package uml_class_diagram;

import java.awt.Container;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Open source for Displaying the created UML Class Diagram
 * 
 * @author http://zetcode.com/java/displayimage/
 *
 */
public class DisplayImage extends JFrame {

   public DisplayImage() {

      initUI();
   }

   private void initUI() {

      ImageIcon ii = loadImage();

      JLabel label = new JLabel(ii);

      createLayout(label);

      setTitle("UML Class Diagram Example");
      setLocationRelativeTo(null);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
   }

   private ImageIcon loadImage() {

      ImageIcon ii = new ImageIcon("images/uml_class_diagram_example.jpg");
      return ii;
   }

   private void createLayout(JComponent... arg) {

      Container pane = getContentPane();
      GroupLayout gl = new GroupLayout(pane);
      pane.setLayout(gl);

      gl.setAutoCreateContainerGaps(true);

      gl.setHorizontalGroup(gl.createSequentialGroup().addComponent(arg[0]));

      gl.setVerticalGroup(gl.createParallelGroup().addComponent(arg[0]));

      pack();
   }

}
