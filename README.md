nc-cd-avancee
=============
flyway maven workshop step by step
===================================
0-  mvn clean package

1-  mvn flyway:clean

2-  mvn flyway:info

see the result

3-  mvn flyway:validate 

4-  mvn flyway:migrate

create your own scripts

5-  mvn tomcat7:run

observer the table schema_version


flyway gradle workshop step by step
===================================
1-  gradle flywayClean

2-  gradle flywayInfo

see the result

3-  gradle flywayValidate 

5-  gradle flywayMigrate

observer the table schema_version


liquibase maven workshop step by step
===================================
1-  mvn liquibase:dropAll

2-  mvn liquibase:status

see the result

3-  mvn liquibase:update 

4-  mvn liquibase:rollback -Dliquibase.rollbackCount=3

create your own scripts

5   mvn liquibase:status

6-  mvn tomcat7:run

observe the table DBCHANGELOGS
