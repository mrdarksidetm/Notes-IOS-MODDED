package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.d0;
import androidx.lifecycle.g;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int[] f3961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ArrayList<String> f3962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int[] f3963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int[] f3964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f3965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final String f3966f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f3967g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final int f3968h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final CharSequence f3969i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final int f3970j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final CharSequence f3971k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final ArrayList<String> f3972l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final ArrayList<String> f3973m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final boolean f3974n;

    class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    b(Parcel parcel) {
        this.f3961a = parcel.createIntArray();
        this.f3962b = parcel.createStringArrayList();
        this.f3963c = parcel.createIntArray();
        this.f3964d = parcel.createIntArray();
        this.f3965e = parcel.readInt();
        this.f3966f = parcel.readString();
        this.f3967g = parcel.readInt();
        this.f3968h = parcel.readInt();
        this.f3969i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3970j = parcel.readInt();
        this.f3971k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3972l = parcel.createStringArrayList();
        this.f3973m = parcel.createStringArrayList();
        this.f3974n = parcel.readInt() != 0;
    }

    b(androidx.fragment.app.a aVar) {
        int size = aVar.f3994c.size();
        this.f3961a = new int[size * 6];
        if (!aVar.f4000i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f3962b = new ArrayList<>(size);
        this.f3963c = new int[size];
        this.f3964d = new int[size];
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            d0.a aVar2 = aVar.f3994c.get(i10);
            int i12 = i11 + 1;
            this.f3961a[i11] = aVar2.f4011a;
            ArrayList<String> arrayList = this.f3962b;
            n nVar = aVar2.f4012b;
            arrayList.add(nVar != null ? nVar.mWho : null);
            int[] iArr = this.f3961a;
            int i13 = i12 + 1;
            iArr[i12] = aVar2.f4013c ? 1 : 0;
            int i14 = i13 + 1;
            iArr[i13] = aVar2.f4014d;
            int i15 = i14 + 1;
            iArr[i14] = aVar2.f4015e;
            int i16 = i15 + 1;
            iArr[i15] = aVar2.f4016f;
            iArr[i16] = aVar2.f4017g;
            this.f3963c[i10] = aVar2.f4018h.ordinal();
            this.f3964d[i10] = aVar2.f4019i.ordinal();
            i10++;
            i11 = i16 + 1;
        }
        this.f3965e = aVar.f3999h;
        this.f3966f = aVar.f4002k;
        this.f3967g = aVar.f3945v;
        this.f3968h = aVar.f4003l;
        this.f3969i = aVar.f4004m;
        this.f3970j = aVar.f4005n;
        this.f3971k = aVar.f4006o;
        this.f3972l = aVar.f4007p;
        this.f3973m = aVar.f4008q;
        this.f3974n = aVar.f4009r;
    }

    private void a(androidx.fragment.app.a aVar) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= this.f3961a.length) {
                aVar.f3999h = this.f3965e;
                aVar.f4002k = this.f3966f;
                aVar.f4000i = true;
                aVar.f4003l = this.f3968h;
                aVar.f4004m = this.f3969i;
                aVar.f4005n = this.f3970j;
                aVar.f4006o = this.f3971k;
                aVar.f4007p = this.f3972l;
                aVar.f4008q = this.f3973m;
                aVar.f4009r = this.f3974n;
                return;
            }
            d0.a aVar2 = new d0.a();
            int i12 = i10 + 1;
            aVar2.f4011a = this.f3961a[i10];
            if (w.J0(2)) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i11 + " base fragment #" + this.f3961a[i12]);
            }
            aVar2.f4018h = g.b.values()[this.f3963c[i11]];
            aVar2.f4019i = g.b.values()[this.f3964d[i11]];
            int[] iArr = this.f3961a;
            int i13 = i12 + 1;
            if (iArr[i12] == 0) {
                z10 = false;
            }
            aVar2.f4013c = z10;
            int i14 = i13 + 1;
            int i15 = iArr[i13];
            aVar2.f4014d = i15;
            int i16 = i14 + 1;
            int i17 = iArr[i14];
            aVar2.f4015e = i17;
            int i18 = i16 + 1;
            int i19 = iArr[i16];
            aVar2.f4016f = i19;
            int i20 = iArr[i18];
            aVar2.f4017g = i20;
            aVar.f3995d = i15;
            aVar.f3996e = i17;
            aVar.f3997f = i19;
            aVar.f3998g = i20;
            aVar.e(aVar2);
            i11++;
            i10 = i18 + 1;
        }
    }

    public androidx.fragment.app.a b(w wVar) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(wVar);
        a(aVar);
        aVar.f3945v = this.f3967g;
        for (int i10 = 0; i10 < this.f3962b.size(); i10++) {
            String str = this.f3962b.get(i10);
            if (str != null) {
                aVar.f3994c.get(i10).f4012b = wVar.g0(str);
            }
        }
        aVar.n(1);
        return aVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f3961a);
        parcel.writeStringList(this.f3962b);
        parcel.writeIntArray(this.f3963c);
        parcel.writeIntArray(this.f3964d);
        parcel.writeInt(this.f3965e);
        parcel.writeString(this.f3966f);
        parcel.writeInt(this.f3967g);
        parcel.writeInt(this.f3968h);
        TextUtils.writeToParcel(this.f3969i, parcel, 0);
        parcel.writeInt(this.f3970j);
        TextUtils.writeToParcel(this.f3971k, parcel, 0);
        parcel.writeStringList(this.f3972l);
        parcel.writeStringList(this.f3973m);
        parcel.writeInt(this.f3974n ? 1 : 0);
    }
}
