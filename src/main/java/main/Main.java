package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Card c = context.getBean("card", Card.class);
        System.out.println(c);
	}
}
