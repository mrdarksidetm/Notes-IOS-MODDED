package ca;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzbi;
import com.google.android.gms.internal.p002firebaseauthapi.zzbo;
import com.google.android.gms.internal.p002firebaseauthapi.zzce;
import com.google.android.gms.internal.p002firebaseauthapi.zzkh;
import com.google.android.gms.internal.p002firebaseauthapi.zzkm;
import com.google.android.gms.internal.p002firebaseauthapi.zzma;
import com.google.android.gms.internal.p002firebaseauthapi.zzpg;
import com.google.android.gms.internal.p002firebaseauthapi.zzr;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class x1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static x1 f6775c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zzma f6777b;

    private x1(Context context, String str, boolean z10) {
        zzma zzmaVarZza;
        this.f6776a = str;
        try {
            zzkh.zza();
            zzma.zza zzaVarZza = new zzma.zza().zza(context, "GenericIdpKeyset", String.format("com.google.firebase.auth.api.crypto.%s", str)).zza(zzkm.zza);
            zzaVarZza.zza(String.format("android-keystore://firebear_master_key_id.%s", str));
            zzmaVarZza = zzaVarZza.zza();
        } catch (IOException | GeneralSecurityException e10) {
            Log.e("FirebearCryptoHelper", "Exception encountered during crypto setup:\n" + e10.getMessage());
            zzmaVarZza = null;
        }
        this.f6777b = zzmaVarZza;
    }

    public static x1 a(Context context, String str) {
        x1 x1Var = f6775c;
        if (x1Var == null || !zzr.zza(x1Var.f6776a, str)) {
            f6775c = new x1(context, str, true);
        }
        return f6775c;
    }

    public final String b() {
        if (this.f6777b == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to get Public key");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        zzce zzceVarZza = zzbi.zza(byteArrayOutputStream);
        try {
            synchronized (this.f6777b) {
                this.f6777b.zza().zza().zza(zzceVarZza);
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 8);
        } catch (IOException | GeneralSecurityException e10) {
            Log.e("FirebearCryptoHelper", "Exception encountered when attempting to get Public Key:\n" + e10.getMessage());
            return null;
        }
    }

    public final String c(String str) {
        String str2;
        zzma zzmaVar = this.f6777b;
        if (zzmaVar == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to decrypt payload");
            return null;
        }
        try {
            synchronized (zzmaVar) {
                str2 = new String(((zzbo) this.f6777b.zza().zza(zzpg.zza(), zzbo.class)).zza(Base64.decode(str, 8), null), "UTF-8");
            }
            return str2;
        } catch (UnsupportedEncodingException | GeneralSecurityException e10) {
            Log.e("FirebearCryptoHelper", "Exception encountered while decrypting bytes:\n" + e10.getMessage());
            return null;
        }
    }
}
