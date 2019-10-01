package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie=context.getBean("movie",Movie.class);
        System.out.println("Name :"+movie.getActor().getName()+" gender :"+movie.getActor().getGender()+" age :"+movie.getActor().getAge());
        ((ConfigurableApplicationContext)context).close();
    }

}
