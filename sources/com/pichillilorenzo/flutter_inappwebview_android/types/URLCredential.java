package com.pichillilorenzo.flutter_inappwebview_android.types;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class URLCredential {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private Long f9081id;
    private String password;
    private Long protectionSpaceId;
    private String username;

    public URLCredential(Long l10, String str, String str2, Long l11) {
        this.f9081id = l10;
        this.username = str;
        this.password = str2;
        this.protectionSpaceId = l11;
    }

    public URLCredential(String str, String str2) {
        this.username = str;
        this.password = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        URLCredential uRLCredential = (URLCredential) obj;
        String str = this.username;
        if (str == null ? uRLCredential.username != null : !str.equals(uRLCredential.username)) {
            return false;
        }
        String str2 = this.password;
        String str3 = uRLCredential.password;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public Long getId() {
        return this.f9081id;
    }

    public String getPassword() {
        return this.password;
    }

    public Long getProtectionSpaceId() {
        return this.protectionSpaceId;
    }

    public String getUsername() {
        return this.username;
    }

    public int hashCode() {
        String str = this.username;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.password;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public void setId(Long l10) {
        this.f9081id = l10;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public void setProtectionSpaceId(Long l10) {
        this.protectionSpaceId = l10;
    }

    public void setUsername(String str) {
        this.username = str;
    }

    public Map<String, Object> toMap() {
        HashMap map = new HashMap();
        map.put(URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME, this.username);
        map.put(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD, this.password);
        map.put("certificates", null);
        map.put("persistence", null);
        return map;
    }

    public String toString() {
        return "URLCredential{username='" + this.username + "', password='" + this.password + "'}";
    }
}
