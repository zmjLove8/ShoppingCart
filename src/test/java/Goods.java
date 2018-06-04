public class Goods {
    //商品类
    private String goodsId;
    private String goodsName;
    private double price;
    private String goodsDesp;

    public Goods(){

    }
    public Goods(String goodsId,String goodsName,double price,String goodsDesp){
        this.setGoodsId(goodsId);
        this.setGoodsName(goodsName);
        this.setPrice(price);
        this.setGoodsDesp(goodsDesp);
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getGoodsDesp() {
        return goodsDesp;
    }

    public void setGoodsDesp(String goodsDesp) {
        this.goodsDesp = goodsDesp;
    }

    @Override
    public String toString() {
        return "商品信息[编号: "+ this.getGoodsId()+", 名称: "+ this.getGoodsName()
                +", 价格: "+ this.getPrice()+", 描述: " + this.getGoodsDesp()+"]";
    }

    @Override
    public boolean equals(Object o) {
        if (this==o)
            return true;
        if (o.getClass()==Goods.class){
            Goods goods = (Goods)o;
            return goods.getGoodsId().equals(goodsId)&&(goods.getGoodsName().equals(goodsName))
                    &&(goods.getPrice()==price)&&(goods.getGoodsDesp().equals(goodsDesp));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getGoodsId().hashCode();
        result = 31 * result + getGoodsName().hashCode();
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + getGoodsDesp().hashCode();
        return result;
    }

}
