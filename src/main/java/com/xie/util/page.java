package com.xie.util;


public class page {


    /**
     * 页数
     */
    Integer pageCount;

    /**
     * 每页显示数量
     */
    Integer pageSize;

    /**
     * 总记录数
     */
    Integer count;

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * 分页支持
     *
     * @param pageSize 每页显示数
     * @param count    总记录数
     */
   /* public PageSupport(Integer pageSize, Integer count) {
        if(pageSize < 1){
            pageSize = 5;
        }
        if(count < 1){
            count = 1;
        }
        this.pageSize = pageSize;
        this.count = count;
        //计算总页数
        calculatePageCount();
    }

    *//**
     * 计算总页数
     *//*
    public void calculatePageCount() {
        boolean pageSizeIsNotNull = !StringUtils.isNull(pageSize);
        boolean countIsNotNUll = !StringUtils.isNull(count);
        if (pageSizeIsNotNull && countIsNotNUll) {
            this.pageCount = count % pageSize == 0 ? count / pageSize : count / pageSize + 1;
        } else {
            throw new RuntimeException();
        }
    }

    *//**
     * 获取条目
     *
     * @param pageNum 页码
     * @return
     *//*
    public PageEntry pageEntry(Integer pageNum) {
        boolean pageNumIsNotNull = !StringUtils.isNull(pageNum);

        if (pageNumIsNotNull) {
            return new PageEntry(pageNum);
        } else {
            throw new RuntimeException();
        }
    }

    *//**
     * 页条目
     *//*
    public class PageEntry {

        *//**
     * 页码
     *//*
        Integer pageNum;

        public PageEntry(Integer pageNum) {
            this.pageNum = pageNum;
        }

        *//**
     * 获取页码索引
     *
     * @return 索引
     *//*
        public Integer getPageIndex() {
            if (pageNum < 1) {
                pageNum = 1;
            } else if (pageNum > pageCount) {
                pageNum = pageCount;
            }
            return (pageNum - 1) * pageSize;
        }

        *//**
     * 获取每页显示页数
     *
     * @return
     *//*
        public Integer getPageSize() {
            return pageSize;
        }
    }

    public static PageSupport createPageSupport(Integer pageSize, Integer count){
        return new PageSupport(pageSize,count);
    }*/
}
