package h;

import ae.j;
import ae.r;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f11554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Intent f11555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f11553c = new b(null);
    public static final Parcelable.Creator<a> CREATOR = new C0276a();

    /* JADX INFO: renamed from: h.a$a, reason: collision with other inner class name */
    public static final class C0276a implements Parcelable.Creator<a> {
        C0276a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            r.f(parcel, "parcel");
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(j jVar) {
            this();
        }

        public final String a(int i10) {
            return i10 != -1 ? i10 != 0 ? String.valueOf(i10) : "RESULT_CANCELED" : "RESULT_OK";
        }
    }

    public a(int i10, Intent intent) {
        this.f11554a = i10;
        this.f11555b = intent;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
        r.f(parcel, "parcel");
    }

    public final Intent a() {
        return this.f11555b;
    }

    public final int b() {
        return this.f11554a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + f11553c.a(this.f11554a) + ", data=" + this.f11555b + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        r.f(parcel, "dest");
        parcel.writeInt(this.f11554a);
        parcel.writeInt(this.f11555b == null ? 0 : 1);
        Intent intent = this.f11555b;
        if (intent != null) {
            intent.writeToParcel(parcel, i10);
        }
    }
}
