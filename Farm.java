class Farm 
{     
	private Animal[] aBunchofAnimals = new Animal[3];
	public Farm(){
		aBunchofAnimals[0] = new Cow("Meat", "Galge");
		aBunchofAnimals[1] = new Chick("Kobato", "Kukuku");
		aBunchofAnimals[2] = new Pig("Yozora", "It's not like I'm desperate to have friends, anyway.");
	}
	public void animalSounds(){
		for (int nI = 0; nI < aBunchofAnimals.length; nI++){
			System.out.println(aBunchofAnimals[nI].getType() + " goes " + aBunchofAnimals[nI].getSound());
		}
	}
   //your code here
}
