
package com.final;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Ilcedatum {

    @SerializedName("IlceAdi")
    @Expose
    private String ilceAdi;
    @SerializedName("LogoURL")
    @Expose
    private String logoURL;
    @SerializedName("BeledeyiBaskani")
    @Expose
    private String beledeyiBaskani;
    @SerializedName("Durum")
    @Expose
    private String durum;

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

    public String getBeledeyiBaskani() {
        return beledeyiBaskani;
    }

    public void setBeledeyiBaskani(String beledeyiBaskani) {
        this.beledeyiBaskani = beledeyiBaskani;
    }

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }

}
