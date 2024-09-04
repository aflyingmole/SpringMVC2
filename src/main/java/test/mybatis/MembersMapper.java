package test.mybatis;

import test.vo.MembersVo;

import java.util.List;

//test.mybatis.MembersMapper.xml과 같은 이름의 패키지에 같은 이름의 인터페이스를 만든다
public interface MembersMapper {
    //test.mybatis.MembersMapper.xml파일의 id속성과 같은 이름으로 메서드를 만든다
    int insert(MembersVo vo);
    int update(MembersVo vo);

    int delete(int num);
    MembersVo select(int num);
    List<MembersVo> selectAll();

}
