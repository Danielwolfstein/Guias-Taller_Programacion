package model;

import constants.Constants;
import image.Image;
import image.ImageFactory;
import javax.swing.ImageIcon;

public class Bomb extends Sprite {

  public Bomb(int x, int y) {
    this.x = x + Constants.ENEMY_SHIP_WIDTH / 2;
    this.y = y + Constants.ENEMY_SHIP_HEIGHT;
    initialize();
  }

  private void initialize() {
    ImageIcon imageIcon = ImageFactory.createImage(Image.BOMB);
    setImage(imageIcon.getImage());
  }

  @Override
  public void move() {
    this.y += 5;
    // Checking constraint (botton of the canvas)
    if (y >= Constants.BOARD_HEIGHT - Constants.BOMB_HEIGHT) {
      die();
    }
  }
}
