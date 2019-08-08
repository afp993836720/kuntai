package com.shengpingj.kuntai.common;

import java.util.List;

public class PageBean<T> {
    private Integer totalRecord;
    private Integer pageNum;
    private static Integer pageSize = 10;
    private Integer totalPage;
    private Integer startIndex;
    private Integer start;
    private Integer end;
    private List<T> list;
    public  PageBean(int pageNum,int totalRecord){
        this.pageNum = pageNum;
        this.totalRecord = totalRecord;

        if (totalRecord%pageSize == 0){
            this.totalPage = totalRecord / pageSize;
        }else{
            this.totalPage = totalRecord / pageSize + 1;
        }
        this.startIndex = (pageNum - 1) * pageSize;
        this.start = 1;
        this.end = 5;
        if (totalPage <=5 ){
            this.end = this.totalPage;
        }else{
            this.start = pageNum - 2;
            this.end = pageNum + 2;
            if (start < 0){
                this.start = 1;
                this.end = 5;
            }
            if (end > this.totalPage){
                this.end = totalPage;
                this.start = end - 5;
            }
        }

    }

    public Integer getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(Integer totalRecord) {
        this.totalRecord = totalRecord;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public static Integer getPageSize() {
        return pageSize;
    }

    public static void setPageSize(Integer pageSize) {
        PageBean.pageSize = pageSize;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getEnd() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
