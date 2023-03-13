package JavaProgrmas2;

public class SingleTon {
	public static void main(String[] args) {
		//create object using getobject();
		SingleTonApp st=SingleTonApp.getObject("Object1");
		SingleTonApp st2=SingleTonApp.getObject("Object1");
		
		System.out.println(st.obj);
		System.out.println(st2.obj);
		//it is proven by the count of objects
		System.out.println("No of objects in the class : "+st2.count);
	}
}
class SingleTonApp
{
	//create static reference and set as null
	static SingleTonApp ref=null;
	static int count=0;
	String obj;
	
	public String getObj() {
		return obj;
	}
	public void setObj(String obj) {
		this.obj = obj;
	}
	//Create the private constructor 
	private SingleTonApp(String obj) {
		super();
		this.obj = obj;
		count++;
	}
	
	// create a static method that will getObject 
	static SingleTonApp getObject(String obj)
	{
		//check whether the ref is null or not
		if(ref==null)
		{
			// if ref null create new object
			ref=new SingleTonApp(obj);
			return ref;
		}
		//other wise return old reference  
		return ref;
	}
	@Override
	public String toString() {
		return "SingleTonApp [obj=" + obj + "]";
	}
	

	
}
