package com.ywb.bean;

public class dTable
{

	  private int did;
	  private String  dname;
	  private udTable udTable;
	  shu

	public dTable()
	{
	}

	public dTable(int did, String dname, com.ywb.bean.udTable udTable)
	{
		this.did = did;
		this.dname = dname;
		this.udTable = udTable;
	}

	public int getDid()
	{
		return did;
	}

	public void setDid(int did)
	{
		this.did = did;
	}

	public String getDname()
	{
		return dname;
	}

	public void setDname(String dname)
	{
		this.dname = dname;
	}

	public com.ywb.bean.udTable getUdTable()
	{
		return udTable;
	}

	public void setUdTable(com.ywb.bean.udTable udTable)
	{
		this.udTable = udTable;
	}

	@Override
	public String toString()
	{
		return "dTable{" + "did=" + did + ", dname='" + dname + '\'' + ", udTable=" + udTable + '}';
	}
}
