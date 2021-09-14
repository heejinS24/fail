package the_flying_cat_11;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Bar {
	ImageIcon barImage = new ImageIcon(Main.class.getResource("../image/bar.png")); // �� �̹��� �߰�
	JLabel k = new JLabel(); // ��.. ���̹����� �������� ������ ���?
	
	Bar(){
		 k.setIcon(barImage);
		 k.setLocation(50, 50);
		 k.setSize(230, 30);
		  
		 add(k);
		 
		 new KeyAdapter()
		  { 
		   public void keyPressed(KeyEvent e){
		    switch(e.getKeyCode()){
		     case KeyEvent.VK_LEFT:
		      k.setLocation(k.getX()-20, k.getY());
		      break;
		     case KeyEvent.VK_RIGHT:
		      k.setLocation(k.getX()+20, k.getY());
		      break;
		   }
		  }
		  });
		  
		   
		  this.setVisible(true);  
		 }
	}
}
