package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main
{
    public static void main( String[] args )
    {

        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie_A=context.getBean("movie",Movie.class);
        Movie movie_B=context.getBean("movie",Movie.class);
        System.out.println("Name :"+movie_A.getActor().getName()+" gender:"+movie_A.getActor().getGender()+" age:"+movie_A.getActor().getAge());
        //Default scope
        System.out.println(movie_A==movie_B);

    }

}
