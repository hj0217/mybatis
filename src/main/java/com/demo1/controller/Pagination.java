package com.demo1.controller;

import com.demo1.vo.PageInfo;

public class Pagination {

    public static PageInfo getPageInfo(int listCount, int currentPage, int pageLimit, int boardLimit) {
        int maxPage = (int) (Math.ceil(((double) listCount / boardLimit)));
        int startPage = (currentPage - 1) / pageLimit * pageLimit + 1;
        int endPage = startPage + pageLimit - 1;

        if (endPage > maxPage) {
            endPage = maxPage;
        }

        int offset = (currentPage -1) * boardLimit;
        return new PageInfo(listCount, currentPage, pageLimit, boardLimit, maxPage, startPage, endPage, offset);
    }
}