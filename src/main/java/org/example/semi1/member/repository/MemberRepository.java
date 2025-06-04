package org.example.semi1.member.repository;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.semi1.member.domain.MemberDTO;
import org.example.semi1.member.domain.dto.Member;

@Mapper
public interface MemberRepository {

    @Insert("insert into members (userid,passwd,name,email) values (#{userid},#{passwd},#{name},#{email})")
    int insertMember(MemberDTO member);

    @Select("select * from members where userid = #{userid}")
    Member findByUserid(String userid);

    @Select("select count(userid) from members where userid = #{userid}")
    int countByUserid(String userid);

    @Select("select count(email) from members where email = #{email}")
    int countByEmail(String email);
}
