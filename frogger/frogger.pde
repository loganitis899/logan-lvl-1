int x;
int y;
int hop;
 Car one = new Car(380,100, 40, 5);  
 Car two = new Car(380,200, 50, 1);  
 Car three = new Car(380,300, 20, 2);  
 Car four = new Car(380,350, 70, 10);  
void setup(){
 size(400,400);
 background(0,200,100);
  x=200;
  y=380;
}
void draw(){
 background(0,200,100);
 ellipse(x,y,20,20);
 fill(250,0,0);
 stayIn();
 one.display();
 one.move();
 two.display();
 two.move();
  three.display();
 three.move();
 four.display();
 four.move();
if(intersects(one)==true||intersects(two)||intersects(three)||intersects(four)){
  x=200;
  y=380;
}
  if(y<20){
    fill(250,0,0);
    text( "You Win!", 50, 60); 
  textSize(50); 
  

}

}
void keyPressed()
{
  if(key == CODED){
      if(keyCode == UP)
      {
y=y-20;
      }
      else if(keyCode == DOWN)
      {
      y=y+20;
      }
      else if(keyCode == RIGHT)
      {
       x=x+20;
      }
      else if(keyCode == LEFT)
      {
       x=x-20;
      }
   }
   
}
void stayIn(){
  if(x>400){
    x=400;
  }
  if(y>400){
    y=400;
  }
  if(x<0){
    x=0;
  }
  if(y<0){
    y=0;
  }
}

class Car{
  int speed;
  int Cx;
  int Cy;
  int size;
  
 
  public Car(int x, int y, int size, int speed){
    this.speed=speed;
    this.Cx=x;
    this.Cy=y;
    this.size=size;
  }
  
    void display() 
  {
    fill(0,255,0);
    rect(Cx , Cy, size, 50);
  }
  void move(){
    Cx=Cx-speed;
    if(Cx<-30){
      Cx=380;
    }
  }
  int getX(){
    return Cx;
  }
  int getY(){
    return Cy;
  }
  int getSize(){
    return size;
  }
}
boolean intersects(Car car) {
if ((y > car.getY() && y < car.getY()+50) && (x > car.getX() && x < car.getX()+car.getSize()))
          return true;
    else 
        return false;
}