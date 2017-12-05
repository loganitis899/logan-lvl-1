void setup(){
size(1000,750);
background(0,0,0);
}
int ballX=500;
int ballY=375;
int speedX=10;
int speedY=10;
void draw(){
 background(0,0,0);
 ellipse(ballX,ballY,20,20);
 fill(255,255,255);

 ballX=ballX+speedX;
 ballY=ballY+speedY;
 stayIn();
}
void stayIn(){
 if(ballX>=1000 || ballX<=0){
    speedX=-speedX;
 }
 
 if(ballY>=750 || ballY<=0){
   speedY=-speedY;
 }

}