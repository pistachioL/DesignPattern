package Prototype.shadow;

public class Email implements Cloneable{ //浅克隆
    public int emailLevel;
    public String emailTitle;
    private Attachment attachment;
    public Email(){
        this.attachment = new Attachment();
        this.emailLevel = new Integer(2);
        this.emailTitle = new String("shadow");
    }
    public Object clone(){  //只是用Object中默认的clone方法，是浅拷贝的
        Email cloneEmail = null;
        try{
            cloneEmail = (Email)super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("浅克隆失败");
        }
        return cloneEmail;
    }
    public Attachment getAttachment(){
        return this.attachment;
    }
}
