class Fruit
{
	int price;     // data part  , features
	String taste;
	int wt;

	void set_data(int p, String t , int w)    // arguments in method
	{
		price = p;
		taste = t;
		wt = w;
	}
	void get_data()
	{

		System.out.println(price + " " + taste +  " " + wt);
		//System.out.println(taste);
		//System.out.println(wt);

	}

}    // end of class





class EX1
{
	public static void main(String[] arg)
	{
		Fruit mango = new Fruit();    // this way we make objects
		mango.set_data(50,"sweet",2);
		mango.get_data();


		Fruit apple = new Fruit();    // this way we make objects
		apple.set_data(100,"salty",5);
		apple.get_data();


	}


}


