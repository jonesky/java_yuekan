import sys  
import snownlp
import pymysql.cursors
from snownlp import SnowNLP
s = sys.argv[1];
conn = pymysql.Connect(
	host="localhost",
    port=3306,
    user="root",
    passwd="hadoop",
    db="yuekan",
    charset="utf8");
cursor = conn.cursor();

sql =  "select * from evaluate where goods_id = '" + str(s) + "'";
cursor.execute(sql);
goods_list = [];
rows = cursor.fetchall();
conn.commit();
for row in rows:
    uid = row[0];
    da = row[3];
    print(uid)
    print(da)
    d = SnowNLP(da).sentiments;
    sql = "update evaluate set goods_feedback='" + str(d) +"' where Id='" + str(uid) + "'";
    cursor.execute(sql);
    conn.commit();