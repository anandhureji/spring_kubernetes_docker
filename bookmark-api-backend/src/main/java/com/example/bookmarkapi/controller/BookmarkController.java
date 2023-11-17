package com.example.bookmarkapi.controller;

import com.example.bookmarkapi.domain.BookMarksDTO;
import com.example.bookmarkapi.domain.Bookmark;
import com.example.bookmarkapi.service.BookmarkService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/bookmarks")
public class BookmarkController {

    private final BookmarkService bookmarkService;

    @GetMapping
    public BookMarksDTO getBookMarks(@RequestParam(name = "page" ,defaultValue = "1") Integer page){
        return bookmarkService.getBookmark(page);
    }
}
