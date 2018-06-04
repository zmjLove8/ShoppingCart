public class GoodsInCart {
    //购物车中的商品信息类
    private Goods goods;
    private int num;

    public GoodsInCart(){

    }
    public GoodsInCart(Goods goods,int num){
        this.setGoods(goods);
        this.setNum(num);
    }
    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
