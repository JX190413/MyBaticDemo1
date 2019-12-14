package com.ywb.mapper;

import com.ywb.bean.dTable;
import com.ywb.bean.udTable;
import com.ywb.bean.userTable;
import org.apache.ibatis.annotations.MapKey;

import java.util.List;
import java.util.Map;

public interface UserMapper
{
//    @MapKey("username")
//    public Map<String,userTable> findMap(userTable userTable);
//    userTable findList(userTable userTable);
   
   //待条件查询
//    public List<userTable> querall(userTable userTable);
//    public List<userTable> querall2(userTable userTable);
//    public int updater1(userTable userTable);
//    public List<userTable> selectTa(int[] i);
//    public int insertTa(List<userTable> list);
//    public udTable one(int i);
//     public List<udTable> one(int i);
@MapKey("uid")
 public List<Map<Object,udTable>>  one(int i);

}
