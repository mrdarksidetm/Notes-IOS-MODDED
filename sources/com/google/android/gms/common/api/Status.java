package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import u8.h;
import w8.k;

/* JADX INFO: loaded from: classes.dex */
public final class Status extends x8.a implements h, ReflectedParcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f8392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PendingIntent f8394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final t8.b f8395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Status f8384e = new Status(-1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Status f8385f = new Status(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Status f8386g = new Status(14);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Status f8387h = new Status(8);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Status f8388i = new Status(15);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Status f8389j = new Status(16);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Status f8391l = new Status(17);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Status f8390k = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new g();

    public Status(int i10) {
        this(i10, (String) null);
    }

    public Status(int i10, String str) {
        this(i10, str, (PendingIntent) null);
    }

    public Status(int i10, String str, PendingIntent pendingIntent) {
        this(i10, str, pendingIntent, null);
    }

    Status(int i10, String str, PendingIntent pendingIntent, t8.b bVar) {
        this.f8392a = i10;
        this.f8393b = str;
        this.f8394c = pendingIntent;
        this.f8395d = bVar;
    }

    public Status(t8.b bVar, String str) {
        this(bVar, str, 17);
    }

    @Deprecated
    public Status(t8.b bVar, String str, int i10) {
        this(i10, str, bVar.z(), bVar);
    }

    public boolean A() {
        return this.f8394c != null;
    }

    public boolean B() {
        return this.f8392a <= 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f8392a == status.f8392a && k.b(this.f8393b, status.f8393b) && k.b(this.f8394c, status.f8394c) && k.b(this.f8395d, status.f8395d);
    }

    @Override // u8.h
    public Status getStatus() {
        return this;
    }

    public int hashCode() {
        return k.c(Integer.valueOf(this.f8392a), this.f8393b, this.f8394c, this.f8395d);
    }

    public String toString() {
        k.a aVarD = k.d(this);
        aVarD.a("statusCode", zza());
        aVarD.a("resolution", this.f8394c);
        return aVarD.toString();
    }

    public t8.b u() {
        return this.f8395d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.s(parcel, 1, x());
        x8.c.C(parcel, 2, z(), false);
        x8.c.A(parcel, 3, this.f8394c, i10, false);
        x8.c.A(parcel, 4, u(), i10, false);
        x8.c.b(parcel, iA);
    }

    @ResultIgnorabilityUnspecified
    public int x() {
        return this.f8392a;
    }

    public String z() {
        return this.f8393b;
    }

    public final String zza() {
        String str = this.f8393b;
        return str != null ? str : u8.a.a(this.f8392a);
    }
}
