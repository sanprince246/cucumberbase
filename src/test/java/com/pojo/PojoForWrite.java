package com.pojo;
import java.util.ArrayList;

public class PojoForWrite {
	private int page;
	private int perPage;
    private int total;
    private int totalPages;
    private ArrayList<Data> data; 
    private Support support;
    
	public PojoForWrite(int page, int perPage, int total, int totalPages, ArrayList<Data> data, Support support) {
		super();
		this.page = page;
		this.perPage = perPage;
		this.total = total;
		this.totalPages = totalPages;
		this.data = data;
		this.support = support;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPerPage() {
		return perPage;
	}
	public void setPerPage(int perPage) {
		this.perPage = perPage;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public ArrayList<Data> getData() {
		return data;
	}
	public void setData(ArrayList<Data> data) {
		this.data = data;
	}
	public Support getSupport() {
		return support;
	}
	public void setSupport(Support support) {
		this.support = support;
	}
    
    
    
	
    
    

}
