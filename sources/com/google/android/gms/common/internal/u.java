package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: loaded from: classes.dex */
public final class u implements Parcelable.Creator {
    static void a(c cVar, Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.s(parcel, 1, cVar.f8568a);
        x8.c.s(parcel, 2, cVar.f8569b);
        x8.c.s(parcel, 3, cVar.f8570c);
        x8.c.C(parcel, 4, cVar.f8571d, false);
        x8.c.r(parcel, 5, cVar.f8572e, false);
        x8.c.F(parcel, 6, cVar.f8573f, i10, false);
        x8.c.j(parcel, 7, cVar.f8574g, false);
        x8.c.A(parcel, 8, cVar.f8575h, i10, false);
        x8.c.F(parcel, 10, cVar.f8576i, i10, false);
        x8.c.F(parcel, 11, cVar.f8577j, i10, false);
        x8.c.g(parcel, 12, cVar.f8578k);
        x8.c.s(parcel, 13, cVar.f8579l);
        x8.c.g(parcel, 14, cVar.f8580m);
        x8.c.C(parcel, 15, cVar.zza(), false);
        x8.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        Scope[] scopeArr = c.f8566o;
        Bundle bundle = new Bundle();
        t8.d[] dVarArr = c.f8567p;
        t8.d[] dVarArr2 = dVarArr;
        String strP = null;
        IBinder iBinderC = null;
        Account account = null;
        String strP2 = null;
        int iD = 0;
        int iD2 = 0;
        int iD3 = 0;
        boolean zW = false;
        int iD4 = 0;
        boolean zW2 = false;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            switch (x8.b.v(iB)) {
                case 1:
                    iD = x8.b.D(parcel, iB);
                    break;
                case 2:
                    iD2 = x8.b.D(parcel, iB);
                    break;
                case 3:
                    iD3 = x8.b.D(parcel, iB);
                    break;
                case 4:
                    strP = x8.b.p(parcel, iB);
                    break;
                case 5:
                    iBinderC = x8.b.C(parcel, iB);
                    break;
                case 6:
                    scopeArr = (Scope[]) x8.b.s(parcel, iB, Scope.CREATOR);
                    break;
                case 7:
                    bundle = x8.b.f(parcel, iB);
                    break;
                case 8:
                    account = (Account) x8.b.o(parcel, iB, Account.CREATOR);
                    break;
                case 9:
                default:
                    x8.b.J(parcel, iB);
                    break;
                case 10:
                    dVarArr = (t8.d[]) x8.b.s(parcel, iB, t8.d.CREATOR);
                    break;
                case 11:
                    dVarArr2 = (t8.d[]) x8.b.s(parcel, iB, t8.d.CREATOR);
                    break;
                case 12:
                    zW = x8.b.w(parcel, iB);
                    break;
                case 13:
                    iD4 = x8.b.D(parcel, iB);
                    break;
                case 14:
                    zW2 = x8.b.w(parcel, iB);
                    break;
                case 15:
                    strP2 = x8.b.p(parcel, iB);
                    break;
            }
        }
        x8.b.u(parcel, iK);
        return new c(iD, iD2, iD3, strP, iBinderC, scopeArr, bundle, account, dVarArr, dVarArr2, zW, iD4, zW2, strP2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new c[i10];
    }
}
