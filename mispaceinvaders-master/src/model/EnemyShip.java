package model;

import image.Image;
import image.ImageFactory;
import javax.swing.ImageIcon;

public class EnemyShip extends Sprite{
  
  private boolean visible = true;

  public EnemyShip(int x, int y) {
    this.x = x;
    this.y = y;
    initialize();
  }

  private void initialize() {
    ImageIcon imageIcon = ImageFactory.createImage(Image.UFO);
    setImage(imageIcon.getImage());
  }

  public boolean isVisible() {
    return visible;
  }

  public void setVisible(boolean visible) {
    this.visible = visible;
  }

  public void move(int direction){
    this.x += direction;
    
  }
  
  @Override
  public void move() {
     
  }
  
}
