class User{
	private string userName;
	private string pass;
	
	public User()
    {
		userName = "admin";
		pass = "admin";
	}
	
	public User(string userName1, string pass1)
    {
		userName = userName1;
		pass = pass1;
	}

    public void setUserName(string un)
    {
        userName = un;
    }

    public string getUserName()
    {
        return userName;
    }

    public void setPass(String pas)
    {
        pass = pas;
    }

    public string getPass()
    {
        return pass;
    }
}
