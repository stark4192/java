public class q2lab10 {

	public static void main(String[] args) {
		scooter s = new scooter();
		autorickshaw a = new autorickshaw();
		truck t = new truck();

	}

}
interface vehicle
{
	void getvehiclename();
	 void getmilage();
	void getspeed();
}
abstract class twowheeler
{
abstract void displayvehiclesame();

}
abstract class threewheeler
{
abstract void displayvehiclesame();

}
abstract class fourwheeler
{
abstract void displayvehiclesame();

}
abstract class scooter implements vehicle extends twowheeler
{
	void displayvehiclename()
	{
		System.out.println("it is scooter");
	}
}
abstract  class autorickshaw implements vehicle extends threewheeler
{
	void displayvehiclename()
		{
			System.out.println("it is autorickshaw");
	}
}
 abstract class truck implements vehicle extends fourwheeler
{
	void displayvehiclename()
		{
			System.out.println("it is truck");
	}
}