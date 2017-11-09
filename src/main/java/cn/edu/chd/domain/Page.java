package cn.edu.chd.domain;

/**
 * 分页实体
 */
public class Page {
    private int pageNow; //当前页号
    private int pageSize;//一页的最大记录数
    private int totalCount;//最大记录数
    private int pageCount;//页面总数
    private int startIndex;//开始行号
    private int first = 1;//第一页
    private int last;//最后一页
    private int prev;//上一页
    private int next;//下一页

    public Page() {
    }

    public Page(int pageNow, int pageSize, int totalCount) {
        this.pageNow = pageNow;
        this.pageSize = pageSize;
        this.totalCount = totalCount;
        //页面总数 = 总记录数/每一页显示的记录数
        this.pageCount = (int) Math.ceil((double) totalCount / pageSize);
        //当前页数必须在第一页和最后一页之间
        this.pageNow = Math.min(this.pageNow, pageCount);
        this.pageNow = Math.max(this.pageNow, this.first);
        //当前页开始行数
        this.startIndex = (this.pageNow - 1) * pageSize;
        //分别计算下一页，上一页，最后一页
        this.prev = Math.max(this.first, this.pageNow - 1);
        this.last = pageCount;
        this.next = Math.min(this.pageCount, this.pageNow + 1);
    }

    public int getPageNow() {
        return pageNow;
    }

    public void setPageNow(int pageNow) {
        this.pageNow = pageNow;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getLast() {
        return last;
    }

    public void setLast(int last) {
        this.last = last;
    }

    public int getPrev() {
        return prev;
    }

    public void setPrev(int prev) {
        this.prev = prev;
    }

    public int getNext() {
        return next;
    }

    public void setNext(int next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Page{" +
                "pageNow=" + pageNow +
                ", pageSize=" + pageSize +
                ", totalCount=" + totalCount +
                ", pageCount=" + pageCount +
                ", startIndex=" + startIndex +
                ", first=" + first +
                ", last=" + last +
                ", prev=" + prev +
                ", next=" + next +
                '}';
    }
}
