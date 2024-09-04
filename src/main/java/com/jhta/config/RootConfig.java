package com.jhta.config;


import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

// <트랜잭션 설정하기>
// - 트랜잭션이 적용될 메서드에 @Transactional 어노테이션 설정
// - DataSourceTransactionManager - 트랜잭션 매니저 생성
// - @EnableTransactionManagement 설정 - 트랜잭션 활성화
// - applicationContext.xml을 대신하는 자바설명 클래스
@Configuration
@MapperScan(basePackages = {"test.mybatis"})
@ComponentScan(basePackages = {"com.jhta.service"})
@EnableTransactionManagement
public class RootConfig {

    @Bean(destroyMethod = "close")
    public BasicDataSource dataSource() {
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName("oracle.jdbc.OracleDriver");
        ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
        ds.setUsername("c##java");
        ds.setPassword("c##java");
        return ds;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sb = new SqlSessionFactoryBean();
        sb.setDataSource(dataSource());
        return sb.getObject();
    }
//    @Bean
//    public SqlSessionFactory sqlSessionFactory() throws Exception {
//        SqlSessionFactoryBean sb = new SqlSessionFactoryBean();
//        sb.setDataSource(dataSource());
//        sb.setMapperLocations(
//                new PathMatchingResourcePatternResolver()
//                        .getResources("classpath:MembersMapper.xml") // 정확한 XML 파일 경로
//        );
//        return sb.getObject();
//    }
    @Bean //트랜잭션 매니저 설정
    public DataSourceTransactionManager transactionManager(){
        DataSourceTransactionManager tm = new DataSourceTransactionManager();
        tm.setDataSource(dataSource());
        return tm;
    }

}

