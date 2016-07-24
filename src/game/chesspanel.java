package game;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class chesspanel extends JFrame implements ActionListener {
	
	//电脑屏幕
	int width = Toolkit.getDefaultToolkit().getScreenSize().width;
    int height = Toolkit.getDefaultToolkit().getScreenSize().height;
	
     public void chessframe(){
    	 
    	 //游戏名字
    	 setTitle("puissance 5");
    	 
    	 //窗口大小不可变，窗口大小设置，窗口出现位置
    	 setResizable(false);
    	 setSize(500,500);
    	 setLocation((width-500)/2,(height-500)/2);
    	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	 setVisible(true);
    
     }
      
    
    
    
    
    
    public static void main(String[] args) {
	
    
	}







	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
