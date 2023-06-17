package atguigu.java2;

/**
 * @Auther:𝓜𝓸𝓻𝓲𝓪𝓻𝓽𝔂
 * @Date:
 * @Description:使用同步机制将单例模式中的懒汉式改写为线程安全的
 */
public class BankTest {
}

class Bank{

    private Bank(){}

    private static Bank instance = null;

    public static synchronized Bank getInstance(){
//方式一:教率稍差
//        synchronized (Bank.class) {
//            if (instance == null){
//                instance = new Bank();
//
//            }
//            return instance;
//        }
        if (instance == null){
            synchronized (Bank.class) {
                if (instance == null){
                    instance = new Bank();
                }
            }
        }
        return instance;
    }

}
