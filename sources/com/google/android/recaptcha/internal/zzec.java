package com.google.android.recaptcha.internal;

import com.amazon.a.a.o.b.f;
import java.util.ArrayList;
import le.n0;
import md.i0;
import md.u;
import nd.c0;
import qd.d;
import sd.j;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class zzec extends j implements p {
    final /* synthetic */ String[] zza;
    final /* synthetic */ zzed zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzec(String[] strArr, zzed zzedVar, String str, d dVar) {
        super(2, dVar);
        this.zza = strArr;
        this.zzb = zzedVar;
        this.zzc = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new zzec(this.zza, this.zzb, this.zzc, dVar);
    }

    @Override // zd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzec) create((n0) obj, (d) obj2)).invokeSuspend(i0.f15558a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        rd.d.e();
        u.b(obj);
        String[] strArr = this.zza;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("\"" + str + "\"");
        }
        this.zzb.zza.evaluateJavascript(this.zzc + "(" + c0.h0(arrayList, f.f7478a, null, null, 0, null, null, 62, null) + ")", null);
        return i0.f15558a;
    }
}
