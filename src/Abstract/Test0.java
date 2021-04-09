package Abstract;
abstract class PrimeVideo
{
	abstract void watchMovie();
}
class SubScribe extends PrimeVideo
{
	void watchMovie()
	{
		System.out.println("watch movie");
	}
}
class  Test0
{
	public static void main(String[] args) 
	{
		PrimeVideo obj=new SubScribe();
		obj.watchMovie();
	}
}
