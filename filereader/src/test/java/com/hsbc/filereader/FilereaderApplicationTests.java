package com.hsbc.filereader;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class FilereaderApplicationTests {

	@Autowired
	ReverseOrder reverseOrder;

	@Test
	void contextLoads() {
	}


	@Test
	void testReverse(){

		//reverseOrder.reverse("ABC");
		assertThat(reverseOrder.reverse("ABC")).isEqualTo("CBA");
	}

}
