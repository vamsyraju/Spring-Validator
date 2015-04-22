package Spring.SpringValidator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tutorialpoint.spring.di.TextEditor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext context = 
                 new ClassPathXmlApplicationContext("Context.xml");
    	 System.out.println("**********************");	
          TextEditor te = (TextEditor) context.getBean("textEditor");

          te.spellCheck();
    }
}
