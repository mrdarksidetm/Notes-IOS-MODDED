package t0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class q1 extends c3 implements Parcelable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f20906c = new b(null);
    public static final Parcelable.Creator<q1> CREATOR = new a();

    public static final class a implements Parcelable.Creator<q1> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public q1 createFromParcel(Parcel parcel) {
            return new q1(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public q1[] newArray(int i10) {
            return new q1[i10];
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(ae.j jVar) {
            this();
        }
    }

    public q1(long j10) {
        super(j10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(a());
    }
}
