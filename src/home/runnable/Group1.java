package home.runnable;

public class Group1 implements Runnable {

    String[] name1 = {"一组小甲", "一组小已", "一组小丙", "一组小丁"};

    @Override
    public void run() {
        for (int i = 0; i < name1.length; i++) {
            if (i < 3) {
                System.out.println(name1[i] + "跑了250米");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else if (i == 3) {
                System.out.println(name1[i] + "跑了250米到达终点");
            }

        }
    }
}
