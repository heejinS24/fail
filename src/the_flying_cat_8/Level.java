package the_flying_cat_8;

public class Level {
	
	private String titleImage; // ����κ��̹���
	private String startImage; // ���Ӽ��� â ǥ�� �̹���
	private String gameImage; // �ش� ���� �������� �� ǥ�� �̹���
	public String getTitleImage() {
		return titleImage;
	}
	public void setTitleImage(String titleImage) {
		this.titleImage = titleImage;
	}
	public String getStartImage() {
		return startImage;
	}
	public void setStartImage(String startImage) {
		this.startImage = startImage;
	}
	public String getGameImage() {
		return gameImage;
	}
	public void setGameImage(String gameImage) {
		this.gameImage = gameImage;
	}
	public Level(String titleImage, String startImage, String gameImage) {
		super();
		this.titleImage = titleImage;
		this.startImage = startImage;
		this.gameImage = gameImage;
	}
	
	
}
