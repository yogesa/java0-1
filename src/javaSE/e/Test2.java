package javaSE.e;


class FreshFruits{
    enum  FreshJuiceSize {
        SMALL,MEDIUM,LARGE
    }
    FreshJuiceSize size;
}
public class Test2 {
    public static void main(String[] args) {
      FreshFruits fruits =   new FreshFruits();
      fruits.size = FreshFruits.FreshJuiceSize.SMALL;
      System.out.println("out:"+fruits.size);
        System.out.println("终于上传一个项目了");

    }
}

