package com.sun.springboot.controller;

import com.sun.springboot.entity.Member;
import com.sun.springboot.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyServiveController {

    @Autowired
    MemberMapper memberMapper;

    @GetMapping("/memselect/{id}")
    public Member getMemberById(@PathVariable("id") Integer id){
        return memberMapper.getMemberById(id);
    }

    @GetMapping("/memdelete/{id}")
    public String deleteMember(@PathVariable("id") Integer id){
        memberMapper.delMemberById(id);
        return "delete OK!";
    }

}

