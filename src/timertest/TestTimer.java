package timertest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dennis
 */
public class TestTimer {
    
    private int countDown;
    private JProgressBar bar;
    private Timer timer;
    
     public TestTimer() {
//        new JFrame().setVisible(true);
//        this.bar = j;       
//        ActionListener actListner = new ActionListener(){
//            
//            @Override
//            public void actionPerformed(ActionEvent event){
//                countDown++;
//                
//                bar.setValue(countDown);
//                if (countDown>c){
//                    timer.stop();
//                }
//            }
//            
//        };
//        timer = new Timer(500, actListner);
//        timer.start();
    }
     
     public void theTimer(JProgressBar j, int c, int max){
        new JFrame().setVisible(true);
        this.bar = j;
        this.bar.setMaximum(max);
        ActionListener actListner = new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent event){
                countDown++;
                
                bar.setValue(countDown);
                if (countDown>max){
                   
                    timer.stop();
                }
            }
            
        };
       
        timer = new Timer(100, actListner);
        timer.start();
     }
     
   
}
