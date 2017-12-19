PImage backgroundImage;
void setup(){
  backgroundImage = loadImage("123.jpg");
size(1000,750);
background(0,0,0);
}
int ballX=500;
int ballY=375;
int speedX=10;
int speedY=10;
int paddleY=710;
int paddleLength=100;
int paddleWidth=10;
int paddleX=mouseX;
int score;
void draw(){
  background(0,0,0);

image(backgroundImage, 0, 0, 1000, 750);
 ellipse(ballX,ballY,20,20);
 fill(255,255,255);
 
 rect(mouseX,paddleY,100,10);
 fill(255,255,255);

 ballX=ballX+speedX;
 ballY=ballY+speedY;
 stayIn();
if(intersects(ballX,ballY,paddleX,paddleY,paddleLength,paddleWidth)){
  speedY=-speedY;
  score=score+1;
}
text("score" +score, 50, 50);
}
void stayIn(){
 if(ballX>=1000 || ballX<=0){
    speedX=-speedX;
    
 }
 
 if(ballY>=750 || ballY<=0){
   speedY=-speedY;
 if(ballY>750){
   score=score-1;
 }
 }
}

boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength, int paddleWidth){
 if(ballY > paddleY && ballY < paddleY+paddleWidth && ballX > mouseX && ballX < mouseX + paddleLength)
    return true;
  else
    return false;

}