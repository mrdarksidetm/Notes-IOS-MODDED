package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class DownloadStartRequest {
    private String contentDisposition;
    private long contentLength;
    private String mimeType;
    private String suggestedFilename;
    private String textEncodingName;
    private String url;
    private String userAgent;

    public DownloadStartRequest(String str, String str2, String str3, String str4, long j10, String str5, String str6) {
        this.url = str;
        this.userAgent = str2;
        this.contentDisposition = str3;
        this.mimeType = str4;
        this.contentLength = j10;
        this.suggestedFilename = str5;
        this.textEncodingName = str6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DownloadStartRequest downloadStartRequest = (DownloadStartRequest) obj;
        if (this.contentLength != downloadStartRequest.contentLength || !this.url.equals(downloadStartRequest.url) || !this.userAgent.equals(downloadStartRequest.userAgent) || !this.contentDisposition.equals(downloadStartRequest.contentDisposition) || !this.mimeType.equals(downloadStartRequest.mimeType)) {
            return false;
        }
        String str = this.suggestedFilename;
        if (str == null ? downloadStartRequest.suggestedFilename != null : !str.equals(downloadStartRequest.suggestedFilename)) {
            return false;
        }
        String str2 = this.textEncodingName;
        String str3 = downloadStartRequest.textEncodingName;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public String getContentDisposition() {
        return this.contentDisposition;
    }

    public long getContentLength() {
        return this.contentLength;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public String getSuggestedFilename() {
        return this.suggestedFilename;
    }

    public String getTextEncodingName() {
        return this.textEncodingName;
    }

    public String getUrl() {
        return this.url;
    }

    public String getUserAgent() {
        return this.userAgent;
    }

    public int hashCode() {
        int iHashCode = ((((((this.url.hashCode() * 31) + this.userAgent.hashCode()) * 31) + this.contentDisposition.hashCode()) * 31) + this.mimeType.hashCode()) * 31;
        long j10 = this.contentLength;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        String str = this.suggestedFilename;
        int iHashCode2 = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.textEncodingName;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public void setContentDisposition(String str) {
        this.contentDisposition = str;
    }

    public void setContentLength(long j10) {
        this.contentLength = j10;
    }

    public void setMimeType(String str) {
        this.mimeType = str;
    }

    public void setSuggestedFilename(String str) {
        this.suggestedFilename = str;
    }

    public void setTextEncodingName(String str) {
        this.textEncodingName = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setUserAgent(String str) {
        this.userAgent = str;
    }

    public Map<String, Object> toMap() {
        HashMap map = new HashMap();
        map.put("url", this.url);
        map.put("userAgent", this.userAgent);
        map.put("contentDisposition", this.contentDisposition);
        map.put("mimeType", this.mimeType);
        map.put("contentLength", Long.valueOf(this.contentLength));
        map.put("suggestedFilename", this.suggestedFilename);
        map.put("textEncodingName", this.textEncodingName);
        return map;
    }

    public String toString() {
        return "DownloadStartRequest{url='" + this.url + "', userAgent='" + this.userAgent + "', contentDisposition='" + this.contentDisposition + "', mimeType='" + this.mimeType + "', contentLength=" + this.contentLength + ", suggestedFilename='" + this.suggestedFilename + "', textEncodingName='" + this.textEncodingName + "'}";
    }
}
