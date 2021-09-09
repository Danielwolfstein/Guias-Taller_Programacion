package app;

import ui.GameMainFrame;
import java.awt.EventQueue;

public class App {

  public static void main(String[] args) {
    EventQueue.invokeLater(GameMainFrame::new);
  }
}
