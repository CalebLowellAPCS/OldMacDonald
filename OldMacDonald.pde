
Farm [] yoFarm;

void setup()
{
	yoFarm = new Farm [3];
	for (int i = 0; i < yoFarm.length; i++) {
		yoFarm[i] = new Farm();
		System.out.println(yoFarm[i].getType() + " goes " + yoFarm[i].getSound());
	}
	//your variable declarations here
}

