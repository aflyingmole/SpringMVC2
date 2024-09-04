package com.jhta.service;

import org.springframework.transaction.annotation.Transactional;
import test.mybatis.MemberPointMapper;
import test.mybatis.MembersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.vo.MembersVo;
import test.vo.PointVo;

import java.util.List;

@Service
public class MembersService {
    @Autowired private MembersMapper mapper;
    @Autowired private MemberPointMapper pmapper;

    @Transactional
    public int insert(MembersVo vo) {
        mapper.insert(vo);
        pmapper.insert(new PointVo(0, vo.getNum(), 100));
        return 1;
    }

    public int update(MembersVo vo) {
        return mapper.update(vo);
    }

    public int delete(int num) {
        return mapper.delete(num);
    }

    public MembersVo select(int num) {
        return mapper.select(num);
    }

    public List<MembersVo> selectAll() {
        return mapper.selectAll();
    }
}
