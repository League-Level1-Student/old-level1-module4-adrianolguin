int birdS = 50;

float grav = .5;
float velocity = 1;
float birdY = 250;
float birdX = 100;

float pipeX = 500;
float pipeY = 0;

int upperPipeHeight = (int) random(100, 400);
int lowerPipeHeight = 500 - (upperPipeHeight + (birdS + 50));

void setup(){
  size(500, 500);
  
}

void draw(){
  background(0);
  
  rect(pipeX, pipeY, 50, upperPipeHeight);
  rect(pipeX, height - lowerPipeHeight, 50, height);
  
  velocity = velocity + grav;
  
  ellipse(birdX, birdY += velocity, birdS , birdS);
  fill(255);
  
  pipeX -= 5;
  
  if(pipeX < -50){
   teleportPipe(); 
  }
  
  if (mousePressed){
    mousePressed();
  }
  
  if(birdX == pipeX){
    grav = 0;
    velocity = 0;
  }
  
}

void mousePressed(){
  velocity = 0;
  velocity -= 7;
}

void teleportPipe(){
  pipeX = 500;
  upperPipeHeight = (int) random(100, 400);
  lowerPipeHeight = 500 - (upperPipeHeight + (birdS + 50));
}