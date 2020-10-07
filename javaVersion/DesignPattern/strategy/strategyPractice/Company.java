package DesignPattern.strategy.strategyPractice;

import DesignPattern.strategy.strategyPractice.ComProcess.*;

public enum Company {

    Alibaba_C("alibaba", new AlibabaProcess()),
    Tecent_C("tecent", new TecentProcess()),
    Toutiao_C("toutiao", new ToutiaoProcess()),
    Meituan_C("meituan", new MeituanProcess()),
    Jingdong_C("jingdong", new JingdongProcess()),
    Huawei_C("huawei", new HuaweiProcess());

    String name;
    Process process;

    Company(String name, Process p) {
        this.name = name;
        this.process = p;
    }

    Company() {
    }

    public static Company match(String myname) {
        Company[] cc = Company.values();
        for (Company c : cc) {
            if (c.name.equals(myname)) {
                return c;
            }
        }
        return null;
    }
}
