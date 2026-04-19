package ca;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class a2 implements ba.g {
    public static final Parcelable.Creator<a2> CREATOR = new d2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f6606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Object> f6607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f6608d;

    public a2(String str, String str2, boolean z10) {
        w8.m.e(str);
        w8.m.e(str2);
        this.f6605a = str;
        this.f6606b = str2;
        this.f6607c = m0.d(str2);
        this.f6608d = z10;
    }

    public a2(boolean z10) {
        this.f6608d = z10;
        this.f6606b = null;
        this.f6605a = null;
        this.f6607c = null;
    }

    @Override // ba.g
    public final String c() {
        return this.f6605a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // ba.g
    public final Map<String, Object> getProfile() {
        return this.f6607c;
    }

    @Override // ba.g
    public final String j() {
        Map<String, Object> map;
        String str;
        if ("github.com".equals(this.f6605a)) {
            map = this.f6607c;
            str = "login";
        } else {
            if (!"twitter.com".equals(this.f6605a)) {
                return null;
            }
            map = this.f6607c;
            str = "screen_name";
        }
        return (String) map.get(str);
    }

    @Override // ba.g
    public final boolean v() {
        return this.f6608d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.C(parcel, 1, c(), false);
        x8.c.C(parcel, 2, this.f6606b, false);
        x8.c.g(parcel, 3, v());
        x8.c.b(parcel, iA);
    }
}
