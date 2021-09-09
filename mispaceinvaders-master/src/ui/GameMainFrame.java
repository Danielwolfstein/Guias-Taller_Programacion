package ui;

import constants.Constants;
import image.Image;
import image.ImageFactory;

import javax.swing.JFrame;

public class GameMainFrame extends JFrame {

  public GameMainFrame() {
    initializeLayout();
  }

  private void initializeLayout() {
    this.add(new GamePanel());
    this.setTitle(Constants.TITLE);
    this.setIconImage(ImageFactory.createImage(Image.BACKGROUND).getImage());
    this.pack();
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    this.setResizable(false);
    this.setVisible(true);
  }
}
