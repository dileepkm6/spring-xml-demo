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
        //using ApplicationContext
        System.out.println("\nUsing ApplicationContext....");
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie=context.getBean("movie",Movie.class);
        System.out.println("Actor Name : "+movie.getActor().getName());
        System.out.println("Gender : "+movie.getActor().getGender());
        System.out.println("Age : "+movie.getActor().getAge());
        //using XMLBeanFactory
        System.out.println("\nUsing XmlBeanFactory....");
        XmlBeanFactory xmlBeanFactory=new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Movie movie1=xmlBeanFactory.getBean("movie",Movie.class);
        System.out.println("Actor Name : "+movie1.getActor().getName());
        System.out.println("Gender : "+movie1.getActor().getGender());
        System.out.println("Age : "+movie1.getActor().getAge());

    }

}
