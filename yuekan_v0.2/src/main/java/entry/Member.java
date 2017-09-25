package entry;

import java.util.List;

public class Member {
	
	//用户系统号(方便用于查询)
	private String xId;
	
	//用户登录号(用于登录)
	private String userId;
	
	//用户名
	private String userName;
	
	//用户密码
	private String userPasswd;
	
	//用户历史查询结果
	private List userGoods;

	public Member(String xId, String userId, String userName, String userPasswd, List userGoods) {
		super();
		this.xId = xId;
		this.userId = userId;
		this.userName = userName;
		this.userPasswd = userPasswd;
		this.userGoods = userGoods;
	}

	public Member(String userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}

	public Member() {
		super();
	}

	public String getxId() {
		return xId;
	}

	public void setxId(String xId) {
		this.xId = xId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPasswd() {
		return userPasswd;
	}

	public void setUserPasswd(String userPasswd) {
		this.userPasswd = userPasswd;
	}

	public List getUserGoods() {
		return userGoods;
	}

	public void setUserGoods(List userGoods) {
		this.userGoods = userGoods;
	}

	@Override
	public String toString() {
		return "Member [xId=" + xId + ", userId=" + userId + ", userName=" + userName + ", userPasswd=" + userPasswd
				+ ", userGoods=" + userGoods + "]";
	}

	
	
	
}
