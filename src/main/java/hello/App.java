package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// IoC Container : Inversion of Control (제어의 역전)
    	ApplicationContext ctx = 
    			new ClassPathXmlApplicationContext("beans.xml");
    	Greeter korea = (Greeter) ctx.getBean("korea");
    	// Greeter  클래스로부터 생성된 객체를 참조하는 변수
    	// korea는 Greeter 클래스에 정의된 메소드를 사용할 수 있다고 생각함
    	System.out.println( "Hello World!" + korea.sayHello());
    	Greeter2 eng = (Greeter2) ctx.getBean("english");
    	System.out.println( "Hello World!" + eng.sayHello());
    }
}
