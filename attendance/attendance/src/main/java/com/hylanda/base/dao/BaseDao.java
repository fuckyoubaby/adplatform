package com.hylanda.base.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<T> {
	//����ID����ʵ��
		public T get(Class<T> entityClass,Serializable id);
		//����ʵ��
		public void save(T entity);
		
		/**
		 * �����洢
		 * @param lists
		 * @return
		 */
		public int save(List<T> lists);
		
		//����ʵ��
		void update(T entity);
		
		//ɾ��ʵ��
		void delete(T entity);
		
		//����IDɾ��ʵ��
		void delete(Class<T> entityClass,Serializable id);
		
		//��ȡ����ʵ��
		List<T> findAll(Class<T> entityClass);
		
		//��ҳ��ȡ����ʵ��
		List<T> findByPage(Class<T> entityClass,final int offset,final int length);
		
		//��ȡ����ʵ�����Ŀ
		int getAllCount(Class<T> entityClass);

}
