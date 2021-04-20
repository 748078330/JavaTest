package home.runnable;

public class Group2 implements Runnable {

    String[] name2 = {"二组小红", "二组小明", "二组小兰", "二组小波"};

    @Override
    public void run() {
        for (int i = 0; i < name2.length; i++) {
            if (i < 3) {
                System.out.println(name2[i] + "跑了250米");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else if (i == 3) {
                System.out.println(name2[i] + "跑了250米到达终点");
            }

        }

    }
}
