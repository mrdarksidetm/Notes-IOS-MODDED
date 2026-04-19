package t6;

import ae.r;
import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable;
import s6.f1;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PackageInfo f21269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21270b;

    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b createFromParcel(Parcel parcel) {
            r.f(parcel, f1.a("47251D6BAC2F"));
            return new b((PackageInfo) parcel.readParcelable(b.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(PackageInfo packageInfo, String str) {
        r.f(packageInfo, f1.a("47250C63A8244A688A1252"));
        r.f(str, f1.a("45210E7BA62D"));
        this.f21269a = packageInfo;
        this.f21270b = str;
    }

    public final PackageInfo a() {
        return this.f21269a;
    }

    public final String b() {
        return this.f21270b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return r.b(this.f21269a, bVar.f21269a) && r.b(this.f21270b, bVar.f21270b);
    }

    public int hashCode() {
        return this.f21270b.hashCode() + (this.f21269a.hashCode() * 31);
    }

    public String toString() {
        return f1.a("64311C78A020464E91077C4421441234F04A5A4E7F1B336F5590757C67CB") + this.f21269a + f1.b(f1.c("1B641D6DA830404FD9")) + this.f21270b + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        r.f(parcel, f1.a("58311B"));
        parcel.writeParcelable(this.f21269a, i10);
        parcel.writeString(this.f21270b);
    }
}
