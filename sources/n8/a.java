package n8;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a extends x8.a {
    public static final Parcelable.Creator<a> CREATOR = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f15937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f15938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f15939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final GoogleSignInAccount f15940e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final PendingIntent f15941f;

    public a(String str, String str2, String str3, List<String> list, GoogleSignInAccount googleSignInAccount, PendingIntent pendingIntent) {
        this.f15936a = str;
        this.f15937b = str2;
        this.f15938c = str3;
        this.f15939d = (List) w8.m.k(list);
        this.f15941f = pendingIntent;
        this.f15940e = googleSignInAccount;
    }

    public String A() {
        return this.f15936a;
    }

    public GoogleSignInAccount B() {
        return this.f15940e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return w8.k.b(this.f15936a, aVar.f15936a) && w8.k.b(this.f15937b, aVar.f15937b) && w8.k.b(this.f15938c, aVar.f15938c) && w8.k.b(this.f15939d, aVar.f15939d) && w8.k.b(this.f15941f, aVar.f15941f) && w8.k.b(this.f15940e, aVar.f15940e);
    }

    public int hashCode() {
        return w8.k.c(this.f15936a, this.f15937b, this.f15938c, this.f15939d, this.f15941f, this.f15940e);
    }

    public String u() {
        return this.f15937b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.C(parcel, 1, A(), false);
        x8.c.C(parcel, 2, u(), false);
        x8.c.C(parcel, 3, this.f15938c, false);
        x8.c.E(parcel, 4, x(), false);
        x8.c.A(parcel, 5, B(), i10, false);
        x8.c.A(parcel, 6, z(), i10, false);
        x8.c.b(parcel, iA);
    }

    public List<String> x() {
        return this.f15939d;
    }

    public PendingIntent z() {
        return this.f15941f;
    }
}
