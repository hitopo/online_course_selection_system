package cn.edu.chd.dto;

import cn.edu.chd.domain.Page;

import java.util.List;

/**
 * 封装分页对象和实体对象
 * 用来在service层和controller传输
 */
public class DomainPageList<T> {
    //分页对象
    private Page page;
    //列表
    private List<T> list;

    public DomainPageList() {
    }

    public DomainPageList(Page page, List<T> list) {
        this.page = page;
        this.list = list;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
