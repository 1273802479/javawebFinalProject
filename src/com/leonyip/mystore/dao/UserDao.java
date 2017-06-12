package com.leonyip.mystore.dao;

import java.util.List;

import com.leonyip.mystore.entity.Admin;
import com.leonyip.mystore.entity.Goods;

public interface UserDao {
	public void addUser(Admin admin);    //����û�
	public Boolean hasSameName(String userName);
	public Boolean hasUser(String userName, String password);
	public String getUserType(String userName);
	public void delUser(int id);
	public void updateUser(Admin admin);
	public Admin getUser(int id);
	public List<Admin> searchAllUserByPaging() ;
	public List<Admin> searchUserByKeyword(String keyword);
	public List<Admin> searchUserByKeywordPaging(String keyword, int pageNum, int pageSize);//�õ��û�
}
