package t0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class o1 extends a3 implements Parcelable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f20893c = new b(null);
    public static final Parcelable.Creator<o1> CREATOR = new a();

    public static final class a implements Parcelable.Creator<o1> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public o1 createFromParcel(Parcel parcel) {
            return new o1(parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public o1[] newArray(int i10) {
            return new o1[i10];
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(ae.j jVar) {
            this();
        }
    }

    public o1(float f10) {
        super(f10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(b());
    }
}
