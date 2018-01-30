int r=50;
int g=50;
int b=50;
int one;
int two;
int track=0;
int colour;
void setup(){
  size(800,800); 
  background(155,155,155);
}

void draw(){
 // for(int i=0,j=0; i<800 && j<800; j=j+20, i+=20){
   // ellipse(i,j,50,50);
 //   
 //
//}

//float ballX=  random(800);
//float ballY= random(800);
//ellipse(ballX, ballY, 50,50);
for(int x=0; x<10; x++){
  fill(colors(), colors(), colors());
ellipse(getWormX(one), getWormY(two), 10,10);
r+=.1;
g+=.1;
b+=.1;
one+=10;
two+=10;
track++;
colors();

}
makeMagical();
}
int colors(){
  
  if(track%10==0){
    colour++;
    
    if(colour>255){
      colour=0;
    }
}
return colour;
    
  }
float frequency = .005;
float noiseInterval = 2; 

void makeMagical() {
  fill( 0, 0, 0, 10 );rect(0, 0, width, height);noStroke();
}

float getWormX(int i) {
  return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
  return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}