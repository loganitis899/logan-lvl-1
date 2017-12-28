int birdX=300;
int birdY=375;
double birdV=0;
double birdG=.5;
int pipeH;
int pipeY;
int pipeX=1000;

void setup(){
  size(1250,750);
  background(0,136,34);
  
  int random = (int) random(0, 700);
  pipeH=random;
  pipeY=750-pipeH;
}





void draw(){
   birdV=birdV+birdG;
   birdY+=birdV;
   background(0,136,34);
  fill(255,221,51);
  ellipse(birdX,birdY,25,25);
  
   pipeX-=17; 
   
  fill(0,255,0);
  rect(pipeX, pipeY, 100, pipeH);
 
  if(mousePressed){
   birdV=-10;
}
 stayIn();
 
}

void stayIn(){
 if(pipeX<=0){
  pipeX=1000;
  int random = (int) random(0, 700);
  pipeH=random;
  pipeY=750-pipeH;
 }
}

boolean intersects(int birdX, int birdY, int paddleX, int paddleY, int paddleLength) {
if (birdY > paddleY - 4 && birdX > paddleX && birdX < paddleX + paddleLength)
return true;
else 
return false;
}