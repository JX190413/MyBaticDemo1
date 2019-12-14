package com.ywb.bean;

public class udTable
{
	private int udid;
	private int uid;
	private int did;

   private userTable userTable;
   private dTable dTable;

	public udTable()
	{
	}

	public udTable(int udid, int uid, int did, com.ywb.bean.userTable userTable, com.ywb.bean.dTable dTable)
	{
		this.udid = udid;
		this.uid = uid;
		this.did = did;
		this.userTable = userTable;
		this.dTable = dTable;
	}

	public int getUdid()
	{
		return udid;
	}

	public void setUdid(int udid)
	{
		this.udid = udid;
	}

	public int getUid()
	{
		return uid;
	}

	public void setUid(int uid)
	{
		this.uid = uid;
	}

	public int getDid()
	{
		return did;
	}

	public void setDid(int did)
	{
		this.did = did;
	}

	public com.ywb.bean.userTable getUserTable()
	{
		return userTable;
	}

	public void setUserTable(com.ywb.bean.userTable userTable)
	{
		this.userTable = userTable;
	}

	public com.ywb.bean.dTable getdTable()
	{
		return dTable;
	}

	public void setdTable(com.ywb.bean.dTable dTable)
	{
		this.dTable = dTable;
	}


	@Override
	public String toString()
	{
		return "udTable{" + "userTable=" + userTable + ", dTable=" + dTable + '}';
	}
}
