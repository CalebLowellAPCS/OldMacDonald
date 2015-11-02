class Farm 
{     
	private Animal[] aBunchofAnimals = new Animal[3];
	public Farm(){
		aBunchofAnimals[0] = new Cow("牛", "モーモー");
		aBunchofAnimals[1] = new Chick("ひよこ", "ぴよぴよ");
		aBunchofAnimals[2] = new Pig("ぶた", "ブーブー");
	}
	public void animalSounds(){
		for (int nI = 0; nI < aBunchofAnimals.length; nI++){
			System.out.println(aBunchofAnimals[nI].getType() + " goes " + aBunchofAnimals[nI].getSound());
		}
	}
   //your code here
}
