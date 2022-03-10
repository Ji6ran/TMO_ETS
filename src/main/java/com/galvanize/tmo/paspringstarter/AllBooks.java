package com.galvanize.tmo.paspringstarter;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AllBooks {
    @SerializedName("books")
    private List<Book> bookList;

    public List<Book> getBookList() { return this.bookList; }
    public void setBookList(List<Book> bookList) { this.bookList = bookList; }
}
