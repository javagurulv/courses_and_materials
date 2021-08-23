package lv.javaguru.java2.library.core.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import lv.javaguru.java2.library.core.domain.Reader;

@Component
public class ReaderRepository {

	@Autowired private JdbcTemplate jdbcTemplate;

	public void save(Reader reader) {
		jdbcTemplate.update(
				"INSERT INTO readers (firstName, lastName) "
						+ "VALUES (?, ?)",
				reader.getFirstName(), reader.getLastName()
		);
	}


}
