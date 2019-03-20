package HouseConstruction;
/*
 * author :Anjalimadhavi*/
public class HouseConstruction {
public int estimatecost(int sqfeet,String standards ) {
	if(standards.equals("standard")) {
		return sqfeet*1200;
	}
	else if(standards.equals("above standard")) {
		return sqfeet*1500;
	}
	else if(standards.equals("high standard")) {
		return sqfeet*1800;
	}
	else if(standards.equals("fully standard")) {
		return sqfeet*2500;
	}
	return 0;
}
}
