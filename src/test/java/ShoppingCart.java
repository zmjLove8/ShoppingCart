import java.util.*;
public class ShoppingCart {
    //购物车类
    public ShoppingCart(){

    }
    //商品编号作为key值
    Map<String,GoodsInCart> shoppingCart = new HashMap<String,GoodsInCart>();
    Scanner consloe = new Scanner(System.in);
    //添加商品到购物车
    public void addGoodsToCart(GoodsManage gm){
        //判断是否导入商品，没有则提示错误
        if (gm.getGoodsSet().size()==0){
            System.out.println("还没有商品，请先导入商品信息");
        }else {
            gm.displayAllGoods();//显示所有商品信息
            System.out.println("请输入商品编号");
            String id = consloe.next();
            Goods goods = null;
            Iterator<Goods> iterator = gm.getGoodsSet().iterator();
//            while (iterator.hasNext()){
//                if (iterator.next().getGoodsId().equals(id)) {
//                    goods = iterator.next();
//                    break;
//                }
//            }
            for (Goods g : gm.getGoodsSet()) {
                if (g.getGoodsId().equals(id)) {
                    goods = g;
                    break;
                }
            }
            if (goods != null){
                System.out.println("请输入商品数量");
                int num = consloe.nextInt();
                GoodsInCart goodsInCart = new GoodsInCart(goods,num);
                shoppingCart.put(id,goodsInCart);
            }else {
                System.out.println("没找到对应的商品，请重新输入");
            }
        }

    }
    //修改购物车中的商品数量
    public void updateNumInCart(){
        display();
        System.out.println("请输入要修改的商品编号");
        String id2 = consloe.next();

        if (shoppingCart.containsKey(id2)) {
            GoodsInCart goods = shoppingCart.get(id2);
            System.out.println("请输入商品数量");
            int n = consloe.nextInt();
            if (n==0){
                shoppingCart.remove(id2);
                System.out.println("因商品数量改为0，所有该商品从购物车移除!");
            } else {
                shoppingCart.get(id2).setNum(n);
            }
        } else {
            System.out.println("你输入的商品编号不存在，请重新输入");
        }
//        Set<Map.Entry<String,GoodsInCart>> set = shoppingCart.entrySet();
//        for (Map.Entry<String,GoodsInCart> entry : set){
//            System.out.println(entry.getValue());
//        }
    }
    //显示购物车中的所有商品
    public void displayAllInCart(){
        if (shoppingCart.keySet().size()==0){
            System.out.println("购物车是空的呦，赶快装满吧~");
        }else {
            System.out.println("购物车中的所有商品信息如下: ");
            Iterator<GoodsInCart> goodsInCartIterator = shoppingCart.values().iterator();
            while (goodsInCartIterator.hasNext()){
                System.out.println(goodsInCartIterator.next().toString());
            }
        }
    }
    public void display(){
        //获取购物车中的商品
        Set<String> goodsIdSet = shoppingCart.keySet();
        if (goodsIdSet.size()==0){
            System.out.println("购物车是空的呦，赶快装满吧~");
        }else {
            System.out.println("购物车中的所有商品信息如下: ");
            for (String id : goodsIdSet){
                GoodsInCart gic = shoppingCart.get(id);
                Goods gd = gic.getGoods();
                int num = gic.getNum();
                System.out.println(gd + ",数量: "+ num);
            }
        }
    }
    //结算
    public void settleAccounts(){
        for (GoodsInCart goods : shoppingCart.values()) {
            double sum = (goods.getGoods().getPrice())*(goods.getNum());
            System.out.println("商品的总价为: "+ sum + "元");
        }
    }

}
