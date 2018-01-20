int birdX=300;
int birdY=375;
double birdV=0;
double birdG=.5;
int pipeH;
int pipeY;
int pipeX=1000;
int topPipeH;
int topPipeY;
int topPipeX=1000;
int timer=0;

void setup(){
  size(1250,750);
  background(0,136,34);
  
  int random = (int) random(1, 375);
  pipeH=random;
  pipeY=750-pipeH;
  
  
   topPipeH=random;
   topPipeY=0;
   topPipeH-=100;
   
}





void draw(){
  
  if(timer==0){
     
   birdV=birdV+birdG;
   birdY+=birdV;
   background(0,136,34);
  fill(255,221,51);
  ellipse(birdX,birdY,25,25);
  
   pipeX-=10; 
   topPipeX-=10;
   
  fill(0,255,0);
  rect(pipeX, pipeY, 100, pipeH);
 
 fill(0,255,0);
 rect(topPipeX, topPipeY, 100, topPipeH);
 
 
  if(mousePressed){
   birdV=-10;
}
 stayIn();
 stayIp();
 if(hitscan(birdX, birdY, pipeX, pipeY,100, pipeH)){
   birdX=50;
   birdY=200;
   fill(250,0,0);
    text( "You lose!", 50, 60); 
  textSize(50); 
  birdV=0;
  timer=100;
 }
  } else if(timer>=1){
    timer-=1;
  }
   if(hitscan(birdX, birdY, topPipeX, topPipeY,100, topPipeH)){
   birdX=50;
   birdY=200;
   fill(250,0,0);
    text( "You lose!", 50, 60); 
  textSize(50); 
  birdV=0;
  timer=100;
 }
  else if(timer>=1){
    timer-=1;
  }
 
}

void stayIn(){
 if(pipeX<=0){
  pipeX=1000;
  int random = (int) random(0, 700);
  pipeH=random;
  topPipeH=random;
  pipeY=750-pipeH;
  
  
 }
if(topPipeX<=0){
  topPipeX=1000;
  
  topPipeY=0;
  topPipeH-=100;
}
  
}

void stayIp(){
  if(birdY>730){
    birdY=730;
  }
  if(birdY<0){
    birdY=10;
  }
}
    



boolean hitscan(int birdX, int birdY, int pipeX,int pipeY,int pipeWidth, int pipeH){
  if(birdX>pipeX && birdX<pipeX+pipeWidth && birdY>pipeY && birdY<pipeY+pipeH){
    return true;
  }else{
    return false;
  }
  
}