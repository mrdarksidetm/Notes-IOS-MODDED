package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.g;

/* JADX INFO: loaded from: classes.dex */
final class a0 implements Parcelable {
    public static final Parcelable.Creator<a0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f3947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f3948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f3949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f3950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f3951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final String f3952f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final boolean f3953g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final boolean f3954h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final boolean f3955i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final boolean f3956j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final int f3957k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final String f3958l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final int f3959m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final boolean f3960n;

    class a implements Parcelable.Creator<a0> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a0 createFromParcel(Parcel parcel) {
            return new a0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a0[] newArray(int i10) {
            return new a0[i10];
        }
    }

    a0(Parcel parcel) {
        this.f3947a = parcel.readString();
        this.f3948b = parcel.readString();
        this.f3949c = parcel.readInt() != 0;
        this.f3950d = parcel.readInt();
        this.f3951e = parcel.readInt();
        this.f3952f = parcel.readString();
        this.f3953g = parcel.readInt() != 0;
        this.f3954h = parcel.readInt() != 0;
        this.f3955i = parcel.readInt() != 0;
        this.f3956j = parcel.readInt() != 0;
        this.f3957k = parcel.readInt();
        this.f3958l = parcel.readString();
        this.f3959m = parcel.readInt();
        this.f3960n = parcel.readInt() != 0;
    }

    a0(n nVar) {
        this.f3947a = nVar.getClass().getName();
        this.f3948b = nVar.mWho;
        this.f3949c = nVar.mFromLayout;
        this.f3950d = nVar.mFragmentId;
        this.f3951e = nVar.mContainerId;
        this.f3952f = nVar.mTag;
        this.f3953g = nVar.mRetainInstance;
        this.f3954h = nVar.mRemoving;
        this.f3955i = nVar.mDetached;
        this.f3956j = nVar.mHidden;
        this.f3957k = nVar.mMaxState.ordinal();
        this.f3958l = nVar.mTargetWho;
        this.f3959m = nVar.mTargetRequestCode;
        this.f3960n = nVar.mUserVisibleHint;
    }

    n a(s sVar, ClassLoader classLoader) {
        n nVarA = sVar.a(classLoader, this.f3947a);
        nVarA.mWho = this.f3948b;
        nVarA.mFromLayout = this.f3949c;
        nVarA.mRestored = true;
        nVarA.mFragmentId = this.f3950d;
        nVarA.mContainerId = this.f3951e;
        nVarA.mTag = this.f3952f;
        nVarA.mRetainInstance = this.f3953g;
        nVarA.mRemoving = this.f3954h;
        nVarA.mDetached = this.f3955i;
        nVarA.mHidden = this.f3956j;
        nVarA.mMaxState = g.b.values()[this.f3957k];
        nVarA.mTargetWho = this.f3958l;
        nVarA.mTargetRequestCode = this.f3959m;
        nVarA.mUserVisibleHint = this.f3960n;
        return nVarA;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f3947a);
        sb2.append(" (");
        sb2.append(this.f3948b);
        sb2.append(")}:");
        if (this.f3949c) {
            sb2.append(" fromLayout");
        }
        if (this.f3951e != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f3951e));
        }
        String str = this.f3952f;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(this.f3952f);
        }
        if (this.f3953g) {
            sb2.append(" retainInstance");
        }
        if (this.f3954h) {
            sb2.append(" removing");
        }
        if (this.f3955i) {
            sb2.append(" detached");
        }
        if (this.f3956j) {
            sb2.append(" hidden");
        }
        if (this.f3958l != null) {
            sb2.append(" targetWho=");
            sb2.append(this.f3958l);
            sb2.append(" targetRequestCode=");
            sb2.append(this.f3959m);
        }
        if (this.f3960n) {
            sb2.append(" userVisibleHint");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f3947a);
        parcel.writeString(this.f3948b);
        parcel.writeInt(this.f3949c ? 1 : 0);
        parcel.writeInt(this.f3950d);
        parcel.writeInt(this.f3951e);
        parcel.writeString(this.f3952f);
        parcel.writeInt(this.f3953g ? 1 : 0);
        parcel.writeInt(this.f3954h ? 1 : 0);
        parcel.writeInt(this.f3955i ? 1 : 0);
        parcel.writeInt(this.f3956j ? 1 : 0);
        parcel.writeInt(this.f3957k);
        parcel.writeString(this.f3958l);
        parcel.writeInt(this.f3959m);
        parcel.writeInt(this.f3960n ? 1 : 0);
    }
}
