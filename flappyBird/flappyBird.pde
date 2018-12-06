int birdS = 50;

int gap = 120;

float grav = .5;
float velocity = 1;
float birdY = 250;
float birdX = 100;
float pSpeed = 5;

float pipeX = 500;
float pipeY = 0;
float pS = 50;

boolean gameOver = false;

int upperPipeHeight = (int) random(100, 400);

float poiX = 0;
 float poiY = 0;


void setup(){
  size(500, 500);
  
 
  
}

void draw(){
  background(0);
  
 
  rect(pipeX, pipeY, pS, upperPipeHeight);
  rect(pipeX, upperPipeHeight + gap, pS, 500);
  
  velocity = velocity + grav;
  
  ellipse(birdX, birdY += velocity, birdS , birdS);
  fill(255);
  
  pipeX -= pSpeed;
  
  if(pipeX < -50){
   teleportPipe(); 
  }
  
  if (mousePressed){
    if(grav == 0){
     grav = .5; 
    }else {
  mousePressed();
  }
  }
 
 if(birdY > height - birdS/2){
   birdY = height - birdS/2;
   grav = 0;
   velocity = 0;
 }
 
 if(!gameOver && (birdX > pipeX && birdX < pipeX + pS) && (birdY < upperPipeHeight || birdY > upperPipeHeight + gap)){
 gameOver = true;
   
   poiX = birdX;
   poiY = birdY;
  }
 
 if(gameOver){
   
   
   pSpeed = 0;
   fill(255,0,255);
   ellipse(poiX, poiY, 50, 50);
 }
  
  fill(255,0,0);
  
  
  if(keyPressed){
    keyPressed();
  }
  
  
  
}

void mousePressed(){
  velocity = 0;
  velocity -= 7;
  
}

void teleportPipe(){
  pipeX = 500;
  upperPipeHeight = (int) random(100, 400);
}

void keyPressed(){
 if(keyCode == ' '){
  fill(255); 
 }
}