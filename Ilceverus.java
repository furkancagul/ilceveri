
package com.final;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Ilceverus {

    @SerializedName("IlceAdi")
    @Expose
    private String ilceAdi;
    @SerializedName("LogoURL")
    @Expose
    private String logoURL;
    @SerializedName("BeledeyiBa\u015fkan\u0131")
    @Expose
    private String beledeyiBaKan;

    public String getIlceAdi() {
        return ilceAdi;
    }

    public void setIlceAdi(String ilceAdi) {
        this.ilceAdi = ilceAdi;
    }

    public String getLogoURL() {
        return logoURL;
    }

    public void setLogoURL(String logoURL) {
        this.logoURL = logoURL;
    }

    public String getBeledeyiBaKan() {
        return beledeyiBaKan;
    }

    public void setBeledeyiBaKan(String beledeyiBaKan) {
        this.beledeyiBaKan = beledeyiBaKan;
    }

}
