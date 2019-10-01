package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie_A=context.getBean("movieA",Movie.class);
        Movie movie_B=context.getBean("movieB",Movie.class);
        System.out.println("Name :"+movie_A.getActor().getName()+" gender:"+movie_A.getActor().getGender()+" age:"+movie_A.getActor().getAge());
        //default scope
        System.out.println(movie_A==movie_B);
    }

}
