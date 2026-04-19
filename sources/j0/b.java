package j0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
final class b implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f13611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0318b f13610b = new C0318b(null);
    public static final Parcelable.Creator<b> CREATOR = new a();

    public static final class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    /* JADX INFO: renamed from: j0.b$b, reason: collision with other inner class name */
    public static final class C0318b {
        private C0318b() {
        }

        public /* synthetic */ C0318b(ae.j jVar) {
            this();
        }
    }

    public b(int i10) {
        this.f13611a = i10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f13611a == ((b) obj).f13611a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f13611a);
    }

    public String toString() {
        return "DefaultLazyKey(index=" + this.f13611a + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f13611a);
    }
}
