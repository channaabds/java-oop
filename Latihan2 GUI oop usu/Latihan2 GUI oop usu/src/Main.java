/*
Chapter 14 Sample Program: Displays a frame with two buttons 
and handles the button events
File: Ch14JButtonFrameHandler.java
*/
// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;
// class Ch14JButtonFrameHandler extends JFrame implements ActionListener {
// private static final int FRAME_WIDTH = 300;
// private static final int FRAME_HEIGHT = 200;
// private static final int FRAME_X_ORIGIN = 150;
// private static final int FRAME_Y_ORIGIN = 250;
// private JButton cancelButton;
// private JButton okButton;
// public static void main(String[] args) {
// Ch14JButtonFrameHandler frame = new Ch14JButtonFrameHandler();
// frame.setVisible(true);
// }
// public Ch14JButtonFrameHandler() {
// Container contentPane = getContentPane( );
// //set the frame properties
// setSize (FRAME_WIDTH, FRAME_HEIGHT);
// setResizable(false);
// setTitle ("Program Ch14JButtonFrameHandler");
// setLocation (FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
// //set the layout manager
// contentPane.setLayout(new FlowLayout());
// //create and place two buttons on the frame's content pane
// okButton = new JButton("OK");
// contentPane.add(okButton);
// cancelButton = new JButton("CANCEL");
// contentPane.add(cancelButton);
// //register this frame as an action listener of the two buttons
// cancelButton.addActionListener(this);
// okButton.addActionListener(this);
// //register 'Exit upon closing' as a default close operation
// setDefaultCloseOperation(EXIT_ON_CLOSE);
// }
// public void actionPerformed(ActionEvent event) {
// JButton clickedButton = (JButton) event.getSource();
// String buttonText = clickedButton.getText();
// setTitle("You clicked " + buttonText);
// }
// }

/*
Chapter 14 Sample Program: Displays a frame with two buttons 
and one text field
File: Ch14TextFrame1.java
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Ch14TextFrame1 extends JFrame implements ActionListener {
private static final int FRAME_WIDTH = 300;
private static final int FRAME_HEIGHT = 200;
private static final int FRAME_X_ORIGIN = 150;
private static final int FRAME_Y_ORIGIN = 250;
private JButton cancelButton;
private JButton okButton;
private JTextField inputLine;
public static void main(String[] args) {
Ch14TextFrame1 frame = new Ch14TextFrame1();
frame.setVisible(true);
}
public Ch14TextFrame1() {
Container contentPane;
//set the frame properties
setSize (FRAME_WIDTH, FRAME_HEIGHT);
setResizable(false);
setTitle ("Program Ch14SecondJFrame");
setLocation (FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
contentPane = getContentPane();
contentPane.setLayout( new FlowLayout());
inputLine = new JTextField( );
inputLine.setColumns(22);
contentPane.add(inputLine);
inputLine.addActionListener(this);
//create and place two buttons on the frame
okButton = new JButton ("OK");
contentPane.add(okButton);
cancelButton = new JButton ("CANCEL");
contentPane.add(cancelButton);
//register this frame as an action listener of the two buttons
cancelButton.addActionListener(this);
okButton.addActionListener(this);
//register 'Exit upon closing' as a default close operation
setDefaultCloseOperation(EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent event) {
if (event.getSource() instanceof JButton) {
JButton clickedButton = (JButton) event.getSource();
String buttonText = clickedButton.getText();
setTitle("You clicked " + buttonText);
} else { //the event source is inputLine
setTitle("You entered '" + inputLine.getText() + "'");
}
}
}