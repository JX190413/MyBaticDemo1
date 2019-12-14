package com.ywb.main;


import com.ywb.bean.dTable;
import com.ywb.bean.udTable;
import com.ywb.bean.userTable;
import com.ywb.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class test
{
	public static void main(String[] args)
	{
		SqlSession sqlSession= com.great.util.MybatisUtils.getSession();
		//查
//	  List<userTable> userTable=sqlSession.selectList("userTablesqlMap.findbyuserno");
//		System.out.println(userTable.toString());
//		sqlSession.close();
		//删除
//	    int i=sqlSession.delete("userTablesqlMap.deleteuser",3);
//		System.out.println("删除了吗"+i);
//		sqlSession.commit();
//		sqlSession.close();
		//改
//		userTable userTable=new userTable();
//		userTable.setUsername("JX190413");
//		userTable.setUserid(4);
//	    int i=sqlSession.update("userTablesqlMap.updateTable",userTable);
//		System.out.println(i);
//		sqlSession.commit();
//		sqlSession.close();
		//增加
//		userTable userTable=new userTable();
//				userTable.setUsername("小4");
//		      userTable.setUserpass("123");
//		   int i=   sqlSession.insert("userTablesqlMap.addinfo",userTable);
//		       System.out.println(i);
//				sqlSession.commit();
//				sqlSession.close();

//		userTable userTable=new userTable();
//	 Map<String,userTable>  map=sqlSession.selectMap("userTablesqlMap.findMap",userTable,"username");
//		System.out.println(map.toString());
//   for(Map.Entry<String,userTable> entry:map.entrySet()){
//	   System.out.println(entry.getKey()+"-"+entry.getValue().toString());
//   }
//sqlSession.close();
//where多条件查询
	   UserMapper userMapper=   sqlSession.getMapper(UserMapper.class);
//   待条件返回bean
//		udTable udTable=userMapper.one(1);
		//三表查询查全部LIST
//	   List<udTable> udTable=userMapper.one(1);
//
//
//		for (int i = 0; i < udTable.size(); i++)
//		{
//			System.out.println(udTable.get(i).toString());
//		}
//
//
//		System.out.println(udTable.size());

		//三表查询查map
	List<Map<Object,udTable>>	 udTable=userMapper.one(4);
		for (int i = 0; i <udTable.size() ; i++)
		{

			System.out.println(udTable.get(i));
//			for(Map.Entry<Object,udTable> entry:udTable.entrySet()){
//				System.out.println(entry.getKey());
//			}
		}






//		userTable.setUsername("小4");
//		userTable.setUsersex("男");
//		userTable.setUsertype("启用");
//
//		List<userTable> tableList=userMapper.querall(userTable);
//		System.out.println(tableList.size());

//trim多条件查询
//		userTable.setUsername("小4");
//		userTable.setUsersex("女");
//		userTable.setUsertype("启用");
//
//		List<userTable> tableList1=userMapper.querall2(userTable);
//		System.out.println(tableList1.size());

	//修改
//		userTable.setUserid(4);
//		userTable.setUsersex("男");
//	  int i=userMapper.updater1(userTable);
//		sqlSession.commit();
//		sqlSession.close();
//		System.out.println(i);
		//使用数组查询
//		int[] i={4,6,7};
//
//	List<userTable>  list=	userMapper.selectTa(i);
//		for (int j = 0; j <list.size() ; j++)
//		{
//			System.out.println(list.get(j).getUsername());
//		}
		//使用list批量插入
//		List<userTable> tableList=new ArrayList<>();
//
//		     userTable userTable1=new userTable();
//
//		     userTable1.setUsername("王");
//             userTable1.setUserpone("784548");
//            userTable1.setUsertype("启用");
//            userTable1.setUserpass("123");
//            userTable1.setUsersex("男");
//		userTable userTable2=new userTable();
//
//		userTable2.setUsername("李");
//		userTable2.setUserpone("784548");
//		userTable2.setUsertype("启用");
//		userTable2.setUserpass("1234");
//		userTable2.setUsersex("男");
//		tableList.add(userTable1);
//		tableList.add(userTable2);
//	int i=	userMapper.insertTa(tableList);
//		sqlSession.commit();
//		System.out.println(i);
//		sqlSession.close();

}
}

