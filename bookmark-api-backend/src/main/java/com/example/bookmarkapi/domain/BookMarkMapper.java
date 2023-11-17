package com.example.bookmarkapi.domain;

import org.springframework.stereotype.Component;

@Component
public class BookMarkMapper {

    public BookMarkDto toDto(Bookmark bookmark){
        BookMarkDto bookMarkDto = new BookMarkDto();
        bookMarkDto.setId(bookMarkDto.getId());
        bookMarkDto.setTitle(bookMarkDto.getTitle());
        bookMarkDto.setUrl(bookMarkDto.getUrl());
        bookMarkDto.setCreatedAt(bookMarkDto.getCreatedAt());
        return bookMarkDto;
    }
}
