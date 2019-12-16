/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enterautomation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author farofa
 */
public class ThreadInput extends Thread{
    
    public boolean active = false;
    public int segundos = 0;
    
    public void run()
    {
        try {
            Thread.sleep(10000);
            
            Robot r = new Robot();
            
            while(this.active) {
                r.keyPress(KeyEvent.VK_ENTER);
                r.keyRelease(KeyEvent.VK_ENTER);
            
                Thread.sleep(this.segundos);
            }
        } 
        catch (AWTException ex) { } 
        catch (InterruptedException ex) { }
    }
}
