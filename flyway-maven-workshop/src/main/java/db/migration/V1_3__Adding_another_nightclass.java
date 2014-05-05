package db.migration;

import org.flywaydb.core.api.migration.spring.SpringJdbcMigration;
import org.springframework.jdbc.core.JdbcTemplate;

public class V1_3__Adding_another_nightclass implements SpringJdbcMigration {

	@Override
	public void migrate(JdbcTemplate jdbcTemplate) throws Exception {
		jdbcTemplate.execute("INSERT INTO NIGHTCLASS (ID,TITLE) VALUES (4,'Build Tools Continous Delivery avancee')");
	}
}
