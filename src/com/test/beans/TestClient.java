package com.test.beans;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import com.target.beans.Student1;

public class TestClient 
{
	public static void main(String[] args) 
	{
		FileSystemResource res = new FileSystemResource("src/com/s/config/ApplicationContext.xml");
		XmlBeanFactory factory = new XmlBeanFactory(res);
		XmlBeanFactory f = new XmlBeanFactory(res);
		
		Object ob = factory.getBean("st");
		Student1 st = (Student1)ob;
		
		System.out.println(st.getName());
		System.out.println(st.getId());
		System.out.println(st.getLocation());
		System.out.println(st.getSubject());
		System.out.println("*************************************");
		
	}
}
