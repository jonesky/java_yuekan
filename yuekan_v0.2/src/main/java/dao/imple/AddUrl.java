package dao.imple;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import entry.Evaluate;
import entry.Goods;

public class AddUrl implements Runnable {
	
	private int i;
	private String evaluateURL;
	private Goods g;
	private static Lock lock = new ReentrantLock();
	static DaoImplement  mDao = new DaoImplement();
	
	

	public AddUrl(int i, String evaluateURL, Goods g) {
		super();
		this.i = i;
		this.evaluateURL = evaluateURL;
		this.g = g;
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		lock.lock();
		try{
			String url=this.evaluateURL.substring(0, this.evaluateURL.length() - 1) + this.i;
			String str = mDao.sendGet(url);
			String regex="rateContent\":(.*?),\"rateDate\"";
			Pattern pa=Pattern.compile(regex);
		    Matcher m=pa.matcher(str);
		    Thread.sleep(50);
		    while(m.find()){
		    	Evaluate ev = new Evaluate();
		    	double evaluateAttribute = 0;
				ev.setGoodsId(this.g.getGoodsId());
				String data = m.group(1);
				ev.setData(data);
				mDao.addEvaluate(ev);	
		    }
		}catch(Exception ex ){
        }finally {
            lock.unlock();          // 解锁
        }
	}

}
