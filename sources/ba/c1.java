package ba;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class c1 extends x8.a {
    public static final Parcelable.Creator<c1> CREATOR = new u1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f5556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f5557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f5558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f5559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Uri f5560e;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f5561a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Uri f5562b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f5563c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f5564d;

        public c1 a() {
            String str = this.f5561a;
            Uri uri = this.f5562b;
            return new c1(str, uri == null ? null : uri.toString(), this.f5563c, this.f5564d);
        }

        public a b(String str) {
            if (str == null) {
                this.f5563c = true;
            } else {
                this.f5561a = str;
            }
            return this;
        }

        public a c(Uri uri) {
            if (uri == null) {
                this.f5564d = true;
            } else {
                this.f5562b = uri;
            }
            return this;
        }
    }

    c1(String str, String str2, boolean z10, boolean z11) {
        this.f5556a = str;
        this.f5557b = str2;
        this.f5558c = z10;
        this.f5559d = z11;
        this.f5560e = TextUtils.isEmpty(str2) ? null : Uri.parse(str2);
    }

    public String k() {
        return this.f5556a;
    }

    public Uri u() {
        return this.f5560e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.C(parcel, 2, k(), false);
        x8.c.C(parcel, 3, this.f5557b, false);
        x8.c.g(parcel, 4, this.f5558c);
        x8.c.g(parcel, 5, this.f5559d);
        x8.c.b(parcel, iA);
    }

    public final boolean x() {
        return this.f5558c;
    }

    public final boolean z() {
        return this.f5559d;
    }

    public final String zza() {
        return this.f5557b;
    }
}
