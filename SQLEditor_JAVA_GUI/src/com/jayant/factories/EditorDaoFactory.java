package com.jayant.factories;

import com.jayant.dao.EditorDao;
import com.jayant.dao.EditorDaoImpl;

public class EditorDaoFactory {
	
	private static EditorDao editorDao = null;
	
	static {
		editorDao = new EditorDaoImpl();
		
	}
	public static EditorDao getEditorDao() {
		return editorDao;
	}
}
