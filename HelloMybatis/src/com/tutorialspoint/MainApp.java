package com.tutorialspoint;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.pojo.Flower;

public class MainApp {
	public static void main(String[] args) throws IOException {
		
		InputStream is = Resources.getResourceAsStream("mybatis.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session=factory.openSession();
		List<Flower> list = session.selectList("com.pojo.Flower.selAll"); 
		for (Flower flower : list) {
				System.out.println(flower.toString()); 
			}
		session.close();
	}

}
