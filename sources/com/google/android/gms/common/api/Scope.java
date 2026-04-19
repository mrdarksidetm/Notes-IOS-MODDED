package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import w8.m;

/* JADX INFO: loaded from: classes.dex */
public final class Scope extends x8.a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f8382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8383b;

    Scope(int i10, String str) {
        m.f(str, "scopeUri must not be null or empty");
        this.f8382a = i10;
        this.f8383b = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f8383b.equals(((Scope) obj).f8383b);
        }
        return false;
    }

    public int hashCode() {
        return this.f8383b.hashCode();
    }

    public String toString() {
        return this.f8383b;
    }

    public String u() {
        return this.f8383b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f8382a;
        int iA = x8.c.a(parcel);
        x8.c.s(parcel, 1, i11);
        x8.c.C(parcel, 2, u(), false);
        x8.c.b(parcel, iA);
    }
}
