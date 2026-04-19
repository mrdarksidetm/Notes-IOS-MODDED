package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import ba.o0;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    public static class a extends x8.a {
        public static final Parcelable.Creator<a> CREATOR = new f();

        a() {
        }

        public static a u() {
            return new a();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            x8.c.b(parcel, x8.c.a(parcel));
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.auth.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC0181b {
        private static final z8.a zza = new z8.a("PhoneAuthProvider", new String[0]);

        public void onCodeAutoRetrievalTimeOut(String str) {
            zza.e("Sms auto retrieval timed-out.", new Object[0]);
        }

        public void onCodeSent(String str, a aVar) {
        }

        public abstract void onVerificationCompleted(o0 o0Var);

        public abstract void onVerificationFailed(x9.l lVar);
    }

    public static o0 a(String str, String str2) {
        return o0.B(str, str2);
    }

    public static void b(com.google.firebase.auth.a aVar) {
        w8.m.k(aVar);
        FirebaseAuth.i0(aVar);
    }
}
