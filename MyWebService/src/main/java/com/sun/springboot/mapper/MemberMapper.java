package com.sun.springboot.mapper;

import com.sun.springboot.entity.Member;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

public interface MemberMapper {

    public Member getMemberById(Integer id);

    public void delMemberById(Integer id);

    public void updateMemberById(Member member);

    @Insert("insert into member(passwad,username,id) values(#{passWad},#{userName},#{id})")
    public void insertMem(Member member);
}
