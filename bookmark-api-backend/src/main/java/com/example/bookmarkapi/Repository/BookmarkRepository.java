package com.example.bookmarkapi.Repository;

import com.example.bookmarkapi.domain.BookMarkDto;
import com.example.bookmarkapi.domain.Bookmark;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



@Repository
public interface BookmarkRepository extends JpaRepository<Bookmark,Long> {

    @Query("select new com.example.bookmarkapi.domain.BookMarkDto(b.id,b.title,b.url,b.createdAt) from Bookmark b")
    Page<BookMarkDto> findBookMarks(Pageable pageable);

}
