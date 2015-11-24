/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timertest;

/**
 *
 * @author Dennis
 */
public class Start {
    
    private static TimerTest timerTest;
    private static TestTimer testTimer = new TestTimer();
    
    
    public static void main(String[] args) {
        startGame();
        timerTest = new TimerTest();
        timerTest.setVisible(true);
        testTimer.theTimer(timerTest.getJBar1(),300,300);
        
        
       
    }
    
    public static void startGame(){
        
        
    };
}
