import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
 
// An AWT GUI program inherits the top-level container java.awt.Frame
public class MouseEventDemo extends Frame implements MouseListener {
      // This class acts as MouseListener
 
   // To display the (x, y) coordinates of the mouse-clicked
   private TextField tfMouseClickX;
   private TextField tfMouseClickY;
 
   /** Constructor to setup the GUI */
   public MouseEventDemo() {
      setLayout(new FlowLayout()); // "this" frame sets to FlowLayout
 
      add(new Label("X-Click: ")); // "this" frame adds an anonymous Label
      tfMouseClickX = new TextField(10); // allocate TextField
      tfMouseClickX.setEditable(false);  // read-only
      add(tfMouseClickX); // "this" frame adds component
 
      add(new Label("Y-Click: ")); // "this" frame adds an anonymous Label
      tfMouseClickY = new TextField(10); // allocate TextField
      tfMouseClickY.setEditable(false);  // read-only
      add(tfMouseClickY); // "this" frame adds component
 
      addMouseListener(this);
          // "this" frame fires the MouseEvent to all its registered MouseListener
          // "this" frame adds "this" object as a MouseListener
 
      setTitle("MouseEvent Demo"); // "this" Frame sets title
      setSize(350, 100);      // "this" Frame sets initial size
      setVisible(true);       // "this" Frame shows
   }
 
   /** The entry main() method */
   public static void main(String[] args) {
      new MouseEventDemo();  // Let the constructor do the job
   }
 
   /** MouseEvent handlers */
   // Called back when a mouse-button has been clicked
   @Override
   public void mouseClicked(MouseEvent e) {
      tfMouseClickX.setText(e.getX() + "");
      tfMouseClickY.setText(e.getY() + "");
   }
 
   // Not Used, but need to provide an empty body for compilation
   @Override
   public void mousePressed(MouseEvent e) { }
   @Override
   public void mouseReleased(MouseEvent e) { }
   @Override
   public void mouseEntered(MouseEvent e) { }
   @Override
   public void mouseExited(MouseEvent e) { }
}