package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import model.Snake;
import view.GameBoard;

public class KeyController implements KeyListener {

    private GameBoard gameBoard;
    private Snake snake;

    public KeyController(GameBoard gameBoard){
        this.gameBoard = gameBoard;
        this.snake = gameBoard.getSnake(); //reference variable for our snake object
    }


    @Override
    public void keyPressed(KeyEvent e) {
       int key = e.getKeyCode(); //gets the arrow key you pressed from the keyboard
       switch(key) {
           case KeyEvent.VK_LEFT: // hwo to check for left or right etc.
                snake.direction = Snake.Direction.LEFT;
                break;
           case KeyEvent.VK_RIGHT:
                snake.direction = Snake.Direction.RIGHT;
                break;
           case KeyEvent.VK_UP:
                snake.direction = Snake.Direction.UP;
                break;
           case KeyEvent.VK_DOWN:
                snake.direction = Snake.Direction.DOWN;
                break;
       }
    }
    @Override
    public void keyTyped(KeyEvent e) {}

  

    @Override
    public void keyReleased(KeyEvent e) {}
    
}
