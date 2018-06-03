package com.tchoko.springboot.springdata;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.tchoko.springboot.springdata.model.Book;
import com.tchoko.springboot.springdata.repository.BookRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@DirtiesContext
public class SpringDataDemoApplicationTests {
	
	@Autowired
	private BookRepository bookRepository;

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testSpringData() {
		
		Book book = new Book();
		book.setTitle("Learn Spring Data");
		book.setPublishDate(new Date());
		book.setPageCount(500);
		book.setPrice(new BigDecimal(200));

		bookRepository.save(book);

		System.out.println(book);
		
		assertThat(book.getBookId(), is(equalTo(1L)));
		
	}

}
