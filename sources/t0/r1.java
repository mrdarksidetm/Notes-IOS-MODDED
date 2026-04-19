package t0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class r1<T> extends d3<T> implements Parcelable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f20911d = new b(null);
    public static final Parcelable.Creator<r1<Object>> CREATOR = new a();

    public static final class a implements Parcelable.ClassLoaderCreator<r1<Object>> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public r1<Object> createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public r1<Object> createFromParcel(Parcel parcel, ClassLoader classLoader) {
            e3 e3VarK;
            if (classLoader == null) {
                classLoader = a.class.getClassLoader();
            }
            Object value = parcel.readValue(classLoader);
            int i10 = parcel.readInt();
            if (i10 == 0) {
                e3VarK = f3.k();
            } else if (i10 == 1) {
                e3VarK = f3.q();
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("Unsupported MutableState policy " + i10 + " was restored");
                }
                e3VarK = f3.n();
            }
            return new r1<>(value, e3VarK);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public r1<Object>[] newArray(int i10) {
            return new r1[i10];
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(ae.j jVar) {
            this();
        }
    }

    public r1(T t10, e3<T> e3Var) {
        super(t10, e3Var);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11;
        parcel.writeValue(getValue());
        e3<T> e3VarD = d();
        if (ae.r.b(e3VarD, f3.k())) {
            i11 = 0;
        } else if (ae.r.b(e3VarD, f3.q())) {
            i11 = 1;
        } else {
            if (!ae.r.b(e3VarD, f3.n())) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i11 = 2;
        }
        parcel.writeInt(i11);
    }
}
