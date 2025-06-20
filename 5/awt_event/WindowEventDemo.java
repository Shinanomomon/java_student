import java.awt.*;        // using AWT containers and components
import java.awt.event.*;  // using AWT events and listener interfaces
 
// An AWT GUI program inherits the top-level container java.awt.Frame
public class WindowEventDemo extends Frame
      implements ActionListener, WindowListener {
      // This class acts as listener for ActionEvent and WindowEvent
      // Java support only single inheritance, where a class can extend
      // one superclass, but can implement multiple interfaces.
 
   private TextField tfCount;
   private int count = 0;  // Counter's value
 
   /** Constructor to setup the GUI */
   public WindowEventDemo () {
      setLayout(new FlowLayout()); // "this" Frame sets to FlowLayout
 
      add(new Label("Counter"));   // "this" Frame adds an anonymous Label
 
      tfCount = new TextField("0", 10); // allocate TextField
      tfCount.setEditable(false);       // read-only
      add(tfCount);                // "this" Frame adds tfCount
 
      Button btnCount = new Button("Count");  // declare and allocate a Button
      add(btnCount);               // "this" Frame adds btnCount
 
      btnCount.addActionListener(this);
        // btnCount fires ActionEvent to its registered ActionEvent listener
        // btnCount adds "this" object as an ActionEvent listener
      addWindowListener(this);
        // "this" Frame fires WindowEvent its registered WindowEvent listener
        // "this" Frame adds "this" object as a WindowEvent listener
 
      setTitle("WindowEvent Demo");  // "this" Frame sets title
      setSize(250, 100);        // "this" Frame sets initial size
      setVisible(true);         // "this" Frame shows
   }
 
   /** The entry main() method */
   public static void main(String[] args) {
      new WindowEventDemo();  // Let the construct do the job
   }
 
   /** ActionEvent handler */
   @Override
   public void actionPerformed(ActionEvent evt) {
      count++;
      tfCount.setText(count + "");
   }
 
   /** WindowEvent handlers */
   // Called back upon clicking close-window button
   @Override
   public void windowClosing(WindowEvent e) {
      System.exit(0);  // terminate the program
   }
 
   // Not Used, but need to provide an empty body for compilation
   @Override
   public void windowOpened(WindowEvent e) { }
   @Override
   public void windowClosed(WindowEvent e) { }
   @Override
   public void windowIconified(WindowEvent e) { }
   @Override
   public void windowDeiconified(WindowEvent e) { }
   @Override
   public void windowActivated(WindowEvent e) { }
   @Override
   public void windowDeactivated(WindowEvent e) { }
}