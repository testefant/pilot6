import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class KeyListenerFrame extends JFrame implements KeyListener {

	public KeyListenerFrame() {
//		JTextField typingArea = new JTextField(20);
//        typingArea.addKeyListener(this);
//		add(typingArea);
		addKeyListener(this);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,300);
		setTitle("press");
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeyListenerFrame k = new KeyListenerFrame();
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println(arg0.getExtendedKeyCode());
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println(arg0.getExtendedKeyCode());
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println(arg0.getExtendedKeyCode());
	}

}
