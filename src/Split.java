import java.util.ArrayList;
import java.util.List;


public class Split implements Cloneable{
	public List attr_index;
	public List attr_value;
	double entophy;
	String classLabel;
	Split()
	{
		 this.attr_index= new ArrayList<Integer>();
		 this.attr_value = new ArrayList<String>();
		
		
	}
	Split(List attr_index,List attr_value)
	{
		this.attr_index=attr_index;
		this.attr_value=attr_value;
		
	}
	
	void add(Split obj)
	{
		this.add(obj);
	}
	

}
