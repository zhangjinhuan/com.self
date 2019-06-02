package com.atguigu.config;

import com.atguigu.bean.Cat;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.util.StringValueResolver;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * Created by daynew on 2019/5/26.
 */
@Configuration
@PropertySource("classpath:/dbconfig.properties")
public class BeanConfigProfile implements EmbeddedValueResolverAware{
    private StringValueResolver valueResolver;
    private String driverClass;
    //第一种从配置文件中取值
    @Value("${userName}")
    private String user;

    @Bean
    public Cat cat(){
        return new Cat();
    }

    @Profile("dev")
    @Bean("DevDataSource")
    public DataSource dataSourceDev(@Value("${password}") String password) throws PropertyVetoException {//第二种从配置文件中取值
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser("cqqxcs");
        dataSource.setPassword(password);
        dataSource.setJdbcUrl("jdbc:oracle:thin:@//localhost:1521/orcl");
        dataSource.setDriverClass(driverClass);
        return dataSource;
    }

    @Profile("pro")
    @Bean("proDataSource")
    public DataSource dataSourceProd(@Value("${password}") String password) throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser("cqqxcs");
        dataSource.setPassword(password);
        dataSource.setJdbcUrl("jdbc:oracle:thin:@//localhost:1521/orcl");
        dataSource.setDriverClass(driverClass);
        return dataSource;
    }
    @Profile("test")
    @Bean("TestDataSource")
    public DataSource dataSourceTest(@Value("${password}") String password) throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser("cqqxcs");
        dataSource.setPassword(password);
        dataSource.setJdbcUrl("jdbc:oracle:thin:@//localhost:1521/orcl");
        dataSource.setDriverClass(driverClass);
        return dataSource;
    }

    public void setEmbeddedValueResolver(StringValueResolver stringValueResolver) {
        this.valueResolver = stringValueResolver;
        this.driverClass = valueResolver.resolveStringValue("driverClass");
    }
}
