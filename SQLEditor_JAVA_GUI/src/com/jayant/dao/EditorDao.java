package com.jayant.dao;

public interface EditorDao {
	public boolean executeUserQuery(String query);
	public Object getResultSet();
	public int getRowCount();
}
