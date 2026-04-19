package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.w;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class y implements Parcelable {
    public static final Parcelable.Creator<y> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ArrayList<String> f4283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ArrayList<String> f4284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    b[] f4285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f4286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f4287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    ArrayList<String> f4288f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ArrayList<c> f4289g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    ArrayList<w.l> f4290h;

    class a implements Parcelable.Creator<y> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public y createFromParcel(Parcel parcel) {
            return new y(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public y[] newArray(int i10) {
            return new y[i10];
        }
    }

    public y() {
        this.f4287e = null;
        this.f4288f = new ArrayList<>();
        this.f4289g = new ArrayList<>();
    }

    public y(Parcel parcel) {
        this.f4287e = null;
        this.f4288f = new ArrayList<>();
        this.f4289g = new ArrayList<>();
        this.f4283a = parcel.createStringArrayList();
        this.f4284b = parcel.createStringArrayList();
        this.f4285c = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f4286d = parcel.readInt();
        this.f4287e = parcel.readString();
        this.f4288f = parcel.createStringArrayList();
        this.f4289g = parcel.createTypedArrayList(c.CREATOR);
        this.f4290h = parcel.createTypedArrayList(w.l.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f4283a);
        parcel.writeStringList(this.f4284b);
        parcel.writeTypedArray(this.f4285c, i10);
        parcel.writeInt(this.f4286d);
        parcel.writeString(this.f4287e);
        parcel.writeStringList(this.f4288f);
        parcel.writeTypedList(this.f4289g);
        parcel.writeTypedList(this.f4290h);
    }
}
