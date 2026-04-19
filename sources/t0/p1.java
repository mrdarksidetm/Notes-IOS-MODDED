package t0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class p1 extends b3 implements Parcelable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f20899c = new b(null);
    public static final Parcelable.Creator<p1> CREATOR = new a();

    public static final class a implements Parcelable.Creator<p1> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p1 createFromParcel(Parcel parcel) {
            return new p1(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public p1[] newArray(int i10) {
            return new p1[i10];
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(ae.j jVar) {
            this();
        }
    }

    public p1(int i10) {
        super(i10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(e());
    }
}
