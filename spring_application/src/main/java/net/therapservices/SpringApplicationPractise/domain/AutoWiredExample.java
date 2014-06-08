package net.therapservices.SpringApplicationPractise.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by rifatul.islam on 6/4/14.
 */
public class AutoWiredExample {
    @Autowired
    @Qualifier("asim")
    private ASimpleBean aSimpleBean;

    private AnotherBean anotherBean = null;
    private YetAnotherBean yetAnotherBean = null;

    public AnotherBean getAnotherBean() {
        return anotherBean;
    }

    public void setAnotherBean(AnotherBean anotherBean) {
        this.anotherBean = anotherBean;
    }

    public YetAnotherBean getYetAnotherBean() {
        return yetAnotherBean;
    }

    public void setYetAnotherBean(YetAnotherBean yetAnotherBean) {
        this.yetAnotherBean = yetAnotherBean;
    }

    @Override
    public String toString() {
        return "AutoWiredExample{" +
                "anotherBean=" + anotherBean +
                ", yetAnotherBean=" + yetAnotherBean +
                '}';
    }
}
