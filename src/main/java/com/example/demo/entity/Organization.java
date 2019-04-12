package com.example.demo.entity;

/**
 * 
 * Demo 组织机构实体
 * 
 * @author 李兆杰
 * @date 2019/04/09
 */
public class Organization {
	/**
	 * 机构名称
	 */
	private String name;
	/**
	 * 机构Id
	 */
	private Integer id;
	
	/**
	 * 父级机构Id
	 */
	private Integer parentId;
	/**
	 * 机构类型Id
	 */
	private Integer typeId;
	/**
	 * 机构层级
	 */
	private Integer level;
	/**
	 * 层级路径
	 * 
	 */
	private String levelCode;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getLevelCode() {
		return levelCode;
	}

	public void setLevelCode(String levelCode) {
		this.levelCode = levelCode;
	}

}
