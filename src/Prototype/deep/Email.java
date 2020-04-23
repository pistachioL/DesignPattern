package Prototype.deep;

import java.util.Date;

public class Email implements Cloneable {
    public String emailTitle;
    public int emailLevel;
    public Attachment attachment;
    public Email(){
        this.attachment = new Attachment();
        this.emailTitle = new String("test");
    }

    public String getEmailTitle() {
        return emailTitle;
    }

    public void setEmailTitle(String emailTitle) {
        this.emailTitle = emailTitle;
    }

    public int getEmailLevel() {
        return emailLevel;
    }

    public void setEmailLevel(int emailLevel) {
        this.emailLevel = emailLevel;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public Object clone() throws CloneNotSupportedException {
        Email email = (Email)super.clone();
        email.emailTitle = new String("test");
        email.emailLevel = new Integer(1);
        return email;
    }

    public Attachment getAttachment(){
        return this.attachment;
    }


}
