int x=100;

void setup() {
    size(800, 200);
}

void draw() {
  background(#B71C1E);
  fill(213, 123,340);
  ellipse(x, 100, 100, 100);
  if (mousePressed){
  x=x+10;

    
    
  }
} 
  import ddf.minim.*;
boolean soundPlayed = false;
void playSound() {
    if (!soundPlayed) {
        Minim minim = new Minim(this);
        AudioSample sound = minim.loadSample("ding2.wav");
        sound.trigger();
        soundPlayed = true;
    }


  
}
  
 