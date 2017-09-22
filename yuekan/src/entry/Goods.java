package entry;

import java.util.List;

/**
 * 
 * @author hadoop
 *商品类,用于存储商品全部属性和评论分析结果
 */
public class Goods {
	
	//商品ID号
	private String goodsId;
	
	//商品ID号
	private String goodsUId;
	
	//商品名
	private String googsName;
	
	//商品属性,以list的形式进行存储(每个商品的属性名和数量都不定)
	private double goodsAttribute;
	
	//商品URL
	private String goodsURL;

	public Goods(String goodsId, String googs_Name, double goodsAttribute, String goodsURL) {
		super();
		this.goodsId = goodsId;
		this.googsName = googsName;
		this.goodsAttribute = goodsAttribute;
		this.goodsURL = goodsURL;
	}

	public Goods(String goodsId, String googsName, String goodsURL) {
		super();
		this.goodsId = goodsId;
		this.googsName = googsName;
		this.goodsURL = goodsURL;
	}

	public Goods(String googsName, String goodsURL) {
		super();
		this.googsName = googsName;
		this.goodsURL = goodsURL;
	}
	
	public Goods() {
		super();
	}

	public String getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoogsName() {
		return googsName;
	}

	public void setGoogsName(String googsName) {
		this.googsName = googsName;
	}

	public double getGoodsAttribute() {
		return goodsAttribute;
	}

	public void setGoodsAttribute(double goodsAttribute) {
		this.goodsAttribute = goodsAttribute;
	}

	public String getGoodsURL() {
		return goodsURL;
	}

	public void setGoodsURL(String goodsURL) {
		this.goodsURL = goodsURL;
	}

	public String getGoodsUId() {
		return goodsUId;
	}

	public void setGoodsUId(String goodsUId) {
		this.goodsUId = goodsUId;
	}

	
	
	
	

}
