public class TryCatchDemo {

    public static void main(String[] args) {
        String[] strArray = {"张三", "李四", "王五"};

        try{
            System.out.println(strArray[3]);
        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("索引出现问题");
            e.printStackTrace();
        }

        System.out.println(strArray[2]);
    }
}
