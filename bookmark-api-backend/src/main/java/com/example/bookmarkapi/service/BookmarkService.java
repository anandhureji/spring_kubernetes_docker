package com.example.bookmarkapi.service;

import com.example.bookmarkapi.Repository.BookmarkRepository;
import com.example.bookmarkapi.domain.BookMarkDto;
import com.example.bookmarkapi.domain.BookMarkMapper;
import com.example.bookmarkapi.domain.BookMarksDTO;
import com.example.bookmarkapi.domain.Bookmark;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;

@Service
@Transactional
@RequiredArgsConstructor
public class BookmarkService {

    private final BookmarkRepository bookmarkRepository;
    private final BookMarkMapper bookMarkMapper;

    @Transactional(readOnly= true)
    public BookMarksDTO getBookmark(Integer page){
        int pageNo = page < 1 ? 0 : page -1 ;
        Pageable pageable = PageRequest.of(pageNo, 10, Sort.Direction.DESC, "createdAt");
        Page<BookMarkDto> bookMarkDtos = bookmarkRepository.findBookMarks(pageable);
        return new BookMarksDTO(bookMarkDtos);

    }

}
