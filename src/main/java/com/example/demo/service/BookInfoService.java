package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BookinfoMapper;
import com.example.demo.entity.Bookinfo;

/**
 * ユーザー情報 Service
 */
@Service
public class BookInfoService {

    /**
     * ユーザー情報 Mapper
     */
    @Autowired
    private BookinfoMapper bookInfoMapper;

    /**
     * ユーザー情報全件検索
     * @return 検索結果
     */
    public List<Bookinfo> findAll() {
        return bookInfoMapper.findAll();
    }

}