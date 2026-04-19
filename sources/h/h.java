package h;

import ae.j;
import ae.r;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IntentSender f11580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Intent f11581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f11582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f11583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f11579e = new c(null);
    public static final Parcelable.Creator<h> CREATOR = new b();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final IntentSender f11584a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Intent f11585b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f11586c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f11587d;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(PendingIntent pendingIntent) {
            r.f(pendingIntent, com.google.android.gms.common.internal.b.KEY_PENDING_INTENT);
            IntentSender intentSender = pendingIntent.getIntentSender();
            r.e(intentSender, "pendingIntent.intentSender");
            this(intentSender);
        }

        public a(IntentSender intentSender) {
            r.f(intentSender, "intentSender");
            this.f11584a = intentSender;
        }

        public final h a() {
            return new h(this.f11584a, this.f11585b, this.f11586c, this.f11587d);
        }

        public final a b(Intent intent) {
            this.f11585b = intent;
            return this;
        }

        public final a c(int i10, int i11) {
            this.f11587d = i10;
            this.f11586c = i11;
            return this;
        }
    }

    public static final class b implements Parcelable.Creator<h> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public h createFromParcel(Parcel parcel) {
            r.f(parcel, "inParcel");
            return new h(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public h[] newArray(int i10) {
            return new h[i10];
        }
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(j jVar) {
            this();
        }
    }

    public h(IntentSender intentSender, Intent intent, int i10, int i11) {
        r.f(intentSender, "intentSender");
        this.f11580a = intentSender;
        this.f11581b = intent;
        this.f11582c = i10;
        this.f11583d = i11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h(Parcel parcel) {
        r.f(parcel, "parcel");
        Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        r.c(parcelable);
        this((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
    }

    public final Intent a() {
        return this.f11581b;
    }

    public final int b() {
        return this.f11582c;
    }

    public final int d() {
        return this.f11583d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final IntentSender e() {
        return this.f11580a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        r.f(parcel, "dest");
        parcel.writeParcelable(this.f11580a, i10);
        parcel.writeParcelable(this.f11581b, i10);
        parcel.writeInt(this.f11582c);
        parcel.writeInt(this.f11583d);
    }
}
