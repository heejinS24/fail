package the_flying_cat_1;


import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class TheFlyingCat extends JFrame{
	
	private Image screenImage;
	private Graphics screenGraphic;
	private Image introBackground;
	
	public TheFlyingCat() {
		setTitle("TheFlyingCat");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);// ����� âũ�� ����Ұ�
		setLocationRelativeTo(null);// �߾ӹ�ġ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//��������� �������
		setVisible(true);//����â ���డ���ϰ���
		
		introBackground = new ImageIcon(Main.class.getResource("../images/introBackground.jpg")).getImage();
	}
	
	public void paint(Graphics g) {
		screenImage = createImage(Main.SCREEN_WIDTH,Main.SCREEN_HEIGHT);
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenImage, 0, 0, null);
	}
	
	public void screenDraw(Graphics g) {
		g.drawImage(introBackground, 0, 0, null);
		this.repaint();
	}
}
