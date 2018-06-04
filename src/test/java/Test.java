import java.util.Scanner;
public class Test {
    public static void main(String[] args){
        GoodsManage goodsManage = new GoodsManage();
        ShoppingCart shoppingCart = new ShoppingCart();
        Scanner console = new Scanner(System.in);
        boolean flag = false;
        int n = 0;
        while (true){
            showMainInfo();
            n = console.nextInt();
            switch (n){
                case 1:
                    while (!flag){
                        showManageInfo();
                        n = console.nextInt();
                        switch (n){
                            case 1:
                                goodsManage.importGoods();
                                System.out.println("商品信息导入成功!");
                                break;
                            case 2:
                                goodsManage.displayAllGoods();
                                break;
                            case 9:
                                flag = true;
                                break;
                            default:
                                System.out.println("请输入1 2 9中任意一个数字进行操作");
                        }
                    }
                    break;
                case 2:
                    int k = 0;
                    while (flag==true){
                        showShoppingCartInfo();
                        k = console.nextInt();
                        switch (k){
                            case 1:
                                shoppingCart.addGoodsToCart(goodsManage);
                                break;
                            case 2:
                                shoppingCart.updateNumInCart();
                                break;
                            case 3:
                                shoppingCart.display();
                                break;
                            case 4:
                                shoppingCart.settleAccounts();
                                break;
                            case 9:
                                flag = false;
                                break;
                            default:
                                System.out.println("请输入1 2 3 4 9中任意一个数字进行操作");
                        }
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("该数字没有对应的操作!");
            }
        }
    }
    public static void showMainInfo(){
        System.out.println("*********************************");
        System.out.println("             **主菜单**          ");
        System.out.println("             1--商品管理         ");
        System.out.println("             2--购物车           ");
        System.out.println("             0--退出          ");
        System.out.println("*********************************");
        System.out.println("请输入对应数字进行操作: ");
    }
    public static void showManageInfo(){
        System.out.println("**************************************************");
        System.out.println("                 **商品管理**                     ");
        System.out.println("               1--商品信息导入                    ");
        System.out.println("               2--显示所有商品信息                ");
        System.out.println("               9--返回上一级菜单                    ");
        System.out.println("**************************************************");
        System.out.println("请输入对应的数字对商品进行管理: ");
    }
    public static void showShoppingCartInfo(){
        System.out.println("**************************************************");
        System.out.println("             **购物车管理**                       ");
        System.out.println("         1--添加商品到购物车                      ");
        System.out.println("         2--修改购物车中的商品数量                ");
        System.out.println("         3--显示购物车中的所有商品信息            ");
        System.out.println("         4--结算                                  ");
        System.out.println("         9--返回上一级菜单                        ");
        System.out.println("**************************************************");
        System.out.println("请输入对应的数字对购物车进行管理: ");
    }
}
