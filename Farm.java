class Farm 
{     
	private Animal[] animals = new Animal[3];
	public Farm(){
		animals[0] = new Cow("牛", "モーモー");
		animals[1] = new Chick("ひよこ", "ぴよぴよ");
		animals[2] = new Pig("ぶた", "ブーブー");
	}
	public void animalSounds(){
		for (int nI = 0; nI < animals.length; nI++){
			System.out.println(animals[nI].getType() + " goes " + animals[nI].getSound());
		}
	}
   //your code here
}
