class Chick implements Animal 
{     
     private String myType;
     private String mySound;
     private String mySound2;
     public Chick(String type, String sound, String sound2){
     	myType = type;
     	mySound = sound;
          mySound2 = sound2
     }
     public Chick(){
     	myType = "unknown";
     	mySound = "unknown";
          mySound2 = "unknown";
     }

     if (((int)Math.random()*10) => 5){
          public String getSound(){return mySound;}
     }
     else{
          public String getSound(){return mySound2;}

     }

     public String getType(){return myType;}
}