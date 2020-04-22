package com.cyb.dubbo.api.service.dto.bug;

/**
 * 子类
 * 
 * @author Administrator
 *
 */
public class InheritanceDTO extends BaseDTO {

	/**
	 * 序列化版本号
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 子类Id
	 */
	private Long id;

	/**
	 * 名称
	 */
	private String name;

	public InheritanceDTO(Long baseId, Long id, String name) {
		super(baseId);

		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "InheritanceDTO[base id=" + super.getId() + ",id=" + id + ",name=" + name + "]";
	}

}
