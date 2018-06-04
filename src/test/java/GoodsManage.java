import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class GoodsManage {
    Set<Goods> goodsSet = new HashSet<Goods>();
    //商品管理类
    public GoodsManage(){

    }
    public GoodsManage(Set<Goods> goodsSet){
        this.setGoodsSet(goodsSet);
    }


    public Set<Goods> getGoodsSet() {
        return goodsSet;
    }

    public void setGoodsSet(Set<Goods> goodsSet) {
        this.goodsSet = goodsSet;
    }

    public void importGoods(){
        //商品信息导入
        Goods goods1 = new Goods("goods001","水杯",56,"不锈钢水杯");
        Goods goods2 = new Goods("goods002","饮水机",299,"带净化功能的饮水机");
        Goods goods3 = new Goods("goods003","笔记本电脑",4999,"15寸笔记本电脑");
        Goods goods4 = new Goods("goods004","手机",2300,"android手机");
        goodsSet.add(goods1);
        goodsSet.add(goods2);
        goodsSet.add(goods3);
        goodsSet.add(goods4);
    }
    public void displayAllGoods(){
        //显示所有商品信息
        System.out.println("所有商品信息为: ");
        Iterator<Goods> iterator = goodsSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
