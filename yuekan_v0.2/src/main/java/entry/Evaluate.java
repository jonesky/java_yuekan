package entry;

import java.util.List;

public class Evaluate {

	//评论语句编号
	private String evaluateId;
	
	//所属商品ID(系统ID)
	private String goodsId;
	
	//评论语句内容
	private String data;
	
	//商品分析结果
	private double goodsFeedback;

	public Evaluate(String evaluateId, String goodsId, String data, double goodsFeedback) {
		super();
		this.evaluateId = evaluateId;
		this.goodsId = goodsId;
		this.data = data;
		this.goodsFeedback = goodsFeedback;
	}

	public Evaluate(String goodsId, String data) {
		super();
		this.goodsId = goodsId;
		this.data = data;
	}
	
	public Evaluate() {
	}

	public String getEvaluateId() {
		return evaluateId;
	}

	public void setEvaluateId(String evaluateId) {
		this.evaluateId = evaluateId;
	}

	public String getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public double getGoodsFeedback() {
		return goodsFeedback;
	}

	public void setGoodsFeedback(double goodsFeedback) {
		this.goodsFeedback = goodsFeedback;
	}
	
	
	
	
	
	
	
}
