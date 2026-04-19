package t8;

import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import w8.l0;
import w8.v0;

/* JADX INFO: loaded from: classes.dex */
abstract class x extends v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f21346a;

    protected x(byte[] bArr) {
        w8.m.a(bArr.length == 25);
        this.f21346a = Arrays.hashCode(bArr);
    }

    protected static byte[] b(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    abstract byte[] V();

    public final boolean equals(Object obj) {
        h9.a aVarZzd;
        if (obj != null && (obj instanceof l0)) {
            try {
                l0 l0Var = (l0) obj;
                if (l0Var.zzc() == this.f21346a && (aVarZzd = l0Var.zzd()) != null) {
                    return Arrays.equals(V(), (byte[]) h9.b.c(aVarZzd));
                }
                return false;
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f21346a;
    }

    @Override // w8.l0
    public final int zzc() {
        return this.f21346a;
    }

    @Override // w8.l0
    public final h9.a zzd() {
        return h9.b.f(V());
    }
}
