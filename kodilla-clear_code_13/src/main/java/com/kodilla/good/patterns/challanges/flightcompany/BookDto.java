package com.kodilla.good.patterns.challanges.flightcompany;

public class BookDto {
    private BookRequest bookRequest;
    private boolean isOrdered;

    public BookDto(BookRequest bookRequest, boolean isOrdered) {
        this.bookRequest = bookRequest;
        this.isOrdered = isOrdered;
    }

    public BookRequest getBookRequest() {
        return bookRequest;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
