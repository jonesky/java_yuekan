package dao;

import java.util.List;

import entry.Goods;
import entry.Member;

public interface  Dao {
	
	//用户验证登录(返回用户系统编号)
	public boolean memberLigon(Member m);
	
	//获得用户历史查询记录
	public List<Goods> getAllGoods(Member m);
	
	//删除历史查询记录
	public void deleteGoods(int goodsId, int userId);
	
	//将查询结果添加到数据库中
	public void addGoogs(Goods goods);

	//增加查询记录
	public void addQueryLog(Member m, int goodsId);
	
	//根据商品URL获取商品信息
	public Goods getGoodsIdByGoodsURL(String GoodsURL);
	
}
