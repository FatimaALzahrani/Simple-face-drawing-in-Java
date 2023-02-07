# Simple face drawing in Java
Just play and practice the computer graphic test :)

## To draw first smile face 
### Code
#### write this code in paint method
##      
        g.setColor(Color.yellow);
        g.drawArc(100,100,250,250,0,360);
        g.fillArc(100,100,250,250,0,360);
        g.setColor(Color.black);
        g.drawArc(170,185,25,25,0,360);
        g.fillArc(170,185,25,25,0,360);
        g.drawArc(255,185,25,25,0,360);
        g.fillArc(255,185,25,25,0,360);
        g.drawArc(150,215,150,100,0,-180);
           
### Output
<img width="125" alt="face1" src="https://user-images.githubusercontent.com/107775566/217241656-f5ff4175-bd15-4a2f-9160-d0fc87a3b2ac.png">


## To draw Second smile face 
### Code
#### write this code in paint method
`  g.drawArc(430,240,150,100,0,-180);
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
        g.drawArc(180, 210, 40, 40, -80, 130);`
        
### Output
<img width="133" alt="face2" src="https://user-images.githubusercontent.com/107775566/217241691-a928c13e-083e-41b7-820b-ad01bc3cad07.png">


