package clg;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;

public class Test {
    public static void main(String[] args) {

        Resource res = new ClassPathResource("clg/context.xml");
        BeanFactory bean = new XmlBeanFactory(res);

        Student s1 = (Student) bean.getBean("stud");

        s1.display();
        s1.setName("Vansiya");
        s1.display();
    }
}