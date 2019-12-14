package com.ywb.bean;

public class userTable
{
	private int userid;
	private String username;
	private String userpass;
   private String userpone;
   private String usersex;
   private String usertype;

	@Override
	public String toString()
	{
		return "userTable{" + "userid=" + userid + ", username='" + username + '\'' + ", userpass='" + userpass + '\'' + ", userpone='" + userpone + '\'' + ", usersex='" + usersex + '\'' + ", usertype='" + usertype + '\'' + '}';
	}

	public userTable()
	{
	}

	public userTable(int userid, String username, String userpass, String userpone, String usersex, String usertype)
	{
		this.userid = userid;
		this.username = username;
		this.userpass = userpass;
		this.userpone = userpone;
		this.usersex = usersex;
		this.usertype = usertype;
	}

	public int getUserid()
	{
		return userid;
	}

	public void setUserid(int userid)
	{
		this.userid = userid;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getUserpass()
	{
		return userpass;
	}

	public void setUserpass(String userpass)
	{
		this.userpass = userpass;
	}

	public String getUserpone()
	{
		return userpone;
	}

	public void setUserpone(String userpone)
	{
		this.userpone = userpone;
	}

	public String getUsersex()
	{
		return usersex;
	}

	public void setUsersex(String usersex)
	{
		this.usersex = usersex;
	}

	public String getUsertype()
	{
		return usertype;
	}

	public void setUsertype(String usertype)
	{
		this.usertype = usertype;
	}
}
