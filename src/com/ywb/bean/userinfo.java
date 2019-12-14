package com.ywb.bean;

public class userinfo
{

	private int id;
	private String loginname;
	private String truename;
	private String pwd;
	private String state;

	public userinfo()
	{
	}

	public userinfo(int id, String loginname, String truename, String pwd, String state)
	{
		this.id = id;
		this.loginname = loginname;
		this.truename = truename;
		this.pwd = pwd;
		this.state = state;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getLoginname()
	{
		return loginname;
	}

	public void setLoginname(String loginname)
	{
		this.loginname = loginname;
	}

	public String getTruename()
	{
		return truename;
	}

	public void setTruename(String truename)
	{
		this.truename = truename;
	}

	public String getPwd()
	{
		return pwd;
	}

	public void setPwd(String pwd)
	{
		this.pwd = pwd;
	}

	public String getState()
	{
		return state;
	}

	public void setState(String state)
	{
		this.state = state;
	}
}
