package com.graphql.library.books.review;

public record ReviewFilter(
        Integer rating,
        Boolean verified,
        String reviewerName
) {}
