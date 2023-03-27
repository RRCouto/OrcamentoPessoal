package com.orcamentopessoal.repository

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.jdbc.datasource.DriverManagerDataSource
import javax.sql.DataSource

@Configuration
@ComponentScan("com.oracamentopessoal")
class ConnetionSpringJDBC {
    @Bean
    fun Mysql(): DataSource{
        val DataSource = DriverManagerDataSource()
        DataSource.setDriverClassName("com.mysql.jdbc.Driver")
        DataSource.url = "jdbc:mysql//localhost:3306/orcamentopessoal"
        DataSource.username = "root"
        DataSource.password = "administrator"

        return DataSource
    }

    fun connectDb(banco: String){
        if(banco == "mysql"){
            Mysql()
        }
    }

}