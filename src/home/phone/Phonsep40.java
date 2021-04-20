package home.phone;

public class Phonsep40 extends Phone implements Music,Video,Pictures,Lnternet{
    @Override
    public void lnternet() {
        System.out.println("我在开心的上网浏览网页");
    }

    @Override
    public void music() {
        System.out.println("我在开心的听音乐");
    }

    @Override
    void text() {
        System.out.println("我在开心的发信息给波波");

    }

    @Override
    void telephone() {
        System.out.println("我在开心的打电话给波波");

    }

    @Override
    public void pictures() {
        System.out.println("我在开心的给波波拍照片");

    }

    @Override
    public void video() {
        System.out.println("我在开心的跟波波一起看视频");

    }
}
