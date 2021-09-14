package the_flying_cat_11;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Bar {
	ImageIcon barImage = new ImageIcon(Main.class.getResource("../image/bar.png")); // 바 이미지 추가
	JLabel k = new JLabel(); // 음.. 바이미지의 실질적인 움직임 담당?
	
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
