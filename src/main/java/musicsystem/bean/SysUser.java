/*
 * Powered By [dwz4j-framework]
 * Web Site: http://j-ui.com
 * Google Code: http://code.google.com/p/dwz4j/
 * Generated 2018-06-19 20:44:57 by code generator
 */

package musicsystem.bean;

public class SysUser implements java.io.Serializable{
	private static final long serialVersionUID = 1L;

	//columns START
	private Integer id;
	private String username;
	private String password;
	private String email;
	private String phone;
	private java.util.Date createTime;
	private Integer status;
	//columns END

	public SysUser(){
	}

	public SysUser(Integer id){
		this.id = id;
	}


	public Integer getId() {
		return this.id;
	}
	public void setId(Integer id) {
		this.id =id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public java.util.Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	
}

