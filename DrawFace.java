/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 12fat
 */
import javax.swing.*;
import java.awt.*;
public class DrawFace  extends JFrame{
    public DrawFace(){
        super("Draw Face");
        setSize(500,500);
        setVisible(true);
    }
    public void paint(Graphics g)    {
        super.paint(g);
        //face 1
        g.setColor(Color.yellow);
        g.drawArc(100,100,250,250,0,360);
        g.fillArc(100,100,250,250,0,360);
        g.setColor(Color.black);
        g.drawArc(170,185,25,25,0,360);
        g.fillArc(170,185,25,25,0,360);
        g.drawArc(255,185,25,25,0,360);
        g.fillArc(255,185,25,25,0,360);
        g.drawArc(150,215,150,100,0,-180);
        //face 2
        g.drawArc(430,240,150,100,0,-180);
        g.translate(300, 50);
        g.setColor(Color.red);
        g.fillArc(50, 50, 100, 100,0,90);
        g.fillArc(50, 50, 100, 100,270,-90);
        g.setColor(Color.black);
        g.draw3DRect(100, 100, 200, 200, rootPaneCheckingEnabled);    
        g.fillOval(140, 140, 50, 50);
        g.fillOval(220, 140, 50, 50);
        g.setColor(Color.white);
        g.fillOval(150, 150, 20, 20);
        g.fillOval(230, 150, 20, 20);
        g.setColor(Color.black);
        g.drawArc(180, 210, 40, 40, -80, 130);

    }
        public static void main(String args[]){
        DrawFace Fatimah=new DrawFace();
    }
}
