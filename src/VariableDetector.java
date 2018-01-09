import java.text.DateFormat.Field;
import java.util.regex.*;
import java.lang.reflect.*;
public class VariableDetector {
	public static void main(String []args)
	{
		try {
			java.lang.reflect.Field[]fields=DeadCodeGenerator.class.getFields();
			for(java.lang.reflect.Field field: fields )
			{
				System.out.println(field.getName());
			}
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
