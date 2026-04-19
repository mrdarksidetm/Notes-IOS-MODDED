package com.google.android.recaptcha.internal;

import ae.r;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import md.i0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzee implements InvocationHandler {
    private final Object zza;

    public zzee(Object obj) {
        this.zza = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2;
        if (r.b(method.getName(), "toString") && method.getParameterTypes().length == 0) {
            return "Proxy@".concat(String.valueOf(Integer.toHexString(obj.hashCode())));
        }
        if (r.b(method.getName(), "hashCode") && method.getParameterTypes().length == 0) {
            return Integer.valueOf(System.identityHashCode(obj));
        }
        if (r.b(method.getName(), "equals") && method.getParameterTypes().length != 0) {
            boolean z10 = false;
            if (objArr != null && objArr.length != 0) {
                Object obj3 = objArr[0];
                if ((obj3 != null ? obj3.hashCode() : 0) == obj.hashCode()) {
                    z10 = true;
                }
            }
            return Boolean.valueOf(z10);
        }
        if (!zza(obj, method, objArr)) {
            return i0.f15558a;
        }
        if ((this.zza == null && r.b(method.getReturnType(), Void.TYPE)) || ((obj2 = this.zza) != null && r.b(zzie.zza(obj2.getClass()), zzie.zza(method.getReturnType())))) {
            Object obj4 = this.zza;
            return obj4 == null ? i0.f15558a : obj4;
        }
        throw new IllegalArgumentException(this.zza + " cannot be returned from method with return type " + method.getReturnType());
    }

    public abstract boolean zza(Object obj, Method method, Object[] objArr);
}
