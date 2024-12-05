package com.aloha.movie_project.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.aloha.movie_project.domain.Movie;

@Mapper
public interface MovieMapper {

    public List<Movie> movieList();
    public List<Movie> expectList();

    // 조회
    public Movie select(String id) throws Exception;
    // 생성
    public int insert(Movie movie) throws Exception;
    // 수정
    public int update(Movie movie) throws Exception;
    // 삭제

    // 리스트 조회
    public List<Movie> list() throws Exception;

    // 리스트 검색 조회
    public List<Movie> search(String search) throws Exception;
}
