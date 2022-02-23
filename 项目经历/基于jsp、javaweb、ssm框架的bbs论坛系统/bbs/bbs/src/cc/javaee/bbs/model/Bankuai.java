package cc.javaee.bbs.model;


/*
 * 板块的bean
 * 
 */
public class Bankuai {
	
    private Integer id;

    //板块名称
    private String name;

    //板块图标
    private String img;

    //板块类型
    private String type;

    //板块父id
    private Integer parentId;

    //板块父名称
    private String parentname;
    //板块描述
    private String descs;
    //板块排序
    private Integer orderBy;
    //发帖限制组 跟积分组关联
    private String fatiegroup;
    //回复限制组 跟积分组关联
    private String huifugroup;
    
    //查询权限 暂时为使用
    private String findgroup;
    //二级目录名称
    private String yuming;
    

    //板块创建时间
    private String createTime;

    //板块创建人
    private Integer createUserid;
    //主题数量
    private Integer zhuticount;
    //回复数量
    private Integer huifucount;
    
    //父名称---关联父id使用
    private String fname;
    //父id---关联父id使用
    private Integer fid;
    
    //帖子创建时间---查询该板块最后发帖时间
    private String tiezicreateTime;
    //帖子id---查询该板块最后发帖id
    private String tieziid;
    //帖子名称---查询该板块最后发帖名称
    private String tieziname;
    //用户id---查询该板块最后发帖用户id
    private String userid;
    //用户名称---查询该板块最后发帖用户名称
    private String username;

    
    public String getFindgroup() {
		return findgroup;
	}

	public void setFindgroup(String findgroup) {
		this.findgroup = findgroup;
	}

	public String getYuming() {
		return yuming;
	}

	public void setYuming(String yuming) {
		this.yuming = yuming;
	}

	public String getFatiegroup() {
		return fatiegroup;
	}

	public void setFatiegroup(String fatiegroup) {
		this.fatiegroup = fatiegroup;
	}

	public String getHuifugroup() {
		return huifugroup;
	}

	public void setHuifugroup(String huifugroup) {
		this.huifugroup = huifugroup;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public Integer getFid() {
		return fid;
	}

	public void setFid(Integer fid) {
		this.fid = fid;
	}

	public String getTiezicreateTime() {
		return tiezicreateTime;
	}

	public void setTiezicreateTime(String tiezicreateTime) {
		this.tiezicreateTime = tiezicreateTime;
	}

	public String getTieziid() {
		return tieziid;
	}

	public void setTieziid(String tieziid) {
		this.tieziid = tieziid;
	}

	public String getTieziname() {
		return tieziname;
	}

	public void setTieziname(String tieziname) {
		this.tieziname = tieziname;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getZhuticount() {
		return zhuticount;
	}

	public void setZhuticount(Integer zhuticount) {
		this.zhuticount = zhuticount;
	}

	public Integer getHuifucount() {
		return huifucount;
	}

	public void setHuifucount(Integer huifucount) {
		this.huifucount = huifucount;
	}
    
    public Integer getId() {
        return id;
    }

	public String getDescs() {
		return descs;
	}


	public void setDescs(String descs) {
		this.descs = descs;
	}


	public String getParentname() {
		return parentname;
	}

	public void setParentname(String parentname) {
		this.parentname = parentname;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jbbs_bankuai.id
     *
     * @param id the value for jbbs_bankuai.id
     *
     * @mbggenerated Sun Feb 26 10:38:47 GMT+08:00 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jbbs_bankuai.name
     *
     * @return the value of jbbs_bankuai.name
     *
     * @mbggenerated Sun Feb 26 10:38:47 GMT+08:00 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jbbs_bankuai.name
     *
     * @param name the value for jbbs_bankuai.name
     *
     * @mbggenerated Sun Feb 26 10:38:47 GMT+08:00 2017
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jbbs_bankuai.img
     *
     * @return the value of jbbs_bankuai.img
     *
     * @mbggenerated Sun Feb 26 10:38:47 GMT+08:00 2017
     */
    public String getImg() {
        return img;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jbbs_bankuai.img
     *
     * @param img the value for jbbs_bankuai.img
     *
     * @mbggenerated Sun Feb 26 10:38:47 GMT+08:00 2017
     */
    public void setImg(String img) {
        this.img = img;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jbbs_bankuai.type
     *
     * @return the value of jbbs_bankuai.type
     *
     * @mbggenerated Sun Feb 26 10:38:47 GMT+08:00 2017
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jbbs_bankuai.type
     *
     * @param type the value for jbbs_bankuai.type
     *
     * @mbggenerated Sun Feb 26 10:38:47 GMT+08:00 2017
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jbbs_bankuai.parent_id
     *
     * @return the value of jbbs_bankuai.parent_id
     *
     * @mbggenerated Sun Feb 26 10:38:47 GMT+08:00 2017
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jbbs_bankuai.parent_id
     *
     * @param parentId the value for jbbs_bankuai.parent_id
     *
     * @mbggenerated Sun Feb 26 10:38:47 GMT+08:00 2017
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jbbs_bankuai.order_by
     *
     * @return the value of jbbs_bankuai.order_by
     *
     * @mbggenerated Sun Feb 26 10:38:47 GMT+08:00 2017
     */
    public Integer getOrderBy() {
        return orderBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jbbs_bankuai.order_by
     *
     * @param orderBy the value for jbbs_bankuai.order_by
     *
     * @mbggenerated Sun Feb 26 10:38:47 GMT+08:00 2017
     */
    public void setOrderBy(Integer orderBy) {
        this.orderBy = orderBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jbbs_bankuai.create_time
     *
     * @return the value of jbbs_bankuai.create_time
     *
     * @mbggenerated Sun Feb 26 10:38:47 GMT+08:00 2017
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jbbs_bankuai.create_time
     *
     * @param createTime the value for jbbs_bankuai.create_time
     *
     * @mbggenerated Sun Feb 26 10:38:47 GMT+08:00 2017
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jbbs_bankuai.create_userid
     *
     * @return the value of jbbs_bankuai.create_userid
     *
     * @mbggenerated Sun Feb 26 10:38:47 GMT+08:00 2017
     */
    public Integer getCreateUserid() {
        return createUserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jbbs_bankuai.create_userid
     *
     * @param createUserid the value for jbbs_bankuai.create_userid
     *
     * @mbggenerated Sun Feb 26 10:38:47 GMT+08:00 2017
     */
    public void setCreateUserid(Integer createUserid) {
        this.createUserid = createUserid;
    }
}