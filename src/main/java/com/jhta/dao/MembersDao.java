package com.jhta.dao;

import lombok.Setter;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import test.vo.MembersVo;

import java.util.List;

public class MembersDao {

    private SqlSession sqlSession;
    private final String NAMESPACE = "test.mybatis.MembersMapper";

    public void setSqlSession(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public int insert(MembersVo vo) {
        return sqlSession.insert(NAMESPACE + ".insert", vo);
    }

    public int update(MembersVo vo) {
        return sqlSession.update(NAMESPACE + ".update", vo);
    }

    public int delete(int num) {
        return sqlSession.delete(NAMESPACE + ".delete", num);
    }
    public MembersVo select(int num) {
        return sqlSession.selectOne(NAMESPACE + ".select",num);
    }
    public List<MembersVo> selectAll() {
        return sqlSession.selectList(NAMESPACE + ".selectAll");
    }
}
